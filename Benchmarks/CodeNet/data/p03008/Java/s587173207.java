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
        long r[][] = new long[2][3];

        for (int i=0;i<2;i++) {
            for (int j=0;j<3;j++) {
                r[i][j] = sc.nextLong();
            }
        }

        long ans = N;
        ans = max_donguri(ans, r[0], r[1]);
        ans = max_donguri(ans, r[1], r[0]);

        out.println(ans);
        out.flush();
    }

    public static long max_donguri(long N, long fr[], long to[]) {
        long max = N;

        int idx[];
        if (fr[0] >= fr[1] && fr[1] >= fr[2]) {
            idx = new int[] {0, 1, 2};
        } else if (fr[0] >= fr[2] && fr[2] >= fr[1]) {
            idx = new int[] {0, 2, 1};
        } else if (fr[1] >= fr[0] && fr[0] >= fr[2]) {
            idx = new int[] {1, 0, 2};
        } else if (fr[1] >= fr[2] && fr[2] >= fr[0]) {
            idx = new int[] {1, 2, 0};
        } else if (fr[2] >= fr[0] && fr[0] >= fr[1]) {
            idx = new int[] {2, 0, 1};
        } else {
            idx = new int[] {2, 1, 0};
        }

        long max_g = (fr[idx[0]] < to[idx[0]]) ? N / fr[idx[0]] : 0;

        for (int i=0;i<=max_g;i++) {
            long N2 = N - i * fr[idx[0]];
            long max_s = (fr[idx[1]] < to[idx[1]]) ? N2 / fr[idx[1]] : 0;

            for (int j=0;j<=max_s;j++) {
                long N3 = N2 - j * fr[idx[1]];
                long max_b = (fr[idx[2]] < to[idx[2]]) ? N3 / fr[idx[2]] : 0;

                {
                    long k = max_b;
                    long N4 = N3 - k * fr[idx[2]];

                    // store B
                    long _N = N4 + i * to[idx[0]] + j * to[idx[1]] + k * to[idx[2]];
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