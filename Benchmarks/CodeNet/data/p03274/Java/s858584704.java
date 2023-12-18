import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = in.nextIntArray(n);
        int firstNegIdx = -1;
        for (int i = 0; i < n; i++) {
            firstNegIdx = arr[i] < 0 ? i : firstNegIdx;
        }
        int firstPosIdx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                firstPosIdx = i;
                break;
            }
        }
        if (firstNegIdx == -1 && firstPosIdx == -1) {
            out.println(0);
        } else if (firstNegIdx == -1) {
            out.println(arr[k - 1]);
        } else if (firstPosIdx == -1) {
            out.println(-arr[n - k]);
        } else {
            int[] l = new int[firstNegIdx + 2];
            for (int i=1; i<l.length; i++) {
                l[i] = -arr[firstNegIdx - i + 1];
            }
            int[] r = new int[n - firstPosIdx + 1];
            for (int i=1; i<r.length; i++) {
                r[i] = arr[firstPosIdx + i - 1];
            }
            long res = Long.MAX_VALUE;
            for (int i = 0; i <= k; i++) {
                if (i <= l.length - 1 && k - i <= r.length - 1) {
                    long temp = Math.min(2 * l[i] + r[k - i], 2 * r[k - i] + l[i]);
                    res = temp < res ? temp : res;
                }
            }
            out.println(res);

        }


        out.close();
        //INT OVERFLOW -> USE LONG
        //ARR OUT OF BOUNDS
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public double[] nextDoubleArray(int n) {
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextDouble();
            }
            return arr;
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        public char[] nextCharArray(int n) {
            char[] arr = nextLine().trim().replaceAll("\\s", "").toCharArray();
            return arr;
        }

        public String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }
}

//    Set<Integer> all = new HashSet<>();
//            if (n - firstPosIdx >= k) {
//                all.add(arr[firstPosIdx + k - 1]);
//            }
//            if (firstNegIdx + 1 >= k) {
//                all.add(-arr[firstNegIdx - k + 1]);
//            }
//            long[] l = new long[firstNegIdx + 1 + 1];
//            for (int i = firstNegIdx; i >= 0; i--) {
//                l[firstNegIdx - i + 1] = l[firstNegIdx - i] - arr[i];
//            }
//            long[] r = new long[n - firstPosIdx + 1];
//            for (int i = firstPosIdx; i < n; i++) {
//                r[i - firstPosIdx + 1] = r[i - firstPosIdx] + arr[i];
//            }
