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
            String s = in.next();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                a.add(s.charAt(i) - '0');
            }
            for (int i = 0; i <= 1; i++) {
                for (int j = 0; j <= 1; j++) {
                    for (int k = 0; k <= 1; k++) {
                        int sum = a.get(0);
                        if (i == 0) {
                            sum += a.get(1);
                        } else {
                            sum -= a.get(1);
                        }
                        if (j == 0) {
                            sum += a.get(2);
                        } else {
                            sum -= a.get(2);
                        }
                        if (k == 0) {
                            sum += a.get(3);
                        } else {
                            sum -= a.get(3);
                        }
                        if (sum == 7) {
                            out.print(a.get(0));
                            if (i == 0) out.print("+");
                            else out.print("-");
                            out.print(a.get(1));
                            if (j == 0) out.print("+");
                            else out.print("-");
                            out.print(a.get(2));
                            if (k == 0) out.print("+");
                            else out.print("-");
                            out.print(a.get(3));
                            out.print("=7");
                            return;
                        }
                    }
                }
            }
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