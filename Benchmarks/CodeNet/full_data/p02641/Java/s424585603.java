import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int x = in.ni(), n = in.ni();
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int a = in.ni();
            if(a < x) small.add(-a);
            else if(a>x) large.add(a);
            else flag = false;
        }
        if(flag){
            out.println(x);
        }else{
            for (int i = 1; i <= 150; i++) {
                boolean f1 = true, f2 = true;
                for (int j = 0; j < small.size(); j++) {
                    if(-small.get(j)==x-i) {
                        f1 = false;
                    }
                }
                for (int j = 0; j < large.size(); j++) {
                    if(large.get(j)==x+i){
                        f2= false;
                    }
                }
                if(f1){
                    out.println(x-i);
                    break;
                }else if(f2){
                    out.println(x+i);
                    break;
                }
            }
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