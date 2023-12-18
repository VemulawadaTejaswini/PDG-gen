import java.io.*; 
import java.math.*;
import java.util.*;
 
public class Main {
	//static final long MOD = 998244353;
	static final long MOD = 1000000007;
	static final int INF = 1000000007;
	static int[][] perms;
	static int index;
    public static void main(String[] args) throws IOException {
    	FastScanner sc = new FastScanner();
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] sNums = new int[N+1];
    	for (int i = 1; i <= N; i++)
    		sNums[i] = sc.nextInt();
    	int[] tNums = new int[M+1];
    	for (int i = 1; i <= M; i++)
    		tNums[i] = sc.nextInt();
    	int[][] dp = new int[N+1][M+1];
    	for (int i = 0; i <= N; i++) {
    		dp[i][0] = 1;
    	}
    	for (int j = 0; j <= M; j++) {
    		dp[0][j] = 1;
    	}
    	for (int i = 1; i <= N; i++) {
    		for (int j = 1; j <= M; j++) {
    			int prev = dp[i-1][j]+dp[i][j-1];
    			if (sNums[i] == tNums[j]) {
    				dp[i][j] = prev;
    			} else {
    				dp[i][j] = prev-dp[i-1][j-1];
    			}
    			dp[i][j] %= INF;
    		}
    	}
    	System.out.println(dp[N][M]); //+1 is for the empty set
    }
    
    public static long power(long x, long y, long p) { 
        // Initialize result
        long res = 1;
         
        // Update x if it is more   
        // than or equal to p 
        x = x % p;  
      
        while (y > 0) 
        { 
            // If y is odd, multiply x 
            // with result 
            if((y & 1)==1) 
                res = (res * x) % p; 
      
            // y must be even now 
            // y = y / 2 
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return res; 
    }
    
    public static long dist(int[] point, int[] point2) {
    	return (long)(Math.pow((point2[1]-point[1]),2)+Math.pow((point2[0]-point[0]),2));
    }
    
    public static long gcd(long a, long b) {
    	if (b == 0)
    		return a;
    	else
    		return gcd(b,a%b);
    }
    
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] arr1, int[] arr2) {
				  return arr2[1]-arr1[1];
	          }
		});
		return array;
	}
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
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