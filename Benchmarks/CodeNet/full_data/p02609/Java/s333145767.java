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
            int n = sc.nextInt();
            String x = sc.next();
            int popcount = 0;
            int pAns = 0;
            int mAns = 0;

            // int pAnsarr[] = new int[n];
            // int mAnsarr[] = new int[n];

            // pAnsarr[0]=1;
            // for (int i = 1; i < n; i++) {
            // pAnsarr[i]= % (popcount + 1);
            // }
            // for (int i = 1; i < n; i++) {
            // pAnsarr[i]= % (popcount + 1);
            // }

            for (int i = 0; i < n; i++) {
                if (x.substring(i, i + 1).equals("1")) {
                    popcount++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (x.substring(i, i + 1).equals("1")) {
                    pAns += Math.pow(2, n - i - 1) % (popcount + 1);
                    pAns %= (popcount + 1);
                }
            }
            if (popcount > 1) {
                for (int i = 0; i < n; i++) {
                    if (x.substring(i, i + 1).equals("1")) {
                        mAns += Math.pow(2, n - i - 1) % (popcount - 1);
                        mAns %= (popcount - 1);
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                int ans = 0;
                int count = 0;
                StringBuilder sb = new StringBuilder(x);
                if (x.substring(i, i + 1).equals("0")) {
                    ans = pAns;
                    ans += Math.pow(2, n - i - 1) % (popcount + 1);
                    ans %= (popcount + 1);
                } else {
                    if ((popcount - 1) == 0) {
                        System.out.println(0);
                        continue;
                    }
                    ans = mAns;
                    ans -= Math.pow(2, n - i - 1) % (popcount - 1);
                    ans += (popcount - 1);
                    ans %= (popcount - 1);
                }
                count++;
                while (true) {
                    if (ans == 0)
                        break;
                    ans %= Integer.bitCount(ans);
                    count++;
                }
                System.out.println(count);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
