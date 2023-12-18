import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int r = sc.nextInt();

		if (b == 0) {
			System.out.println(0);
			return;
		}
		if (b == 0 && r == 0) {
			System.out.println(0);
			return;
		}

		if (r == 0) {
			System.out.println(n);
			return;
		}

		int m = b + r;
		int p = n / m;
		int h = b * p;
		int g = n % m;

		if (b >= g) {
			System.out.println(h + g);
		} else if (b < g) {
			int v = b * (p + 1);
			System.out.println(v);
		}
	}
}