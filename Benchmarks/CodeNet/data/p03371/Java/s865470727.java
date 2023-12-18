import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int X = in.nextInt();
		int Y = in.nextInt();
		int ans = 0;
		if (A + B > C * 2) {
			if (A > C * 2 || B > C * 2) {
				int max = Math.max(X, Y);
				ans += (max * C) * 2;
			} else {
				int min = Math.min(X, Y);
				ans += (min * C) * 2;
				if (X > min) {
					ans += (X - min) * A;
				} else if (Y > min) {
					ans += (Y - min) * B;
				}
			}
		} else {
			ans += A * X + B * Y;
		}
		System.out.println(ans);
		in.close();
	}
}