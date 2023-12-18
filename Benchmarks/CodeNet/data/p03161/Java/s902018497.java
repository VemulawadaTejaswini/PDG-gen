//package atcoderdp;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] h = new int[n+1];
		for(int i =1;i<=n;i++) {
			h[i] = scn.nextInt();
		}
		int[] dp = new int[n+1];
		for(int i =2;i<=n;i++) {
			dp[i]=(int)Math.pow(2, 9);
			for(int j = Math.max(1, i-k);j<i;j++) {
				dp[i] = Math.min(dp[i], dp[j]+Math.abs(h[i]-h[j]));
			}
		}
		System.out.println(dp[n]);
	}
}
