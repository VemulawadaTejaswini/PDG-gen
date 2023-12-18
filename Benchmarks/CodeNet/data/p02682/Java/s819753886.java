import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();

		if (A <= K) {
			System.out.print(K);
		}
		if (K <= (A + B)) {
			System.out.print(K);
		} else {
			if (K <= (A + B + C)) {
				System.out.print(A - (K- (A + B)));
			} else {
				System.out.print(0);
			}
		}
	}
}
