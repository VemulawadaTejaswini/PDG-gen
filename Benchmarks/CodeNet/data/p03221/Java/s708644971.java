import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), m = in.ni();
        int[][] py = new int[m][2];
        Year[] year = new Year[n];
        for (int i = 0; i < n; i++) year[i] = new Year();
        for (int i = 0; i < m; i++) {
            int p = in.ni()-1,  y = in.ni();
            py[i][0] = p;
            py[i][1] = y;
            year[p].add(y);
        }
        for (Year a: year) Collections.sort(a);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int l = -1, r = year[py[i][0]].size(), mid = 0;
            while(true){
                mid = (l+r)/2;
                if(year[py[i][0]].get(mid)==py[i][1]) break;
                else if(year[py[i][0]].get(mid)<py[i][1]) l = mid;
                else r = mid;
            }
            sb.append(String.format("%06d", py[i][0]+1));
            sb.append(String.format("%06d", mid+1));
            sb.append('\n');
        }
        out.println(sb);
    }
    public static class Year extends ArrayList<Integer>{}

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