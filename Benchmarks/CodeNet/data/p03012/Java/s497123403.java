
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int W[] = new int[N];
		int sumW = 0;

		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			sumW += W[i];
		}

		for (int i = 0; i < N; i++) {
			if (a < sumW / 2) {
				a += W[i];
			} else {
				c = i;
				break;
			}
		}

		for (int i = c; i < N; i++) {
			b += W[i];
		}

		System.out.print(a - b);
	}
}
