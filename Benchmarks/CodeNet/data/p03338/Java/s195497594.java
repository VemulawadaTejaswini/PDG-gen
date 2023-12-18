import java.io.*;
import java.util.*;

public class Main {
    
    class Answer {
        int N;
        String str;
        
        public int solve() {
            StringBuilder sb1 = new StringBuilder(str);
            StringBuilder sb2 = new StringBuilder();
            
            int max = -1;
            for (int i = N-1; i >= 1; i--) {
                char ch = sb1.charAt(i);
                sb1.deleteCharAt(i);
                sb2.append(ch);
                max = Math.max(max, count(sb1, sb2));
            }
            
            return max;
        }
        
        private int count(StringBuilder sb1, StringBuilder sb2) {
            HashSet<Character> set = new HashSet<>();
            
            int count = 0;
            for (int i = 0; i < sb2.length(); i++) {
                if ( sb1.indexOf( String.valueOf(sb2.charAt(i)) ) >= 0 ) {
                    if ( set.add(sb2.charAt(i)) ) {
                        count++;
                    }
                }
            }
            
            return count;
        }
        
        public void main(FastScanner in, PrintWriter out) {
            N = in.nextInt();
            str = in.next();
            out.println( solve() );
        }
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        
        Main main = new Main();
        Answer ans = main.new Answer();
        ans.main(in, out);
        
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
        public String nextLine() {
            String str = "";
            try { str = br.readLine();
            } catch (IOException e) { e.printStackTrace(); }
            return str;
        }
        public void close() throws IOException { br.close(); }
    }
}
