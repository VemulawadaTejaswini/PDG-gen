import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        long[] a = new long[n];
        long sum = 0; 
        for(int i=0; i<n; i++) {
            a[i] = fs.nextLong();
            sum ^= a[i];
        }
        for(int i=0; i<n; i++) {
            System.out.print((sum^a[i]) + " ");
        }        
    }

    static class FastScanner {
        BufferedReader br = null;
        StringTokenizer st;
    
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
    
        String next() {
            while(st == null || !st.hasMoreElements()) {
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
    
        String nextLine() {
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