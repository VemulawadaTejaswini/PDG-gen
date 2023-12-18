import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt(), y = sc.nextInt();
		sc.close();
		int a = -1, b = -1, c = -1;
		int tmpy = y / 1000;
		int r = tmpy % 5;
		tmpy -= r;
		int n2 = tmpy / 5;
		for (int i = 0; i <= n2; ++i) {
			int tmp = n2 - i;
			a = tmp - tmp % 2;
			a /= 2;
			b = tmp % 2;
			c = 5 * i + r;
			if(a + b + c == n)break;
			else {
				a = -1;
				b = -1;
				c = -1;
			}
		}
		System.out.println(a + " " + b + " " + c);
	}

}
