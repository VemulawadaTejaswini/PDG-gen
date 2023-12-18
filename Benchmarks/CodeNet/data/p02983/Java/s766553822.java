
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int R = sc.nextInt();

		int n[] = new int[R - L + 1];
		int a = 0;
		int min = 1000000000;

		for (int i = 0; i < R - L + 1; i++) {
			n[i] = L + i;
		}

		forloop: for (int i = 0; i < R - L + 1; i++) {
			for (int j = i + 1; j < R - L + 1; j++) {
				a = (n[i] * n[j]) % 2019;
				if (a < min) {
					min = a;
				}
				if (min == 0) {
					break forloop;
				}
			}
		}
		System.out.print(min);
	}
}
