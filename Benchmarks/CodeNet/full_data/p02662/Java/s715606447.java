import java.util.*;
import java.io.*;
public class Main {
	static long[][] dp;
	static int[] array;
	static ArrayList<Integer> allSubsets = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int n = Integer.parseInt(st.nextToken());
 		int s = Integer.parseInt(st.nextToken());
 		array = new int[n];
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		for(int i = 0;i<n;i++){
 			array[i] = Integer.parseInt(st1.nextToken());
 		}
 		int[][] dp = new int[n+1][s+1];
 		dp[0][0] = power(2, n, num);
 		for(int i = 1;i<n;i++)
 			dp[0][i] = 0;
 		for(int i = 0;i<n;i++){
 			for(int j = 0;j<=s;j++){
 				dp[i+1][j]+= dp[i][j];
 				if (j+array[i] <=s)
 					dp[i+1][j+array[i]] += dp[i][j]/2;
 			}
 			
 		}
 		out.println(dp[n][s]);
 		out.close();
 		
	}
	public static int power(long x, long y, long mod){
		long ans = 1;
		while(y>0){
			if (y%2==1)
				ans = (ans*x)%mod;
			x = (x*x)%mod;
			y/=2;
		}
		return (int)(ans);
	}

}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


