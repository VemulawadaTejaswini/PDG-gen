import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());

		// 出力
		if (x <= 599) {
			System.out.println(8);
			return;
		}
		if (x <= 799) {
			System.out.println(7);
			return;
		}
		if (x <= 999) {
			System.out.println(6);
			return;
		}
		if (x <= 1199) {
			System.out.println(5);
			return;
		}
		if (x <= 1399) {
			System.out.println(4);
			return;
		}
		if (x <= 1599) {
			System.out.println(3);
			return;
		}
		if (x <= 1799) {
			System.out.println(2);
			return;
		}
		if (x <= 1999) {
			System.out.println(1);
			return;
		}
	}

}
