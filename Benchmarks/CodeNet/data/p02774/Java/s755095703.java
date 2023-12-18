import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long[] a = new long[n];
		Arrays.setAll(a, i -> sc.nextLong());

		long[] pair = new long[n * (n - 1) / 2];
		int idx = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				pair[idx++] = a[i] * a[j];
			}
		}
		Arrays.sort(pair);

//		for (long l : pair)
//			System.out.println(l);

		System.out.println(pair[k - 1]);
	}


}
