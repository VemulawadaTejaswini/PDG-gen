import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            char[] s = sc.next().toCharArray();
            char[] c = sc.next().toCharArray();
            int n = s.length;
            int m = c.length;
            int min = Integer.MAX_VALUE;
            for(int i=0 ; i<n-m+1 ; i++) {
                int change = 0;
                for(int j=0 ; j<m ; j++) {
                    if(s[i+j] != c[j]) {
                        change++;
                    }
                }
                min = Math.min(change, min);
            }
            
            pw.println(min);
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
