import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int V = scan.nextInt();
		int B = scan.nextInt();
		int W = scan.nextInt();
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			A = A + V;
			B = B + W;
			if (A == B) {
				System.out.println("YES");
				break;
			}
		}
		if (A != B) {
			System.out.println("NO");
		}
	}

}