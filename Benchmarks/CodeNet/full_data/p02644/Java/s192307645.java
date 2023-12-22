import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    private static final long MODULO = (long) (1e9 + 7);
    private static final int INF = (int) 1e9;

    public static void main(String[] args) {
        BufferedScanner scanner = new BufferedScanner();
        PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

        int t = 1;//scanner.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int k = scanner.nextInt();
            int x1 = scanner.nextInt() - 1;
            int y1 = scanner.nextInt() - 1;
            int x2 = scanner.nextInt() - 1;
            int y2 = scanner.nextInt() - 1;
            String[] grid = new String[h];
            for (int i = 0; i < h; i++) {
                grid[i] = scanner.next();
            }
            TreeSetInt[] rows = new TreeSetInt[h];
            for (int i = 0; i < h; i++) {
                rows[i] = new TreeSetInt();
                for (int j = 0; j < w; j++) {
                    if (grid[i].charAt(j) != '@') {
                        rows[i].add(j);
                    }
                }
            }
            TreeSetInt[] cols = new TreeSetInt[w];
            for (int j = 0; j < w; j++) {
                cols[j] = new TreeSetInt();
                for (int i = 0; i < h; i++) {
                    if (grid[i].charAt(j) != '@') {
                        cols[j].add(i);
                    }
                }
            }
            int[][] rowPref = new int[h][w + 1];
            for (int i = 0; i < h; i++) {
                rowPref[i][0] = 0;
                for (int j = 0; j < w; j++) {
                    rowPref[i][j + 1] = rowPref[i][j] + (grid[i].charAt(j) == '@' ? 1 : 0);
                }
            }
            int[][] colPref = new int[w][h + 1];
            for (int j = 0; j < w; j++) {
                colPref[j][0] = 0;
                for (int i = 0; i < h; i++) {
                    colPref[j][i + 1] = colPref[j][i] + (grid[i].charAt(j) == '@' ? 1 : 0);
                }
            }
            int[][] shortest = new int[h][w];
            for (int i = 0; i < h; i++) {
                Arrays.fill(shortest[i], INF);
            }
            shortest[x1][y1] = 0;
            List<Pair> q = new ArrayList<>();
            q.add(Pair.of(x1, y1));
            rows[x1].remove(y1);
            cols[y1].remove(x1);
            int p = 0;
            while (p < q.size()) {
                int x = q.get(p).first;
                int y = q.get(p).second;
                p++;
                if (x == x2 && y == y2) {
                    break;
                }
                {
                    Iterator<Integer> it = rows[x].tailSet(y).iterator();
                    while (it.hasNext()) {
                        int yy = it.next();
                        if (y + k < yy || rowPref[x][y] != rowPref[x][yy + 1]) {
                            break;
                        }
                        q.add(Pair.of(x, yy));
                        shortest[x][yy] = shortest[x][y] + 1;
                        it.remove();
                        cols[yy].remove(x);
                    }
                }
                {
                    Iterator<Integer> it = rows[x].headSet(y, false).descendingIterator();
                    while (it.hasNext()) {
                        int yy = it.next();
                        if (yy + k < y || rowPref[x][yy] != rowPref[x][y + 1]) {
                            break;
                        }
                        q.add(Pair.of(x, yy));
                        shortest[x][yy] = shortest[x][y] + 1;
                        it.remove();
                        cols[yy].remove(x);
                    }
                }
                {
                    Iterator<Integer> it = cols[y].tailSet(y).iterator();
                    while (it.hasNext()) {
                        int xx = it.next();
                        if (x + k < xx || colPref[y][x] != colPref[y][xx + 1]) {
                            break;
                        }
                        q.add(Pair.of(xx, y));
                        shortest[xx][y] = shortest[x][y] + 1;
                        it.remove();
                        rows[xx].remove(y);
                    }
                }
                {
                    Iterator<Integer> it = cols[y].headSet(y, false).descendingIterator();
                    while (it.hasNext()) {
                        int xx = it.next();
                        if (xx + k < x || colPref[y][xx] != colPref[y][x + 1]) {
                            break;
                        }
                        q.add(Pair.of(xx, y));
                        shortest[xx][y] = shortest[x][y] + 1;
                        it.remove();
                        rows[xx].remove(y);
                    }
                }
            }
            writer.println(shortest[x2][y2] == INF ? -1 : shortest[x2][y2]);
        }

        scanner.close();
        writer.flush();
        writer.close();
    }

    static class Pair {
        int first, second;

        static Pair of(int f, int s) {
            Pair ans = new Pair();
            ans.first = f;
            ans.second = s;
            return ans;
        }
    }

    static class TreeSetInt extends TreeSet<Integer> {}

    static class ListInt extends ArrayList<Integer> {}

    public static class BufferedScanner {
        BufferedReader br;
        StringTokenizer st;

        public BufferedScanner(Reader reader) {
            br = new BufferedReader(reader);
        }

        public BufferedScanner() {
            this(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        void close() {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static long gcd(long a, long b) {
        if (a < b) {
            return gcd(b, a);
        }
        while (b > 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    static long inverse(long a, long m) {
        long[] ans = extgcd(a, m);
        return ans[0] == 1 ? (ans[1] + m) % m : -1;
    }

    private static long[] extgcd(long a, long m) {
        if (m == 0) {
            return new long[]{a, 1, 0};
        } else {
            long[] ans = extgcd(m, a % m);
            long tmp = ans[1];
            ans[1] = ans[2];
            ans[2] = tmp;
            ans[2] -= ans[1] * (a / m);
            return ans;
        }
    }

    static long add(long a, long b) {
        a += b;
        if (a >= MODULO) {
            a -= MODULO;
        }
        return a;
    }

    static long sub(long a, long b) {
        a -= b;
        if (a < 0) {
            a += MODULO;
        }
        return a;
    }

    static long mul(long a, long b) {
        return a * b % MODULO;
    }

    static long div(long a, long b) {
        return a * inverse(b, MODULO) % MODULO;
    }

    static class Comb {
        final long modulo;
        final long[] fac, fnv;

        Comb(int limit, long modulo) {
            fac = new long[limit + 1];
            fnv = new long[limit + 1];
            fac[0] = 1;
            fnv[0] = 1;
            for (int i = 1; i <= limit; i++) {
                fac[i] = mul(fac[i - 1], i);
                fnv[i] = div(fnv[i - 1], i);
            }
            this.modulo = modulo;
        }

        long c(int total, int choose) {
            if (total < choose) {
                return 0;
            }
            if (total == 0 || total == choose) {
                return 1;
            }
            return mul(mul(fac[total], fnv[choose]), fnv[total - choose]);
        }
    }

}
