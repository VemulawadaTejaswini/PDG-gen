import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int Y = scan.nextInt();
		int Z = scan.nextInt();

		int A = X;
		int B = Y;
		int C = Z;

		int tmp;

		tmp = A;
		// AをBに
		A = B;
		// BをAに
		B = tmp;

		tmp = A;
		// AをCに
		A = C;
		C = tmp;

		System.out.println(A + " " + B + " " + C);

	}
}
