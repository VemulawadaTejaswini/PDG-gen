import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();

		boolean flg = false;

		if (v <= w) {
			flg = false;
		} else {
			if (Math.abs(a - b) / v - w <= t) {
				flg = true;
			}
		}
		// 出力
		if (flg) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}