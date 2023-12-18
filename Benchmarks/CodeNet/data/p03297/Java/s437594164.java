import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long a, b, c, d;
		long dif, sum;
		boolean flag;
		for (int i = 0; i < N; i++) {
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
			d = sc.nextLong();

			if (a >= b && d >= b) {
				if (c + 1 >= b) {
					System.out.println("Yes");
				} else if (a % b > c) {
					System.out.println("No");
				} else {
					dif = d - b;
					sum = b * (c - a % b) / d + a % b;
					flag = true;
					while (sum < b && dif != 0 && flag) {
						if (sum > c) {
							System.out.println("No");
							flag = false;
						}
						sum += dif;
					}
					if (flag) {
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
