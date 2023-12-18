import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		int[]a=new int[scn.nextInt()];
		for(int i=0;i<a.length;i++)a[i]=scn.nextInt();
		System.out.println(solve(a));
	}
	
	public static int solve(int[]a) {
		int[]dp=new int[a.length];
		for(int i=1;i<a.length;i++) {
			int f1 = i-1>=0?(Math.abs(a[i]-a[i-1])+dp[i-1]):Integer.MAX_VALUE, f2=i-2>=0?(Math.abs(a[i]-a[i-2])+dp[i-2]):Integer.MAX_VALUE;
			dp[i]=Math.min(f1, f2);
		}
		return dp[a.length-1];
	}
	
}
