import java.util.*;

class Main {
	public static void main(String[] args) {
		//整数の入力
		int a = 1;
		int b = 2;
		int c = 3;

		int t = a;
		a = c;
		c = b;
		b = t;

		//出力
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
	}
}