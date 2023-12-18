import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();

		int a[] = new int[N];

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			a[i] = L + i;
			int tmp = Math.abs(a[i]);
			if (min >= tmp) {
				min = tmp;
			}
		}
		long sum =0;

		for (int i = 0; i < N; i++) {
			if (Math.abs(a[i]) == min) {
				continue;
			}
			sum += a[i];
		}
		System.out.println(sum);
	}
}
