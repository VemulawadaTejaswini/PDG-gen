import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		//		int[] a = new int[n];

		//		int sum = 0;
		//		for (int i = 0; i < n; i++) {
		//			a[i] += sc.nextInt();
		//		}

		int min = Integer.MAX_VALUE;

		//　TLEしちゃう
		//		for (int i = 0; i < n; i++) {
		//			int count = 0;
		//			for (int j = 0; j < n; j++) {
		//				if (i == j) {
		//					continue;
		//				}
		//				if (j < i) {
		//					if (s.charAt(j) == 'W') {
		//						count++;
		//					}
		//				}
		//				if (j > i) {
		//					if (s.charAt(j) == 'E') {
		//						count++;
		//					}
		//				}
		//			}
		//			min = Math.min(min, count);
		//		}
		int[] w = new int[n + 2];
		int[] e = new int[n + 2];

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (s.charAt(i - 1) == 'W') {
				count++;

			}
			w[i] = count;
		}
		count = 0;
		for (int i = n; i > 0; i--) {
			if (s.charAt(i - 1) == 'E') {
				count++;
			}
			e[i] = count;
		}

		int tmp = 0;
		for (int i = 1; i <= n; i++) {
			tmp = w[i - 1] + e[i + 1];
			min = Math.min(min, tmp);
		}

		System.out.println(min);

		sc.close();
	}
}