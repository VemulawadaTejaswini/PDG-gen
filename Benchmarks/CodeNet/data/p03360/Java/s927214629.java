import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int k = sc.nextInt();

			int t = 0;
			if (a >= b && a >= c) {
				t = b + c + (int) Math.pow(2, k) * a;
			}
			if (b > c && b > a) {
				t = a + c + (int) Math.pow(2, k) * b;
			}
			if (c > a && c > b) {
				t = b + a + (int) Math.pow(2, k) * c;
			}
			System.out.println(t);
		}
	}
}
