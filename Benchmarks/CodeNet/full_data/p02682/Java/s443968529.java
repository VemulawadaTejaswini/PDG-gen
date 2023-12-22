import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int sumABC = A + B + C;
		int max = 0;

		if (sumABC <= K) {
			max = A;
			show(max);
		} else {
			if (A < K) {
				K = K - A - B;
				max = A - (C * K);
				show(max);
			}
		}
//		if (K <= A) {
//			max = max + (A * K);
//			show(max);
//
//		} else {
//			max = max + (A * K);
//			K = K - A;
//			if (K <= B) {
//				show(max);
//
//			} else {
//				max = max + (B * K);
//				K = K - B;
//				if (K <= C) {
//					max = max - (C * K);
//					show(max);
//				} else {
//					show(max);
//
//				}
//			}
//		}
	}

	private static void show(int max) {
		if (max <= 0) {
			System.out.print(0);
		} else {
			System.out.print(max);
		}
	}
}
