import java.io.*;
import java.util.*;


public class Main {
    int N;
    int[][] items;

    int solve() {
        if (N < 2) {
            int max = 0;
            for (int j = 0; j < 3; j++) {
                max = Math.max(max, items[0][j]);
            }
            return max;
        }

        int max = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                int m = 0;
                for (int col = 0; col < 3; col++) {
                    if (j != col) {
                        m = Math.max(m, items[i-1][col]);
                    }
                }
                items[i][j] += m;
                max = Math.max(max, items[i][j]);
            }
        }
        return max;
    }

    void main(FastScanner in, PrintWriter out) {
        N = in.nextInt();
        items = new int[N][3];

        for (int i = 0; i < N; i++) {
            items[i][0] = in.nextInt();
            items[i][1] = in.nextInt();
            items[i][2] = in.nextInt();
        }
        out.println( solve() );
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Main m = new Main();
        m.main(in, out);
        out.close();
        in.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream in) { br = new BufferedReader(new InputStreamReader(in)); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        public String nextLine() {
            String str = "";
            try { str = br.readLine();
            } catch (IOException e) { e.printStackTrace(); }
            return str;
        }
        public void close() throws IOException { br.close(); }
    }
}