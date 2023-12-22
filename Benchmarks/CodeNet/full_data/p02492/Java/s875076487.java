import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a,b;
	static String op = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		while(read())	solve();
	}

	static boolean read() {
		if(sc.hasNext()){
			a = Integer.parseInt(sc.next());
			op = sc.next();
			b = Integer.parseInt(sc.next());
			return true;
		} else {
			return false;
		}
	}

	static void solve() {
		int ans = 0;
		if (op.equals("+")) {
			ans = a+b;
		} else if (op.equals("-")) {
			ans = a-b;
		} else if (op.equals("*")) {
			ans = a*b;
		} else if (op.equals("/")) {
			ans = a/b;
		} else if (op.equals("?")) {
			return;
		} else {
			System.err.print("error");
			return;
		}
		System.out.println(ans);
	}
}