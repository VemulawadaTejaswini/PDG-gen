import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, true);
//        int t = in.nextInt();
//        while (t-- > 0)
        solve(in, out);
        out.close();
    }

    public static void solve(FastScanner in, PrintWriter out) {
        long X = in.nextLong();
        long A = ((long) Math.pow(X, 1 / 5.0));
        if (Math.pow(A, 5) == X) {
            out.println(A + " " + 0);
        } else if (Math.pow(A, 5) + 1 == X) {
            out.println(A + " " + (-1));
        } else if (Math.pow(A, 5) - 1 == X) {
            out.println(A + " " + 1);
        } else {
            long A1 = A;
            long B1 = 0;
            long B2 = 0;
            while (true) {
                if (Math.abs(Math.pow(A, 5) - Math.pow(B1, 5)) == X) {
                    out.println(A + " " + B1);
                    break;
                } else if (Math.abs(Math.pow(A1, 5) - Math.pow(B2, 5)) == X) {
                    out.println(A1 + " " + B2);
                    break;
                }
                B1 = ((long) (X - Math.pow(A, 5)));
                B2 = ((long) (X - Math.pow(A1, 5)));
                A--;
                A1++;
            }
        }
    }


    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            init();
        }

        public FastScanner(String name) {
            init(name);
        }

        public FastScanner(boolean isOnlineJudge) {
            if (!isOnlineJudge || System.getProperty("ONLINE_JUDGE") != null) {
                init();
            } else {
                init("input.txt");
            }
        }

        private void init() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        private void init(String name) {
            try {
                br = new BufferedReader(new FileReader(name));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }


        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }

    }

}



