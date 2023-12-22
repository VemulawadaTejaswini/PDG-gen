import java.util.Scanner;

public class Main{

	/**
	 * 2つの自然数x,yを入力とし、それらの最大公約数を求めるプログラム
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		System.out.println(Gcd(x, y));

	}

	/**
	 * 最大公約数をもとめる
	 * 
	 * @param x
	 *            入力１
	 * @param y
	 *            入力２（x%y)
	 * @return 最大公約数
	 */
	public static int Gcd(int x, int y) {
		if (y > x) {
			int tmp;
			tmp = x;
			x = y;
			y = tmp;
		}

		if (y == 0) {
			return x;
		} else {
			return Gcd(y, x % y);
		}
	}
}

