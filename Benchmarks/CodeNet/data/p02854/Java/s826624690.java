import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] a = new long[n];
		Arrays.setAll(a, i -> sc.nextLong());

		long sumAll = 0;
		for (long l : a) sumAll += l;

		long minDif = Long.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			long sum = 0;
			for (int j = 0; j <= i; j++) {
				sum += a[j];
			}

			long dif = Math.abs(sumAll - sum * 2);
			if (dif < minDif) {
				minDif = dif;
			}
		}
		System.out.println(minDif);
		sc.close();
	}
}
