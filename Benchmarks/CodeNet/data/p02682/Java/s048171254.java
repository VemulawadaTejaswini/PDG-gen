import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();

		int max = 0;
		if (K <= A) {
				max = max + A;
			show(max);

		} else {
			max = max + A;
			K = K - A;
			if (K <= B) {
				show(max);

			} else {
				K = K - B;
				max = max - K;
				show(max);
			}
		}
	}

	private static void show(int max) {
		if (max <= 0) {
			System.out.print(0);
		} else if (max >= 2000000000) {
			System.out.print(2000000000);
		} else {
			System.out.print(max);
		}
	}
}
