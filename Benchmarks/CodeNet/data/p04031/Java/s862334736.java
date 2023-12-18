import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int now = 0;
		for (int i = 0; i < a[N - 1]; i++) {
			now = 0;
			for (int j = 0; j < N; j++) {
				now += Math.pow(i - a[j], 2);
			}
			if (now < sum) {
				sum = now;
			}
		}


		System.out.println(sum);
	}
}
