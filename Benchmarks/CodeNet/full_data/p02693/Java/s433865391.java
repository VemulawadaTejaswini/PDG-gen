import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//倍数
		int K = sc.nextInt();
		//A,Bは範囲
		int A = sc.nextInt();
		int B = sc.nextInt();

		for (int i = A; i < B; i++) {
			if (i % K == 0) {
				System.out.println("OK");
				return;
			}

		}
		System.out.println("NG");

		sc.close();

	}

}
