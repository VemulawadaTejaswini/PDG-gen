import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer; 
  
public class Main
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
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
  
    public static void main(String[] args) 
    { 
        FastReader fr = new FastReader(); 
        
        int N = fr.nextInt();
        
        int[] h = new int[N];
        int[] dp = new int[N];
        
        Arrays.fill(dp, (int)2e9);
        dp[0] = 0;
        
        for(int i = 0; i < N; i++) {
        	h[i] = fr.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
        	if (i+1 < N) {
        		dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(h[i] - h[i+1])); 
        	} if (i+2 < N) {
        		dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(h[i] - h[i+2]));
        	}
        }
        
        System.out.println(dp[N-1]);
        
    }

}