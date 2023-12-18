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

		int m = b + r;
		int p = n / m;
		int h = b * p;
		int v = b * (p + 1);

		int g = n % m;
		if (b >= g) {
			System.out.println(h + g);
		} else if (b < g) {
			System.out.println(v);
		}
	}
}