工夫した累積和 まだよく分かってない
import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = sc.nextInt();

		int ans = ar[0];
		for (int i=0; i<n-1; i++) {
			ans += Math.max(0, ar[i+1]-ar[i]);
		}
		System.out.println(ans);
	}
}
