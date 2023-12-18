import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        ArrayList<P> pts = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int xx = scanner.nextInt(), yy = scanner.nextInt();
            if (xx == 0 && yy == 0) continue;
            x.add(xx); y.add(yy);
            pts.add(new P(xx, yy));
        }
        n = pts.size();
        Collections.sort(pts);
        double ans = 0;
        for(int i = 0; i < n; i++) {
            double xx = 0.0; double yy = 0.0;
            for(int j = 0; j < n; j++) {
                int ind = (i + j) % n;
                P cur = pts.get(ind);
                xx += cur.x;
                yy += cur.y;
                ans = Math.max(ans, Math.hypot(xx,yy));
            }
        }
        out.printf("%.20f\n", ans);
        out.flush();
    }
    static class P implements Comparable<P>{
        double x, y;
        public P (double xx, double yy) {
            x = xx; y = yy;
        }
        public int compareTo(P o) {
            return Double.compare(Math.atan2(y,x), Math.atan2(o.y, o.x));
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
