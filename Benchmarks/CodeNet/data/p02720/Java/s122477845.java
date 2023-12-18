import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    // this should be DP Frog.
    // we aslo can use queue
    // Lunlun Number abcde
    // we can build from abcd

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        useQueue();
        //useDP();
    }
    public static void useDP() throws IOException {
        int K = nextInt();
        
        long dp[] = new long[3*K+1]; //max
   
        for (int x=1; x<10; x++) {
            dp[x] = x;
        }

        int index = 10;
        for (int x=1; x<=K; x++) {
            long cur = dp[x];
            long mod = cur % 10;
            if(mod != 0){
                dp[index] = 10*cur+mod-1;
                index++;
                if(index>K){break;}
            }
            dp[index] = 10*cur+mod;
            index++;
            if(index>K){break;}
            if(mod != 9){
                dp[index] = 10*cur+mod+1;
                index++;
                if(index>K){break;}
            }
        }

        System.out.println(dp[K]); 
    }

    public static void useQueue() throws IOException {
        int K = nextInt();
        
        LinkedList<Long> queue = new LinkedList<Long>();

        for (int x=1; x<10; x++) {
            queue.add((long)x);
        }

        for (int x=1; x<K; x++) {
            long cur = queue.poll();
            long mod = cur % 10;
            if(mod != 0){
                queue.add(10*cur+mod-1);
            }
            queue.add(10*cur+mod);
            if(mod != 9){
                queue.add(10*cur+mod+1);
            }
        }

        System.out.println(queue.poll()); 
    }
 

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}