import java.io.*;
import java.util.*;

public class Main {

    static int H;
    static int W;
    static int[][] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        A = new int[H][];
        for (int i = 0; i < H; i++) {
            A[i] = sc.nextIntArray(W);
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (Action action : solve()) {
            pw.println((action.h1+1) + " " + (action.w1+1) + " " + (action.h2+1) + " " + (action.w2+1));
        }
        pw.flush();
    }

    static List<Action> solve() {
        List<Action> ans = new ArrayList<>();
        for (int h = 0; h < H-1; h++) {
            for (int w = 0; w < W; w++) {
                if( A[h][w] % 2 == 1 ) {
                    A[h][w]--;
                    A[h+1][w]++;
                    ans.add(new Action(h, w, h+1, w));
                }
            }
        }
        for (int w = 0; w < W-1; w++) {
            if( A[H-1][w] % 2 == 1 ) {
                A[H-1][w]--;
                A[H-1][w+1]++;
                ans.add(new Action(H-1, w, H-1, w+1));
            }
        }
        return ans;
    }

    static class Action {
        int h1, w1;
        int h2, w2;

        public Action(int h1, int w1, int h2, int w2) {
            this.h1 = h1;
            this.w1 = w1;
            this.h2 = h2;
            this.w2 = w2;
        }
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
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
