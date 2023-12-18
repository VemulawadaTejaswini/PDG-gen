import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int r[][] = new int[2][3];

        for (int i=0;i<2;i++) {
            for (int j=0;j<3;j++) {
                r[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        ans = max_donguri(N, r[0], r[1]);
        ans = max_donguri(ans, r[1], r[0]);

        out.println(ans);
        out.flush();
    }

    public static int max_donguri(int N, int fr[], int to[]) {
        int max = N;

        int max_g = (fr[0] < to[0]) ? N / fr[0] : 0;

        for (int i=0;i<=max_g;i++) {
            int N2 = N - i * fr[0];
            int max_s = (fr[1] < to[1]) ? N2 / fr[1] : 0;

            for (int j=0;j<=max_s;j++) {
                int N3 = N2 - j * fr[1];
                int max_b = (fr[2] < to[2]) ? N3 / fr[2] : 0;

                {
                    int k = max_b;
                    int N4 = N3 - k * fr[2];

                    // store B
                    int _N = N4 + i * to[0] + j * to[1] + k * to[2];
                    max = Math.max(max, _N);
                }
            }
        }

        return max;
    }

    public static int get(int N, int a, int b) {
        if (a < b) {
            return N / a * b + N % a;
        } else {
            return N / b * a + N % b;
        }
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
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
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }

        int[] nextIntArray(int N) {
            int a[] = new int[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextInt();
            }

            return a;
        }

        long[] nextLongArray(int N) {
            long a[] = new long[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextLong();
            }

            return a;
        }

        double[] nextDoubleArray(int N) {
            double a[] = new double[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextDouble();
            }

            return a;
        }

        String[] nextTokenArray(int N) {
            String a[] = new String[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextToken();
            }

            return a;
        }
    }
}