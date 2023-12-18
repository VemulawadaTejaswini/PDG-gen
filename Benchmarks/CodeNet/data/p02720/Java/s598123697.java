import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    public static ArrayList<Long> list;
    static void solve(InputReader in, PrintWriter out){
        list = new ArrayList<>();
        int k = in.ni();
        for (long i = 1; i <= 9; i++) {
            list.add(i);
            dfs(i);
        }
        Collections.sort(list);
        out.println(list.get(k-1));
    }
    public static void dfs(long x){
        if(x > 3234566667L) return;
        long f = x-x/10*10;
        list.add(10*x+f);
        dfs(10*x+f);
        if(f!=0){
            list.add(10*x+f-1);
            dfs(10*x+f-1);
        }
        if(f!=9){
            list.add(10*x+f+1);
            dfs(10*x+f+1);
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
        public double nd(){
            return Double.parseDouble(ns());
        }
        public char nc(){
            return ns().toCharArray()[0];
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