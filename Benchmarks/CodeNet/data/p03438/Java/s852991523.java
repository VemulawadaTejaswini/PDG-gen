import java.io.*;
import java.util.*;

public class Main {
    
    class Answer {
        int N, sumA, sumB;
        int[] arr, brr;
        
        public boolean solve() {
            if (sumA >= sumB) return false;
            
            PriorityQueue<Integer> low = new PriorityQueue<>();
            PriorityQueue<Integer> high = new PriorityQueue<>( (Integer a, Integer b) -> b.compareTo(a) );
            for (int i = 0; i < N; i++) {
                int diff = arr[i] - brr[i];
                if (diff < 0) {
                    low.add(diff);
                } else if (diff > 0) {
                    high.add(diff);
                }
            }
            
            if (low.isEmpty()) return false;
            if (high.isEmpty()) return true;
            
            while (high.size() > 1) {
                if (low.isEmpty()) return false;
                
                int l = low.poll() + 2;
                int h = high.poll() - 1;
                if (l < 0) low.add(l);
                if (h > 0) high.add(h);
            }
            
            return (low.peek() + high.peek() < 0);
        }
        
        public void main(FastScanner in, PrintWriter out) {
            N = in.nextInt();
            arr = new int[N];
            brr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
                sumA += arr[i];
            }
            for (int i = 0; i < N; i++) {
                brr[i] = in.nextInt();
                sumB += brr[i];
            }
            out.println(solve() ? "Yes" : "No");
        }
        
        public void p(Object o) { System.out.print(o); }
        public void pl(Object o) { System.out.println(o); }
        public void arp(int[] o) { pl( Arrays.toString(o) ); }
        public void arpp(int[][] o) { 
            for (int i = 0; i < o.length; i++) {
                for (int j = 0; j < o[0].length; j++) { p(o[i][j] + " "); }
                pl("");
            }
        }
        public void ck(Object o1, Object o2) { pl(o1 + " " + o2); }
        public void ckk(Object o1, Object o2, Object o3) { pl(o1 + " " + o2 + " " + o3); }
        public void ckkk(Object o1, Object o2, Object o3, Object o4) { 
            pl(o1 + " " + o2 + " " + o3 + " " + o4);
        }
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        
        Main problem = new Main();
        Answer ans = problem.new Answer();
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