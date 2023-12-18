import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[N];
		long min = 1000000000L;
		long ans1 = 0;
		long ans2 = 0;



		for (int i = 0; i < N ;i++) {
			a[i]  = sc.nextLong();
			if (a[i] < min) min = a[i];
			min = Math.min(a[i], min);
			ans2 += a[i];
		}

		ans1 = min * N + x * (N-1);

		for (int i = 0; i < N ;i++) {
			if (a[i] < x) {

			}
		}

		System.out.println(Math.min(ans1, ans2));

		sc.close();
	}

}