import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] d = new int[N];
		int sum = 0;

		for (int i = 0; i < N; i++) {
			int g = sc.nextInt();
			d[i] = g;
			sum += g;
		}

		Arrays.sort(d);

		int z = X - sum;
		int c = z / d[0];

		System.out.println(N + c);

	}
}