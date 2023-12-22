import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = gcd(x, y);
		System.out.println(ans);
	}

	public static int gcd(int x, int y) {
		int temp;
		int r;
		if (y > x) {
			temp = x;
			x = y;
			y = temp;
		}
		while (y > 0) {
			r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
}
