import java.io.*;
import java.util.*;

public class Main {

    static class Question {
        String str;
        int[] arr;
        
        public String solve() {
            int len = str.length();
            String first = str.charAt(0)+"";
            String last = str.charAt(len-1)+"";
            return first+(len-2)+last;
        }
        
        public void main(FastScanner in, PrintWriter out) {
            str = in.next();
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