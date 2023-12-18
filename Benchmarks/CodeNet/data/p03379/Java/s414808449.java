import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] X = new long[N];
		long[] a = new long[N];
		for (int i = 0; i < N; i++) {
			X[i] = in.nextLong();
			a[i] = X[i];
		}
		Arrays.sort(a);
		for (int i = 0; i < N; i++) {
			if (X[i] <= a[N / 2 - 1]) {
				System.out.println(a[N / 2]);
			} else {
				System.out.println(a[N / 2 - 1]);
			}
		}
		in.close();
	}
}