import java.util.*;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	
	public static int a, b;
	public static String op;
	
	public static void main(String[] args) {
		while (read()) {
			solve();
		}
	}
	
	public static boolean read() {
		if (!sc.hasNext()) {
			return false;
		}
		
		a = sc.nextInt();
		// 文字列を取得するときは、 sc.next() を用いる
		op = sc.next();
		b = sc.nextInt();
		
		// 入力の終了判定
		if (op.equals("?")) {
			return false;
		}
		
		return true;
	}
	
	public static void solve() {
		// 文字列の比較は equalsメソッドを利用する (== で比較しないこと)
		int ans = 0;
		if (op.equals("+")) {
			ans = a + b;
		} else if (op.equals("-")) {
			ans = a - b;
		} else if (op.equals("*")) {
			ans = a * b;
		} else if (op.equals("/")) {
			ans = a / b;
		}
		System.out.println(ans);
	}
}