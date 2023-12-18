import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();

		int a[] = new int[M];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}

		int c1 = 0;
		int c2 = 0;

		int n = X;
		while(X != 0) {
			X--;
			for (int i = 0; i < M; i++) {
				if (X == a[i]) {
					c1++;
				}
			}
		}

		X = n;
		while(X != N) {
			X++;
			for (int i = 0; i < M; i++) {
				if (X == a[i]) {
					c2++;
				}
			}
		}

		if (c1 <= c2) {
			System.out.println(c1);
		} else {
			System.out.println(c2);
		}

	}

}