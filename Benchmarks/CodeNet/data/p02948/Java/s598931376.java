import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/4;
    public static final int inf = Integer.MAX_VALUE/4;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), m = in.ni();
        PriorityQueue<Pair> que = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            que.add(new Pair(in.ni(), in.ni()));
        }
        PriorityQueue<Integer> que2 = new PriorityQueue<>();
        long ans = 0;
        for (int i = 1; i <= m; i++) {
            while(!que.isEmpty()&&que.peek().a<=i) que2.add(-que.poll().b);
            if(!que2.isEmpty()) ans -= que2.poll();
        }
        out.println(ans);
    }
    public static class Pair implements Comparable<Pair>{
        int a, b;
        public Pair(int x, int y){
            this.a = x; this.b = y;
        }
        @Override
        public int compareTo(Pair o) {
            return Integer.compare(a,o.a);
        }
    }

    public static void main(String[] args){
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
        out.close();
    }
    public static class InputReader{
        private BufferedReader br;
        private StringTokenizer st;
        public InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }
        public String ns(){
            if(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public Double nd(){
            return Double.parseDouble(ns());
        }
        public int[] ni(int n){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }
        public long[] nl(int n){
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nl();
            }
            return a;
        }
        public double[] nd(int n){
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nd();
            }
            return a;
        }
    }
}