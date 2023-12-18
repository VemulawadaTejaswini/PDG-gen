import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        TreeMap<Long, Integer> map = new TreeMap<>();
        int n = in.ni();
        for (int i = 0; i < n; i++) {
            long a = -in.nl();
            if(!map.containsKey(a)) map.put(a, 1);
            else map.replace(a, map.get(a)+1);
        }
        long edge1 = 0;
        long edge2 = 0;
        for(Long l: map.keySet()){
            if(edge1==0){
                if(map.get(l)>=2){
                    edge1 = l;
                    map.replace(l, map.get(l)-2);
                }
            }
            if(edge2==0){
                if(map.get(l)>=2){
                    edge2 = l;
                    map.replace(l, map.get(l)-2);
                }
            }
            if(edge1>0&&edge2>0) break;
        }
        out.println(edge1*edge2);
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