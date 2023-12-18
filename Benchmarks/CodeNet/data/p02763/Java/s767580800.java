//package Qe;

import java.io.*;
import java.util.*;


public class Main {
    private static FastScanner sc = new FastScanner(System.in);
    private static int readInt() {return sc.nextInt();}
    private static String readString() { return sc.nextLine(); }

    
    public static void main(String[] args) {
        int N = readInt();
        String S = readString();

        SegTree[] sts = new SegTree[26];
        for (int i = 0; i<sts.length; i++) {
            sts[i] = new SegTree(N);
        }

        for (int i=0; i<N; i++) {
            sts[S.charAt(i) - 'a'].add(i, 1);
        }

        int Q = readInt();

        char[] ca = S.toCharArray();
        for (int q=0; q<Q; q++) {
            
            String[] qry = readString().split(" ");

            switch (qry[0]) {
                case "1":
                    int I = Integer.parseInt(qry[1]) - 1;
                    char C = qry[2].charAt(0);
                    if (ca[I] != C) {
                        sts[ca[I] - 'a'].add(I, -1);
                        sts[C - 'a'].add(I, 1);
                        ca[I] = C;
                    }
                    break;
                case "2":
                    int L = Integer.parseInt(qry[1])-1;
                    int R = Integer.parseInt(qry[2]);
                    int ans = 0;
                    for (int i = 0; i<sts.length; i++) {
                        if (sts[i].sum(L, R) > 0) ans++;
                    }
                    System.out.println(ans);
                    break;
            }
        }
    }


    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String nextLine() {
            String res = "";
            try {
                res = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return res;
        }

        String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
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
    }

    static class SegTree {
        private long[] sg;
        private long[] sg2;
        private int sz;
        private int N;

        public SegTree(int N) {
            this.N = N;
            int sz = 1;
            while (sz < N) {
                sz <<= 1;
            }
            this.sz = sz;
            sg = new long[sz << 1];
            sg2 = new long[sz << 1];
        }

        void add(int i, int j, long X, int v, int l, int r) {
            if (r <= i || j <= l) {
                return;
            }
            if (i <= l && r <= j) {
                sg2[v] += X;
            } else {
                sg[v] += (Math.min(j, r) - Math.max(i, l)) * X;
                int m = (l + r) / 2;
                add(i, j, X, v * 2 + 1, l, m);
                add(i, j, X, v * 2 + 2, m, r);
            }
        }

        void add(int i, long X) {
            add(i, i+1, X, 0, 0, this.sz);
        }

        long sum(int i, int j, int v, int l, int r) {
            if (r <= i || j <= l) {
                return 0L;
            } else if (i <= l && r <= j) {
                return sg[v] + (r - l) * sg2[v];
            } else {
                long base = (Math.min(j, r) - Math.max(i, l)) * sg2[v];
                int m = (l + r) / 2;
                long vl = sum(i, j, v * 2 + 1, l, m);
                long vr = sum(i, j, v * 2 + 2, m, r);
                return base + vl + vr;
            }
        }

        long sum(int i, int j) {
            return sum(i, j, 0, 0, this.sz);
        }
    }
}