import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        char[] S = scanner.next().toCharArray();
        int N = S.length;
        long ans = 0;
        char[] upd = new char[N];
        int p = 0;
        for(int i = 0; i < N; i++) {
            if (i < N-1 && S[i] == 'B' && S[i+1] == 'C') {
                upd[p++] = 'D';
                i++;
            }
            else upd[p++] = S[i];
        }
        long cnt = 0;
        for(int i = 0; i < p; i++) {
            if (upd[i] == 'B' || upd[i] == 'C') cnt = 0;
            else if (upd[i] == 'A') cnt++;
            else ans += cnt;
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
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
