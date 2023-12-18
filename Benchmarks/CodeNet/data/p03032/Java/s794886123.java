import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/4;
    public static final int inf = Integer.MAX_VALUE/4;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), k = in.ni();
        int[] v = in.ni(n);
        PriorityQueue<Integer> que;
        long max = 0, sum = 0, remove;
        for (int i = 0; i<=k && i<=n; i++) {
            for (int j = 0; j+i<=k && i+j<=n; j++) {
                sum = 0;
                que = new PriorityQueue<>();
                for (int l = 0; l < i; l++) {
                    sum += v[l];
                    if(v[l]<0) que.add(v[l]);
                }
                for (int l = n-1; l >=n-j ; l--) {
                    sum += v[l];
                    if(v[l]<0) que.add(v[l]);
                }
                remove = 0;
                while(!que.isEmpty() && remove+i+j<k){
                    sum -= que.poll();
                    remove++;
                }
                max = Math.max(max, sum);
            }
        }
        out.println(max);
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