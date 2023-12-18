import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int res = 0;
		if (k - a <= 0) {
			System.out.println(k);
		} else {
			res += a;
			k -= a;
			if (k - b <= 0) {
				System.out.println(res);
			} else {
				k -= b;
				System.out.println(res + -1 * k);
			}
		}
	}
}
