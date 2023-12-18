import java.io.*;
import java.util.*;

public class Main {
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), m = in.ni();
        int[] x = in.ni(n);
        HashMap<Integer, Integer>[] map = new HashMap[m];
        for (int i = 0; i < m; i++) {
            map[i] = new HashMap<>();
        }
        for (int i = 0; i < n; i++) {
            int mod = x[i]%m;
            map[mod].put(x[i],(map[mod].containsKey(x[i])) ? map[mod].get(x[i])+1 : 1);
        }
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            for(Integer j: map[i].keySet()){
                arr[i][0] += map[i].get(j);
                arr[i][1] += map[i].get(j)/2;
            }
        }
        long ans = 0;
        for (int i = 0; i <= m/2; i++) {
            if(i==0||i*2==m) ans += arr[i][0]/2;
            else {
                if(arr[i][0]>=arr[m-i][0]){
                    ans += arr[m-i][0];
                    ans += Math.min(arr[i][1],(arr[i][0]-arr[m-i][0])/2);
                }else{
                    ans += arr[i][0];
                    ans += Math.min(arr[m-i][1],(arr[m-i][0]-arr[i][0])/2);
                }

            }
        }
        out.println(ans);
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