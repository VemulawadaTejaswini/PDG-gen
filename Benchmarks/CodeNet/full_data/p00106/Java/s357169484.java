import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			System.out.println(f(n, 0, 0, 0));
		}
	}
	
	public static int f(int n, int a, int b, int c) {
		if (n <= a * 200 + b * 300 + c * 500) {
			int sum = 0;
			sum += a * 380;
			sum -= (a / 5) * 380 * 5 * 0.20;
			sum += b * 550;
			sum -= (b / 4) * 550 * 4 * 0.15;
			sum += c * 850;
			sum -= (c / 3) * 850 * 3 * 0.12;
			return sum;
		}
		int ka = f(n, a + 1, b, c);
		int kb = f(n, a, b + 1, c);
		int kc = f(n, a, b, c + 1);
		return Math.min(Math.min(ka,  kb), kc);
	}
}