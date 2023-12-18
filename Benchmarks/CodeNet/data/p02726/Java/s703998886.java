import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), x = in.ni()-1, y = in.ni()-1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int[] dist = new int[n];
            Arrays.fill(dist,-1);
            ArrayDeque<Integer> que = new ArrayDeque<>();
            que.addFirst(i);
            dist[i] = 0;
            while(!que.isEmpty()){
                int a = que.pollLast();
                if(a-1>=0&&dist[a-1]==-1){
                    dist[a-1] = dist[a]+1;
                    que.addFirst(a-1);
                }
                if(a+1<n&&dist[a+1]==-1){
                    dist[a+1] = dist[a]+1;
                    que.addFirst(a+1);
                }
                if(a==x&&dist[y]==-1){
                    dist[y] = dist[a]+1;
                    que.addFirst(y);
                }else if(a==y&&dist[x]==-1){
                    dist[x] = dist[a]+1;
                    que.addFirst(x);
                }
            }
            for (int j = 0; j < n; j++) {
                ans[dist[j]]++;
            }
        }
        for (int i = 1; i < n; i++) {
            out.println(ans[i]/2);
        }
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