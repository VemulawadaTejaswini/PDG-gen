import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();

		// AとBの偶奇が異なるとき、A-KとB-Kの偶奇は異なる
		if(A % 2 != B % 2) {
			System.out.println("IMPOSSIBLE");
		}else {
			// AとBの偶奇が等しいとき
			System.out.println((A + B) / 2);
		}

	}
}