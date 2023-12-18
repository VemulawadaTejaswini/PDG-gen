import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;
    //agc016 b
    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[] a = in.ni(n);
        boolean flag = false;
        OUT:for (int i = 0; i <= 1; i++) {

            int kind = a[0]+i;
            int not_same = 0, same = 0;
            for (int j = 0; j < n; j++){
                if (kind == a[j]+1) not_same++;
                else if(kind == a[j]) same++;
                else continue OUT;
            }
            int res = kind-not_same;
            if(res==0&&same==0) flag = true;
            else if(res>0&&check(same, res)) flag = true;
            
            if(flag) break;
        }
        out.println(flag?"Yes":"No");
    }
    public static boolean check(int same, int res){
        return same-2*(res-1)>=2;
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