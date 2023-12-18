import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static long[][] dp;

	static int h[];

	public static void main(String[] args) throws IOException {
		int t = 1;// sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			s = sc.next();
			dp=new long[n+1][n+1];
			
			System.out.println(solve(n));
			
		}

	}

	static String s;

	static int[]v=new int [300000];
	public static long solve(int n) {
		char []ch=s.toCharArray();
		dp=new long[n+1][n+1];
		dp[1][1]=1;
		
		long []pre=new long[n+1];
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				pre[j]=pre[j-1]+dp[i-1][j];
				pre[j]%=mod;
			}
	        if (ch[i-2] == '<')
	        {
	            for (int j = 1; j<=i; j++)
	                dp[i][j] = pre[j-1];
	        }
	        else
	        {
	        	
	            for (int j = 1; j<=i; j++)
	                dp[i][j] = (pre[i]-pre[j-1]+mod)%mod;
	        }
	    }
	    int ans = 0;
	    for (int i = 1; i<=n; i++)
	        ans = (int) ((ans+dp[n][i])%mod);
	    
	    return ans;
		}

}