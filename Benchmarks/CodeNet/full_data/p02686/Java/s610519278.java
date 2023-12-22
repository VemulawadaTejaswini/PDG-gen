import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        Point[] p = new Point[n];
        for (int i = 0; i < n; i++) {
            char[] s = in.ns().toCharArray();
            int a = 0, b = 0;
            for (int j = 0; j < s.length; j++) {
                if(s[j]==')'){
                    if(b==0)a++;
                    else b--;
                }else if(s[j]=='('){
                    b++;
                }
            }
            p[i] = new Point(a, b);
        }
        Arrays.sort(p);
        boolean flag = true;
        int sum = 0;
        for(Point q: p){
            int a = q.x, b = q.y;
            sum -= a;
            flag &= sum>=0;
            sum += b;
            flag &= sum>=0;
        }
        if(flag)out.println("Yes");
        else out.println("No");
    }
    public static class Point implements Comparable<Point>{
        int x, y;
        public Point(int x, int y){
            this.x = x; this.y = y;
        }
        @Override
        public int compareTo(Point o) {
            return (o.y-o.x!=y-x)?Integer.compare(o.y-o.x, y-x):Integer.compare(y,o.y);
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