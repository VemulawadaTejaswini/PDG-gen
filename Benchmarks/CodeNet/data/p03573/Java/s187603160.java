import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		// 出力
		if (A == B) {
			System.out.println(C);
		} else if (A == C) {
			System.out.println(B);
		} else {
			System.out.println(A);
		}

		sc.close();
	}
}
