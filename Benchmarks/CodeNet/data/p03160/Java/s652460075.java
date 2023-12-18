import java.io.*;
    public class Main
    {
        public static int frog(int[] arr){
            
            int[] dp = new int[arr.length];
            dp[0] = 0;
            dp[1] = Math.abs(arr[0] - arr[1]);
            for(int i = 2; i < dp.length; i++){
                dp[i] = Math.min(Math.abs(arr[i] - arr[i-1])+dp[i-1], Math.abs(arr[i] - arr[i-2])+dp[i-2]); 
            }
            return dp[dp.length-1];
        }
    	public static void main(String[] args) throws Exception {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    int n = Integer.parseInt(br.readLine());
    	    String[] s = br.readLine().split(" ");
    	    int[] arr = new int[s.length];
    	    for(int i = 0; i < arr.length; i++){
    	        arr[i] = Integer.parseInt(s[i]);
    	    }
    
    	System.out.println(frog(arr));
    	}
    }