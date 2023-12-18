import java.io.*;
import java.util.*;

public class Main {

    static class Question {
        int N, K;
        int[] arr;
        
        public int solve() {
            Arrays.sort(arr);
            int total = 0;
            for (int i = N-1; i >= N-K; i--) {
                total += arr[i];
            }
            return total;
        }
        
        public void main(FastScanner in, PrintWriter out) {
            N = in.nextInt();
            K = in.nextInt();
            arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = in.nextInt();
            out.println( solve() );
        }
        
        public void p(Object o) { System.out.print(o); }
        public void pl(Object o) { System.out.println(o); }
        public void arp(int[] o) { pl( Arrays.toString(o) ); }
        public void arpp(int[][] o) { 
            for (int i = 0; i < o.length; i++) {
                for (int j = 0; j < o[0].length; j++) p( o[i][j] + " " );
                pl("");
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
