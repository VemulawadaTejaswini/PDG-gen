import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int x[] = new int[N];
		int dx[] = new int[N];
		int minDx = 1000000000;
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			dx[i] = Math.abs(X - x[i]);
			if(dx[i] < minDx) {
				minDx = dx[i];
			}
		}

		if(minDx == 1) {
			System.out.println(1);
			return;
		}

		for (int i = 0; i < dx.length; i++) {
			int gcd = gcd(dx[i], minDx);
			if(gcd == 1) {
				System.out.println(1);
				return;
			}
			if(gcd < minDx) {
				minDx = gcd;
			}
		}

		System.out.println(minDx);

		return;
	}

	public static int gcd(int x, int y) {
		int tmp;
		while((tmp = x % y) != 0) {
			x = y;
			y = tmp;
		}
		return y;
	}
}
