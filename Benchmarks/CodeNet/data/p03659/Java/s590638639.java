import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] sum = new int[n + 1];
		for(int i = 0 ; i < n ; i++) sum[i + 1] = sum[i] + a[i];
		int ans = Integer.MAX_VALUE;
		for(int i = 1 ; i < n ; i++) {
			int dis = Math.abs(sum[i] - (sum[n] - sum[i]));
			ans = Math.min(ans, dis);
		}
		System.out.println(ans);
	}
}
