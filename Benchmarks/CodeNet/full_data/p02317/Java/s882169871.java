import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		int[] DP = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
			DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i]) {
					DP[i] = Math.max(DP[i], DP[j]+1);
				}
			}
			ans = Math.max(ans, DP[i]);
		}
		System.out.println(ans);
		scn.close();
	}
}

