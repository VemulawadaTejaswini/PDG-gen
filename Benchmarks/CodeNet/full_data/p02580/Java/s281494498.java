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
            int height = sc.nextInt();
            int width = sc.nextInt();
            int m = sc.nextInt();

            int hmax = 0;
            Set<Integer> hmaxIdxSet = new HashSet<>();
            int wmax = 0;
            Set<Integer> wmaxIdxSet = new HashSet<>();

            Map<Integer, Set<Integer>> hmap = new HashMap<>();
            Map<Integer, Set<Integer>> wmap = new HashMap<>();
            for (int i = 0; i < m; i++) {
                int h = sc.nextInt();
                int w = sc.nextInt();
                Set<Integer> set;
                if (hmap.containsKey(h)) {
                    set = hmap.get(h);
                } else {
                    set = new HashSet<>();
                }
                set.add(w);
                if (set.size() > hmax) {
                    Set<Integer> newSet = new HashSet<>();
                    newSet.add(h);
                    hmaxIdxSet = newSet;
                    hmax = set.size();
                } else if (set.size() == hmax) {
                    hmaxIdxSet.add(h);
                }
                hmap.put(h, set);

                if (wmap.containsKey(w)) {
                    set = wmap.get(w);
                } else {
                    set = new HashSet<>();
                }
                set.add(h);
                if (set.size() > wmax) {
                    Set<Integer> newSet = new HashSet<>();
                    newSet.add(w);
                    wmaxIdxSet = newSet;
                    wmax = set.size();
                } else if (set.size() == wmax) {
                    wmaxIdxSet.add(w);
                }
                wmap.put(w, set);
            }

            // hmap.keySet().forEach(key -> {
            // System.out.println(key + ":" + hmap.get(key));
            // });
            for (int hidx : hmaxIdxSet) {
                for (int widx : wmaxIdxSet) {
                    if (!hmap.get(hidx).contains(widx)) {
                        System.out.println(hmax + wmax);
                        return;
                    }
                }
            }
            System.out.println(hmax + wmax - 1);

        } catch (

        Exception e) {
            e.printStackTrace();
        }

    }
}
