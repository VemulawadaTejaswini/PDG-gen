import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		int N = input.nextInt();
		int S = input.nextInt();
		int[] A = new int[N+1];
		long[][] dp = new long[3001][3001];
		long mod = 998244353;
		long mod_inv_2 = FastExp(2,mod-2,mod);
		long lenOneSubset = FastExp(2,N-1,mod);
		for (int i = 1; i <= N; i++) {
			A[i]=input.nextInt();
		}
		for (int item = 1; item <= N; item++) {
			for (int sum = 1; sum <= S; sum++) {
				dp[item][sum]=dp[item-1][sum];
				if (A[item]==sum) dp[item][sum]+=lenOneSubset;
				dp[item][sum]%=mod;
				if (sum-A[item]>0) dp[item][sum]+=dp[item-1][sum-A[item]]*mod_inv_2;
				dp[item][sum]%=mod;
			}
		}
		System.out.println(dp[N][S]);	
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans = 1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			base*=base;
			exp/=2;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
}