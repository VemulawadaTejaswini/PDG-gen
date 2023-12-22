import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int m = Integer.parseInt(sc.next());
	int[] c = new int[10000];
	for (int i = 0; i < m; i++) {
		c[i]  = Integer.parseInt(sc.next());
	}
	int dp[] = new int[n+1];
	for(int i  = 0; i< n+1;i++) dp[i] = i;
	for (int i = 0; i < m+1; i++) {
		for (int j = 0; j < n+1; j++) {
			dp[j] = Math.min(dp[j],dp[j-c[i]]+1);
		}
	}
	System.out.println(dp[n]);
	}
}