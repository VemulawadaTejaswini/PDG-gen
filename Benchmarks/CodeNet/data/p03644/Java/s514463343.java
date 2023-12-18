import java.io.*;
import java.util.*;

public class Main {

    static class Question {
        int N;

        public ArrayList<Integer> factors(int n) {
            ArrayList<Integer> f = new ArrayList<>();
            for (int x = 2; x*x <= n; x++) {
                while (n%x == 0) {
                    if (x % 2 == 0) f.add(x);
                    n /= x;
                }
            }
            if (n > 1 && n % 2 == 0) f.add(n);
            return f;
        }
        
        public int solve() {
            if (N == 1) return 1;
            
            int max = -1;
            int found = -1;
            for (int i = 2; i <= N; i += 2) {
                ArrayList<Integer> ret = factors(i);
                if (ret.size() > max) {
                    max = ret.size();
                    found = i;
                }
            }
            return found;
        }
        
        public void main(FastScanner in, PrintWriter out) {
            N = in.nextInt();
            out.println( solve() );
        }
        
        public void p(Object o) { System.out.print(o); }
        public void pl(Object o) { System.out.println(o); }
        public void arp(int[] o) { pl( Arrays.toString(o) ); }
        public void arpp(int[][] o) { 
            for (int i = 0; i < o.length; i++) {
                for (int j = 0; j < o[0].length; j++) { p( o[i][j] + " " ); } pl("");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Question q = new Question();
        q.main(in, out);
        out.close();
        in.close();
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream in) { br = new BufferedReader(new InputStreamReader(in)); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); } 
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        public void close() throws IOException { br.close(); }
    }
}
