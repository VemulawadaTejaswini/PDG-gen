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
            int h = sc.nextInt();
            int w = sc.nextInt();
            int k = sc.nextInt();

            String[] c = new String[h];
            for (int i = 0; i < h; i++) {
                c[i] = sc.next();
            }
            String[][] cc = new String[w][h];

            for (int j = 0; j < h; j++) {
                for (int i = 0; i < w; i++) {

                    cc[i][j] = c[j].substring(i, i + 1);

                }
            }

            int ans = 0;
            for (int j = 0; j < Math.pow(2, h); j++) {
                for (int i = 0; i < Math.pow(2, w); i++) {
                    int count = 0;
                    for (int j1 = 0; j1 < h; j1++) {
                        for (int i1 = 0; i1 < w; i1++) {
                            if (((j >> j1) % 2 != 0) && ((i >> i1) % 2) != 0) {
                                if (cc[i1][j1].equals("#")) {
                                    count++;
                                }
                            }
                        }
                    }
                    if (count == k) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // int replace(String str) {
    // return str.length() - str.replace("#" + "", "").length();
    // }
}
