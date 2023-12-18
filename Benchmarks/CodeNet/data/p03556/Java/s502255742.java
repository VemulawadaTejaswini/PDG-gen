import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        Solver s = new Solver();
        int test = 1;
        for (int i = 1; i <= test; i++) {
            s.solve(i, in, out);
        }
        out.close();
    }

    static class Solver {
        void solve(int test_case, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            out.println((long) Math.sqrt(n) * (long) Math.sqrt(n));
        }
    }

    static class InputReader {

        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
    }
}