import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n / 2];
		int[] b = new int[n / 2];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				a[i / 2] = sc.nextInt();
			} else {
				b[i / 2] = sc.nextInt();
			}
		}

		Arrays.sort(a);
		Arrays.sort(b);
		int mida = a[n / 4];
		int midb = b[n / 4];
		long sum = 0;
		if (mida == midb) {
			mida++;
		}

		for (int i = 0; i < n / 2; i++) {
			sum += Math.abs(mida - a[i]) + Math.abs(midb - b[i]);
		}

		System.out.println(sum);

	}
}