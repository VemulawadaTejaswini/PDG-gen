import java.io.*;
import java.util.*;
import java.util.function.Consumer;

public class Main {

    static int H, W;
    static char[][] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        while(true) {
            W = sc.nextInt();
            H = sc.nextInt();
            if( H == 0 ) break;

            C = new char[H][];
            for (int i = 0; i < H; i++) {
                C[i] = sc.next().toCharArray();
            }

            System.out.println(solve());
        }
    }

    static int solve() {
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if( C[h][w] == '*' ) {
                    deq.add( h*W + w );
                } else if( C[h][w] == 'o' ) {
                    deq.addFirst(h*W + w);
                }
            }
        }
        List<Integer> cords = new ArrayList<>(deq);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cords.size(); i++) {
            map.put(cords.get(i), i);
        }

        int[][] dist = new int[cords.size()][cords.size()];
        int[] q = new int[H*W];
        int[][] bfsDist = new int[H][W];
        for (int i = 0; i < cords.size(); i++) {
            for (int[] row : bfsDist) Arrays.fill(row, Integer.MAX_VALUE);
            int thw = cords.get(i);
            int th = thw/W, tw = thw%W;
            bfsDist[th][tw] = 0;

            int reach = 0;
            int u = 0, v = 0;
            q[v++] = th * W + tw;
            while( u != v ) {
                int hw = q[u++];
                int h = hw/W, w = hw%W;

                if( deq.contains(hw) ) {
                    dist[i][map.get(hw)] = bfsDist[h][w];
                    reach++;
                }

                for (int j = 0; j < 4; j++) {
                    int nh = h + DH[j], nw = w + DW[j];

                    if( inRange(nh, nw) && C[nh][nw] != 'x' && bfsDist[nh][nw] > bfsDist[h][w]+1 ) {
                        bfsDist[nh][nw] = bfsDist[h][w]+1;
                        q[v++] = nh*W + nw;
                    }
                }
            }

            if( reach != cords.size() ) return -1;
        }

        int[] P = new int[cords.size()-1];
        for (int i = 0; i < cords.size()-1; i++) {
            P[i] = i+1;
        }
        int[] ans = new int[1];
        ans[0] = Integer.MAX_VALUE;
        heapPermutation(P, P.length, p -> {
            int cost = 0;
            int prev = 0;
            for (int i = 0; i < P.length; i++) {
                cost += dist[prev][p[i]];
                prev = p[i];
            }

            ans[0] = Math.min(ans[0], cost);

        });
        return ans[0];
    }

    static void heapPermutation(int[] arr, int size, Consumer<int[]> c) {
        if (size == 1) {
            c.accept(arr);
        }

        for (int i = 0; i < size; i++) {
            heapPermutation(arr, size-1, c);

            if (size % 2 == 1) {
                int temp = arr[0];
                arr[0] = arr[size-1];
                arr[size-1] = temp;

            } else {
                int temp = arr[i];
                arr[i] = arr[size-1];
                arr[size-1] = temp;
            }
        }
    }

    static int[] DH = {0, 1, 0, -1};
    static int[] DW = {1, 0, -1, 0};

    static boolean inRange(int h, int w) {
        return 0 <= h && h < H && 0 <= w && w < W;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}

