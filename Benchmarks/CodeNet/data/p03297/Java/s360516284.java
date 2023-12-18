import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long a, b, c, d;
		long dif, sum;
		for (int i = 0; i < N; i++) {
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
			d = sc.nextLong();

			if (a >= b && d >= b) {
				if (c >= b) {
					System.out.println("Yes");
				} else if (a % b > c) {
					System.out.println("No");
				} else if (d - b == 0) {
					System.out.println("Yes");
				} else {
					dif = d - b;
					sum = dif * ((c - a % b) / dif) + a % b;
					if (sum + dif > c && sum + dif < b) {
						System.out.println("No");
					} else {
						System.out.println("Yes");
					}
				}
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}
