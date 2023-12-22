import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            long sqsum = 0;
            for(int i=0 ; i<n ; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                sqsum += (long)a[i]*a[i];
            }

            int mod = 1_000_000_007;

            long ans = (sum*sum - sqsum)/2;
            
            ans %= mod;
            ans += mod;
            ans %= mod;

            pw.println(ans);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
    
    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException io) {
                    io.printStackTrace();
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
    }
}
