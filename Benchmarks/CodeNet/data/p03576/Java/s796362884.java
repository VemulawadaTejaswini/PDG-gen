import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long inf = Long.MAX_VALUE;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), k = in.ni();
        point[] px = new point[n];
        point[] py = new point[n];
        for(int i = 0; i < n; i++) {
            long x = in.nl(), y = in.nl();
            px[i] = new point(x, y, true);
            py[i] = new point(x, y, false);
        }
        Arrays.sort(px);
        Arrays.sort(py);
        long min = inf;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                long x1 = px[i].x, y1 = px[i].y;
                long x2 = px[j].x, y2 = px[j].y;
                if(k == 2){
                    min = Math.min(min, (x2-x1)*Math.abs(y1-y2));
                }else{
                    for(int s = 0; s < n; s++) {
                        long x3 = py[s].x, y3 = py[s].y;
                        if(x3<=x1||x3>=x2) continue;
                        if(k == 3){
                            min = Math.min(min, (x2-x1)*((Math.max(Math.max(y1, y2), y3))-Math.min(Math.min(y1,y2),y3)));
                        }else{
                            long y4;
                            int count = 3;
                            for(int t = s+1; t < n; t++) {
                                if(py[t].x<=x1||py[t].x>=x2) continue;
                                if(count == k-1){
                                    y4 = py[t].y;
                                    min = Math.min(min, (x2-x1)*(Math.max(Math.max(y1, y2), Math.max(y3, y4))-Math.min(Math.min(y1,y2),Math.min(y3, y4))));
                                }else{
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        out.println(min);
    }
    public static class point implements Comparable<point>{
        long x, y;
        boolean sort;
        public point(long x, long y, boolean sort){
            this.x = x;
            this.y = y;
            this.sort = sort;
        }
        @Override
        public int compareTo(point o) {
            if(this.sort){
                return (this.x>o.x)?1:-1;
            }else{
                return (this.y>o.y)?1:-1;
            }
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