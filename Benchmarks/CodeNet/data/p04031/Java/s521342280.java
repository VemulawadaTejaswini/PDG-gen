import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = Integer.MAX_VALUE;
		int maxAbs = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			maxAbs = Math.max(maxAbs, Math.abs(a[i]));
		}

		int now = 0;
		for (int i = -maxAbs; i <= maxAbs; i++) {
			now = 0;
			for (int j = 0; j < N; j++) {
				now += Math.pow(i - a[j], 2);
			}
			sum = Math.min(sum, now);
		}

		System.out.println(sum);
	}
}
