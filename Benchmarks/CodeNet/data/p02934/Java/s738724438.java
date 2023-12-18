import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];

		double invsum = 0;
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			invsum += 1.0 / (double) a[i];
		}
		System.out.println(1.0 / invsum);

	}

}
