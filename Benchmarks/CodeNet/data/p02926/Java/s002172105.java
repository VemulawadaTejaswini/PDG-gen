import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        P[] pts = new P[n];
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = scanner.nextInt(); y[i] = scanner.nextInt();
            pts[i] = new P(x[i], y[i]);
        }
        Arrays.sort(pts, (a,b)-> Double.compare(a.getAngle(), b.getAngle()));
        double ans = 0;
        for(int i = 0; i < n; i++) {
            double curx = 0; double cury = 0;
            boolean first = true;
            for(int j = (i +1)%n; j !=(i+1) % n || first; j = (j + 1) % n) {
                first = false;
                curx += x[j]; cury += y[j];
                ans = Math.max(ans,  Math.sqrt(curx * curx + cury * cury));
            }
        }
        out.println(ans);
        out.flush();
    }
    static class P{
        double x, y;
        public P (double xx, double yy) {
            x = xx; y = yy;
        }
        double getAngle() {
            return Math.atan(y/x);
        }
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
