

import java.util.Scanner;

//求最大公约数
public class Main {
	private static int gcd(int x, int y) {
		if (x < y) {
			int t = x;
			x = y;
			y = t;
		}
		
		while (x % y != 0) {
			//System.out.println(x + " " + y);
			int r = x % y;
			x = y;//上一个除数做被除数
			y = r;//余数做除数
		}
		return y;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt() , y = scan.nextInt();
		System.out.println(gcd(x, y));
	}
}

