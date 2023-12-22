import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OneDalmatians {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        long n = fs.nextLong();
        StringBuilder ans = new StringBuilder();
        int MOD = 26;
        while(n > 0) {
            n--;
            ans.append('a' + n%MOD);
            n /= 26;
        }
        System.out.println(ans.reverse().toString());
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