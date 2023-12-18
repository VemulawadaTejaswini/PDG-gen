import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int h = in.ni(), w = in.ni(), k = in.ni();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            map[i] = in.ns().toCharArray();
        }
        long min = INF;
        String format = "%".concat(String.valueOf(h-1)).concat("s"), s;
        out: for (int i = 0; i < (1 << h-1); i++) {
            s = String.format(format, Integer.toString(i,2)).replace(' ', '0');
            long sum = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='1') sum++;
            }
            int[] num = new int[h];
            int step = 0;
            for (int j = 0; j < w; j++) {
                for (int l = 0; l < h; l++) {
                    if(map[l][j]=='1') num[l]++;
                }
                int a = 0;
                for (int l = 0; l < h; l++) {
                    a += num[l];
                    if(l==h-1||s.charAt(l)=='1'){
                        if(a>k){
                            if(step > 0){
                                sum++;
                                num = new int[h];
                                step = 0;
                                j--;
                                break;
                            }else{
                                continue out;
                            }
                        }
                        a = 0;
                    }
                }
                step++;
            }
            min = Math.min(min, sum);
        }
        out.println(min);
    }

    public static void main(String[] args) throws Exception{
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
        public long nl(){
            return Long.parseLong(ns());
        }
        public int ni(){
            return Integer.parseInt(ns());
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