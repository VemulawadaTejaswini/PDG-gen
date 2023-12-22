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
				if ((A - C) <= 0) {
					System.out.print(0);
				} else {
					System.out.print(A - C);
				}
			} else {
				System.out.print(0);
			}
		}
	}
}
