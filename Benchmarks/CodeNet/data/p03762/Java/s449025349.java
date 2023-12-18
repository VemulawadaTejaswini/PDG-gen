//package com.company;


import java.io.*;
import java.util.*;


public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        F.solve(sc, pw);
        pw.close();
    }

    public static class A {
        static int n;
        static int[][] graph;
        public static void solve(MyScanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt(); graph = new int[n+2][n+2];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 1; j <= n; j++) {
                    graph[i+1][j] = s.charAt(j - 1) == 'o' ? 1 : 0;
                }
            }
            boolean t = true;
            int[] u = new int[]{0, 0, 1, -1};
            int[] d = new int[]{1, -1, 0, 0};
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int cnt = 0;
                    for (int k = 0; k < 4; k++) {
                        cnt += graph[i+u[k]][j+d[k]];
                    }
                    if (cnt % 2 != 0){
                        t = false;
                    }
                }
            }
            pw.print(t ? "YES" : "NO");
        }
    }

    public static class B {
        static int T;
        static int n;
        public static void solve(MyScanner sc, PrintWriter pw) throws IOException {
            T= sc.nextInt();
            while (T -- > 0) {
                n = sc.nextInt();
                pw.println(solve());
            }
        }
        public static long solve(){
            long res = 0;
            res += (long)n * (n + 1) / 2;
            for (int i = 0; i < 31; i++) {
                if ((1 << i) <= n) {
                    res -= (1 << i);
                    res -= (1 << i);
                }
            }
            return res;
        }
    }

    public static class C {
        static int n;
        public static void solve(MyScanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt();
            int eo = 0;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((j + eo) % 2 == 0) {
//                        pw.print('C');
                        cnt++;
                    } else {
//                        pw.print('.');
                    }
                }
                eo ++;

            }
            pw.println(cnt);
            eo = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((j + eo) % 2 == 0) {
                        pw.print('C');
//                        cnt++;
                    } else {
                        pw.print('.');
                    }

                }
                pw.println();
                eo++;
            }


        }
    }

    public static class D {
        static int n;
        static class Node{
            int idx; int root;
            List<Node> childs;
            Node(int id) {
                idx = id;
                childs = new ArrayList<>();
            }
        }
        static Node[] nodes;
        public static void solve(MyScanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt();
            nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node(i);
            }
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == -1) {
                    nodes[i].root = 1;
                } else {
                    nodes[a - 1].childs.add(nodes[i]);
                }
            }
            int max = 1;
            for (int i = 0; i < n; i++) {
                if (nodes[i].root == 1) {
                    max = Math.max(max, getHeight(nodes[i]));
                }
            }
            pw.println(max);
        }

        public static int getHeight(Node node) {
            if (node.childs.size() == 0) {
                return 1;
            } else {
                int m = 0;
                for (int i = 0; i < node.childs.size(); i++) {
                    m = Math.max(m, getHeight(node.childs.get(i)));
                }
                return m + 1;
            }
        }
    }

    public static class E {
        static int n, m, w;
        static long curadd;
        static long[] waterd;
        static long[] flo;
        public static void solve(MyScanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt();
            m = sc.nextInt();
            w = sc.nextInt();
            flo = new long[n];
            for (int i = 0; i < n; i++) {
                flo[i] = sc.nextLong();
            }
            pw.println(solve());
        }
        public static long solve(){
            long lo = 0, hi = Integer.MAX_VALUE;
            while (lo < hi){
                long mid = lo + ((hi - lo) >> 1);
                if (solve(mid)) {
                    if (lo == mid) break;
                    lo = mid;
                } else {
                    hi = mid;
                }
            }
            if (solve(lo)) return lo;
            else return lo - 1;
        }

        public static boolean solve(long minimum){
            waterd = new long[n];
            curadd = 0;
            long used = 0;
            for (int i = 0; i < n; i++) {
                if (i - w >= 0) curadd -= waterd[i - w];
                if (flo[i] + curadd >= minimum) continue;
                long ne = minimum - curadd - flo[i];
                used += ne;
                waterd[i] = ne;
                curadd += ne;
            }
            if (used <= m) return true;
            return false;
        }
    }


    public static class F {
        static int n, m;
        static long[] x;
        static long[] y;
        static long[] xs;
        static long[] ys;
        public static void solve(MyScanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt(); m = sc.nextInt();
            x = new long[n];
            y = new long[m];
            xs = new long[n - 1];
            ys = new long[m - 1];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }
            for (int i = 0; i < m; i++) {
                y[i] = sc.nextLong();
            }
            pw.println(solve());
        }

        public static long solve(){
            long sux = 0 ;
            for (int i = 0; i < n - 1; i++) {
                xs[i] = (x[i + 1] - x[i]) * (i + 1) * (n - i - 1); xs[i] %= mod;
                sux += xs[i]; sux %= mod;
            }
            long suy = 0;
            for (int i = 0; i < m - 1; i++) {
                ys[i] = (y[i + 1] - y[i]) * (i + 1) * (m - i - 1); ys[i] %= mod;
                suy += ys[i]; suy %= mod;
            }
            return sux * suy % mod;
        }

    }

    static class MyScanner {
        StringTokenizer st;
        BufferedReader br;

        public MyScanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}

        public MyScanner(FileReader s) throws FileNotFoundException {br = new BufferedReader(s);}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException { return Double.parseDouble(next()) ; }

        public boolean ready() throws IOException {return br.ready();}
    }
}