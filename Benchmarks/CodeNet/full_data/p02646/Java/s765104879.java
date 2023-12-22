import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int V = scanner.nextInt();
		int B = scanner.nextInt();
		int W = scanner.nextInt();
		int T = scanner.nextInt();
		int lim = 1000000000;

		int A_after;
		int B_after;

		for (int i = 1; i <= T; i++) {
			A_after = A + (V * i);
 			B_after = B + (W * i);
 			if ((A_after == B_after) || (A_after > lim && B_after > lim)) {
 				System.out.println("Yes");
 				return;
 			} else if ((i == T) && A_after != B_after ) {
 				System.out.println("No");
 			}
		}
	}
}
