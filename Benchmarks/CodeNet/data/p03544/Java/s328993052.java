import java.util.*;
import java.io.*;
public class Main {
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
            long[] l = new long[100];
            l[0] = 2;
            l[1] = 1;
            for (int i = 2; i < l.length; i++) {
                l[i] = l[i - 1] + l[i - 2];
            }
            int n = in.nextInt();
            out.println(l[n]);
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