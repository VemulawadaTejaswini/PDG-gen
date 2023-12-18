import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		/****
		 * 隣接するカードの枚数が偶数⇒表、奇数⇒裏
		 */

		System.out.println(Math.abs(x * y - ((x - 1) * 2 + (y - 1) * 2)));

		sc.close();
	}
}