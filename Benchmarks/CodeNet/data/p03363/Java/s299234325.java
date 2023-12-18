import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no1();
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			long[] a = new long[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}

			int count = 0;
			long sum;
			for (int i = 0; i < n; i++) {
				sum = 0;
				for (int j = i; j < n; j++) {
					sum = sum + a[j];
					if (sum == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
