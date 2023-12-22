import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] p = new int[n];
            for(int i=0 ; i<n ; i++) {
                p[i] = sc.nextInt()-1;
            }
            int[] c = new int[n];
            for(int j=0 ; j<n ; j++) {
                c[j] = sc.nextInt();
            }

            long max = Long.MIN_VALUE;
            for(int i=0 ; i<n ; i++) {
                long curr = 0;
                long[] sum = new long[n];
                int[] dis = new int[n];
                boolean[] vis = new boolean[n];
                int x = k;
                while(x != 0) {
                    int next = p[i];
                    int steps = 0;
                    while(x != 0 && !vis[next]) {
                        sum[next] = curr;
                        curr += c[next];
                        dis[next] = steps;
                        vis[next] = true;
                        next = p[next];
                        max = Math.max(max, curr);
                        x--;
                        steps++;
                    }
                    if(x != 0) {
                        int clen = steps-dis[next];
                        int tcycle = x/clen;
                        long csum = curr - sum[next];
                        curr += csum*tcycle;
                        x %= clen;
                        max = Math.max(max, curr);

                        while(x != 0) {
                            curr += c[next];
                            next = p[next];
                            max = Math.max(max, curr);
                            x--;
                        }
                    }
                }
            }

            pw.println(max);
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
