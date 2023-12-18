package contest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int K;
		int res = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		K = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			System.out.println(h);
			if (h >= K) {
				res++;
			}
		}
		sc.close();

		System.out.println(n);
		System.out.println(K);
		System.out.println(res);
	}
}
