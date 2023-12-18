import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		long[] p = new long[n]; // price
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextLong();
		}

		for (int i = 0; i < m; i++) {
			long max = 0;
			int idx = 0;
			for (int j = 0; j < n; j++) {
				if (p[j] > max) {
					max = p[j];
					idx = j;
				}
			}
			p[idx] /= 2;
		}

		long sum = 0;
		for (long num : p) {
			sum += num;
		}

		System.out.println(sum);

		sc.close();
	}
}
