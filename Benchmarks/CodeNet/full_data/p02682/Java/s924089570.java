import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();

		if (K <= A) {
			System.out.print(A);
		}
		if (K <= (A + B)) {
			System.out.print(A);
		}
		if (K <= (A + B + C)) {
			int max = A - (K - (A + B));
			if (max < 0) {
				System.out.print(0);
			} else {
				System.out.print(A - (K - (A + B)));
			}
		}
	}
}
