import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        long a = in.nl(), b = in.nl(), c = in.nl();
        if(a==0&&b==0||c==0&&b==0||a==0&&c==0){
            out.println("No");
        }else{
            out.println("Yes");
            StringBuilder sb =  new StringBuilder();
            for (int i = 0; i < n; i++) {
                String s = in.ns();
                if(s.equals("AB")){
                    if(a>0){
                        sb.append("B\n");
                        a--;
                        b++;
                    }else{
                        sb.append("A\n");
                        b--;
                        a++;
                    }
                }else if(s.equals("AC")){
                    if(a>0){
                        sb.append("C\n");
                        a--;
                        c++;
                    }else{
                        sb.append("A\n");
                        c--;
                        a++;
                    }
                }else if(s.equals("BC")){
                    if(b>0){
                        sb.append("C\n");
                        b--;
                        c++;
                    }else{
                        sb.append("B\n");
                        c--;
                        b++;
                    }
                }
            }
            out.print(sb.toString());
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