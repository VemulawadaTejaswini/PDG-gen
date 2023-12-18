import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
	public static int n, a, lim = 0;
	public static long ans = 0;
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner in = new Scanner(new File("input.txt"));
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		a = in.nextInt();
		int[] ar = new int[n];
		for(int i = 0;i < n;i++){
			ar[i] = in.nextInt();
			lim += ar[i];
		}
		lim = lim/a;
		for(int i = 1; i <= lim;i++){
			ans += getResult(ar, a*i);
		}
		System.out.println(ans);
	}
	
	public static int getResult(int[] ar, int s){
		int[] dp = new int[s + 1];
		dp[0] = 1;
		int sum = 0;
		for(int i = 0;i < ar.length;i++){
			sum += ar[i];
			for(int j = Math.min(sum, s);j >= ar[i];j--){
				dp[j] += dp[j - ar[i]];
			}
		}
		return dp[s];
	}
}