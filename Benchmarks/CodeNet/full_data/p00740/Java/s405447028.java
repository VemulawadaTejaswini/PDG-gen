import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int P = sc.nextInt();
			int[] c = new int[N];
			int rest = P;
			OUT: while (true) {
				for (int i = 0; i < N; ++i) {
					if (rest == 0) {
						rest = c[i];
						c[i] = 0;
					} else {
						++c[i];
						--rest;
						if (c[i] == P) {
							System.out.println(i);
							break OUT;
						}
					}
				}
			}
		}
	}
}