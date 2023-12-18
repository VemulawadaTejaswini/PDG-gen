
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        }

        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        }

        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 

    }

    public static void main(String[] args) {
        
        FastReader fs = new FastReader();
        int n = fs.nextInt();

        int[][] activities = new int[3][n];

        int[][] dp = new int[3][n];

        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 3; i++) {
                activities[i][j] = fs.nextInt();
            }
        }

        dp[0][n-1] = activities[0][n-1];
        dp[1][n-1] = activities[1][n-1];
        dp[2][n-1] = activities[2][n-1];

        for (int j = n-2; j >= 0; j--) {
            // Choose the ith activity on this day...
            for (int i = 0; i < 3; ++i) {
                int currHappiness = activities[i][j];
                int maxHappinessTillTomorrow = Integer.MIN_VALUE;
                for (int k = 0; k < 3; k++) {
                    if (i != k) {
                        maxHappinessTillTomorrow = Math.max(maxHappinessTillTomorrow, dp[k][j+1]);
                    }
                }
                dp[i][j] = currHappiness + maxHappinessTillTomorrow;
            }
        }

        System.out.println(Math.max(dp[0][0], Math.max(dp[1][0], dp[2][0])));

    }


}