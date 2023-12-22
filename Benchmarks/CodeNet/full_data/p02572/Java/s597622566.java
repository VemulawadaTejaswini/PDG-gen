import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		long total = 0;

		for (int i=0; i<n; i++){
			a[i] = sc.nextLong();
			total += a[i];
		}

		long ans = 0;
		for (int i=0; i<n-1; i++){
			total -= a[i];
			ans += a[i] * total;
			ans %= 1000000007;

		}
		System.out.println(ans);
	}


}