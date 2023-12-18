import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int W[] = new int[N];
		int a = 0;
		int b = 0;
		int sumW = 0;
		int min = 1000000;

		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			sumW += W[i];
		}

		for (int i = 0; i < N - 1; i++) {
			a += W[i];
			b = sumW - a;

			if (min >= Math.abs(a-b)) {
				min = Math.abs(a-b);
			}
		}

		System.out.print(min);
	}
}