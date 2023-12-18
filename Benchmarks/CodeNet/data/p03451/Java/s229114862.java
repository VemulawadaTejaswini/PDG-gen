import java.io.*;
import java.util.*;

public class Main {
    static MyScanner sc;
    private static PrintWriter out;
    static long M2 = 1_000_000_000L + 7;

    public static void main(String[] s) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();

//        stringBuilder.append("4 10 4 0 4 4 0 4 0 0");
//        stringBuilder.append("3 10\n" +
//                "3 1\n" +
//                "0 2\n" +
//                "5 3");
//        stringBuilder.append("110 2");
//        stringBuilder.append("3 5 1");
//        stringBuilder.append(" 5 1 1 5");
//        stringBuilder.append("10 10\n" +
//                "6 8\n" +
//                "3 10\n" +
//                "2 7\n" +
//                "1 7\n" +
//                "6 7\n" +
//                "4 10\n" +
//                "5 7\n" +
//                "2 9\n" +
//                "1 6\n" +
//                "2 5\n");
//        stringBuilder.append(100000 + " " + 1000000 + " ");
//        for (int l=0 ;l < 100000 ; l++) {
//            stringBuilder.append((l +1) + " " );
//        }

//        stringBuilder.append("5\n" +
//                "0 1 0 0 1\n" +
//                "0 0 1 0 0\n" +
//                "0 1 0 0 0\n" +
//                "0 0 1 1 0\n" +
//                "1 0 0 0 0");

        if (stringBuilder.length() == 0) {
            sc = new MyScanner(System.in);
        } else {
            sc = new MyScanner(new BufferedReader(new StringReader(stringBuilder.toString())));
        }


        out = new PrintWriter(new OutputStreamWriter(System.out));
        initData();
        solve();
        out.flush();
    }


    private static void initData() {

    }


    private static void solve() throws IOException {

        int n = sc.nextInt();
        int[] a1 = sc.na(n);
        int[] b1 = sc.na(n);

        long[] sum1 = new long[n];
        long[] sum2 = new long[n];
        sum1[0] = a1[0];
        sum2[n - 1] = b1[n - 1];
        for (int s = 1; s < n; s++) {
            sum1[s] = sum1[s - 1] + a1[s];
            sum2[n - s - 1] = sum2[n - s] + b1[n - s - 1];
        }
        long mm = 0;
        for (int l = 0 ; l < n ; l++) {
            mm = Math.max(mm, sum1[l] + sum2[l]);
        }
//        out.println(Arrays.toString(sum1));
//        out.println(Arrays.toString(sum2));
        out.println(mm);
     }

    static boolean bpm(boolean[][] bpGraph, int u, boolean seen[],
                       int matchR[]) {
        // Try every job one by one
        for (int v = 0; v < bpGraph.length; v++) {
            // If applicant u is interested in job v and v
            // is not visited
            if (bpGraph[u][v] && !seen[v]) {
                seen[v] = true; // Mark v as visited

                // If job 'v' is not assigned to an applicant OR
                // previously assigned applicant for job v (which
                // is matchR[v]) has an alternate job available.
                // Since v is marked as visited in the above line,
                // matchR[v] in the following recursive call will
                // not get job 'v' again
                if (matchR[v] < 0 || bpm(bpGraph, matchR[v],
                        seen, matchR)) {
                    matchR[v] = u;
                    return true;
                }
            }
        }
        return false;
    }

    // Returns maximum number of matching from M to N
    static int[] maxBPM(boolean[][] bpGraph) {
        // An array to keep track of the applicants assigned to
        // jobs. The value of matchR[i] is the applicant number
        // assigned to job i, the value -1 indicates nobody is
        // assigned.
        int matchR[] = new int[bpGraph.length];

        // Initially all jobs are available
        for (int i = 0; i < bpGraph.length; ++i)
            matchR[i] = -1;

        int result = 0; // Count of jobs assigned to applicants
        for (int u = 0; u < bpGraph.length; u++) {
            // Mark all jobs as not seen for next applicant.
            boolean seen[] = new boolean[bpGraph.length];
            for (int i = 0; i < bpGraph.length; ++i)
                seen[i] = false;

            // Find if the applicant 'u' can get a job
            if (bpm(bpGraph, u, seen, matchR))
                result++;
        }
        return matchR;
    }

    private static final int[][] mm(int[][] v1, int[][] v2) {
        int[][] res = new int[v1.length][v1.length];
        for (int s = 0; s < v1.length; s++)
            for (int s1 = 0; s1 < v1.length; s1++) {
                for (int k = 0; k < v1.length; k++) {
                    res[s1][s] += v1[k][s] * v2[s1][k];
                }
            }
        return res;
    }


    private static int ccw(int[] i1, int[] i2) {
        return ccw(i1, i2, new int[]{0, 0});
    }

    private static int ccw(int[] s1, int[] s2, int[] right) {
        long xa = s1[0] - right[0];
        long xb = s1[1] - right[1];
        long ya = s2[0] - right[0];
        long yb = s2[1] - right[1];
        return Long.compare(xb * ya, xa * yb);
    }


    private static void solveT() throws IOException {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    private static long gcd(long l, long l1) {
        if (l > l1) return gcd(l1, l);
        if (l == 0) return l1;
        return gcd(l1 % l, l);
    }

    private static long pow(long a, long b, long m) {
        if (b == 0) return 1;
        if (b == 1) return a;
        long pp = pow(a, b / 2, m);
        pp *= pp;
        pp %= m;
        return (pp * (b % 2 == 0 ? 1 : a)) % m;
    }


    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        MyScanner(BufferedReader br) {
            this.br = br;
        }

        public MyScanner(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        String next() {
            findToken();
            return st.nextToken();
        }

        Integer[] nab(int n) {
            Integer[] k = new Integer[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.fi();
            }
            return k;
        }

        int[] na(int n) {
            int[] k = new int[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.fi();
            }
            return k;
        }

        long[] nl(int n) {
            long[] k = new long[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.nextLong();
            }
            return k;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int fi() {
            String t = next();
            int cur = 0;
            boolean n = t.charAt(0) == '-';
            for (int a = n ? 1 : 0; a < t.length(); a++) {
                cur = cur * 10 + t.charAt(a) - '0';
            }
            return n ? -cur : cur;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }


}