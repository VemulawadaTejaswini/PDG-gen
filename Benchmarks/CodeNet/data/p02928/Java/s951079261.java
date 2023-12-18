import java.util.*;
import java.io.*;

public class Main {
    static final long mod = 1000000007;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        long k = scanner.nextInt();
        int[] cnt = new int[2001];
        long ans = 0;
        int[] arr = new int[n];
        for(int j = 0; j < n; j++) {
            int next = scanner.nextInt();
            arr[j] = next;
            cnt[next]++;
            for(int i = next+1; i < 2001; i++) {
                ans = (ans + k * cnt[i]) %mod;
            }
        }
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < arr[j]; i++) {
                ans = (ans + (((k * (k-1))/2) * cnt[i]))%mod;
            }
        }
        out.println(ans);
        out.flush();
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
