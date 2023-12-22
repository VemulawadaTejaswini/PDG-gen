import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		String str = null;

//		while (!"end".equals(str)) {
//			System.out.println("ABCK:");
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			int K = scan.nextInt();

			if (K <= A) {
				System.out.println(K);
			}
			if (K >= A && K <= (A + B)) {
				System.out.println(A);
			}
			if (K >= (A + B) && K <= (A + B + C)) {
				K = K - A;
				K = K - B;
				int max = A - K;
				System.out.println(max);
			}

//			System.out.println("str:");
//			str = scan.next();
//		}
	}
}