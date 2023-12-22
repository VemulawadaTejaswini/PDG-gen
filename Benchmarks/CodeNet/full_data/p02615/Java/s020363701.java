import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
// import java.util.HashSet;
// import java.util.Set;
// import java.util.Map;
// import java.util.HashMap;

import java.math.*;

public class Main {
    private static Scanner sc;
    private static final long mod = 1000000007;

    public static void main(final String[] args) {
        final Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private static String getUpperAlpha(int i) {
        return String.valueOf((char) (i + 64));
    }

    /* i=1 return a */
    private static String getLowerAlpha(int i) {
        return String.valueOf((char) (i + 96));
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null)
                br.close();
        }

        public String next() throws IOException {
            if (i < s.length)
                return s[i++];
            String st = br.readLine();
            while (st == "")
                st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        public long[] nextLongArray(int n) throws NumberFormatException, IOException {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        public int[] nextIntArray(int n) throws NumberFormatException, IOException {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }
    }

    private void solve() {
        try {
            long sum = 0;
            int n = sc.nextInt();
            long[] a = sc.nextLongArray(n);
            if (n == 2) {
                System.out.println(a[0]);
                return;
            }
            Arrays.sort(a);
            // long min1 = Math.min(a[n - 1], a[n - 2]);
            // long min2 = Math.max(a[n - 1], a[n - 2]);
            // long min3;
            // sum = a[n - 1] + Math.min(a[n - 1], a[n - 2]);

            // if (a[n - 3] <= min1) {
            // min3 = min2;
            // min2 = min1;
            // min1 = a[n - 3];
            // } else if (a[n - 3] < min2) {
            // min3 = min2;
            // min2 = a[n - 3];
            // } else {
            // min3 = a[2];
            // }

            // for (int i = n - 4; i >= 0; i--) {
            // sum += min3;
            // if (a[i] <= min1) {
            // min3 = min2;
            // min2 = min1;
            // min1 = a[i];
            // } else if (a[i] < min2) {
            // min3 = min2;
            // min2 = a[i];
            // } else {
            // min3 = a[i];
            // }

            // }
            sum = a[n - 1];

            for (int i = 0; i < n - 2; i++) {
                // System.out.println(a[n - 2 - (i / 2)]);
                sum += a[n - 2 - (i / 2)];
            }

            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
