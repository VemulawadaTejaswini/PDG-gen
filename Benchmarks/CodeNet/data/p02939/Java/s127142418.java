import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        char[] s = scanner.next().toCharArray();
        char first = s[0];
        char second = 0;
        int n = s.length;
        int ans = 1;
        for(int i = 1; i < n; i++) {
            if (second == 0) {
                if (first == s[i]) {
                    if (i + 1 < n) {
                        second = s[i+1];
                        first = s[i];
                        ans++;
                        i++;
                    }
                    else {
                        //nothing
                    }
                }
                else {
                    first = s[i];
                    ans++;
                }
            }
            else {
                ans++;
                first = s[i];
                second = 0;
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
