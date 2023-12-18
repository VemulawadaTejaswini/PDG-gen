import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[] a = in.ni(n);
        Arrays.sort(a);
        boolean flag = false;
        if(a[0]==0&&a[n-1]==0){
            flag = true;
        }else{
            if(n%3==0){
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    map.put(a[i],(map.containsKey(a[i])?map.get(a[i]+1):1));
                }
                if(map.size()==3){
                    flag = true;
                    int i = 0;
                    int a1=0,a2=0,a3=0;
                    for(Integer x: map.keySet()){
                        flag &= map.get(x)==n/3;
                        if(i==0) a1=x;
                        else if(i==1) a2=x;
                        else if(i==2) a3=x;
                        i++;
                    }
                    flag &= ((a1^a2)==a3)&&((a3^a2)==a1)&&((a1^a3)==a2);
                }
            }
        }
        out.println(flag?"Yes":"No");
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