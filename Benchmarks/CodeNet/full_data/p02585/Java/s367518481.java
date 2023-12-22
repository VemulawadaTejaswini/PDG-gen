

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        IO io = new IO();
        int n = io.nextInt();
        int k = io.nextInt();

        int[] p = io.nIntA(n);
        int[] c = io.nIntA(n);

        int[] v = new int[n];

        Map<Integer, Map<Integer, long[]>> map = new HashMap<>();

        for (int i = 0; i < c.length; i++) {
            v[i] = c[p[i]-1];
        }

        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long[] score = find(i,k,p,c,v, map);
            max = Math.max(score[0], max);
            max = Math.max(score[1], max);
        }

        io.write(max);
    }
    
    private static long[] find(int i, int k, int[] p, int[] c, int[] v,
     Map<Integer, Map<Integer, long[]>> map) {
        if (k == 1) {
            return new long[] {v[i], v[i]};
        }

        if (map.containsKey(i) && map.get(i).containsKey(k)) {
            return map.get(i).get(k);
        }

        int nl = p[i] - 1;
        long[] score = find(nl, k - 1, p, c, v,map);
        long nscore = (long)score[0] + (long)v[i];
        long maxscore = Math.max(nscore, score[1]);
        long[] r = new long[] {nscore, maxscore};
        
        Map<Integer, long[]> m = map.getOrDefault(i, new HashMap<>());
        map.put(i, m);
        m.put(k, r);
        return r;
    }

    static class IO {
        BufferedWriter bw;
        BufferedReader br;
        StringTokenizer st;

        public IO() {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void write(String s) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }  
        }

        public void write(long value) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(int value) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(boolean b, String truev, String falsv) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(b ? truev : falsv);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(int[] a, char sep) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length; i++) {
                   sb.append(a[i]);
                   sb.append(sep);
                }
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(long[] a, char sep) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length; i++) {
                   sb.append(a[i]);
                   sb.append(sep);
                }
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
 
        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nIntA(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] nLongA(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public double[] nDoubleA(int n) {
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextDouble();
            }
            return a;
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
 
        public double nextDouble() {
            return Double.parseDouble(next());
        }
 
        public String nextLine() {
            String str = "";
            try{
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}