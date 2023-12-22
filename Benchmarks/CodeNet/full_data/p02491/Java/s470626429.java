import java.util.*;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	// readメソッドで利用する変数で、solveメソッドで利用するものは、
	// すべてここでは public static をつけて宣言する。
	public static int a, b;
	
	public static void main(String[] args) {
		while (read()) {
			solve();
		}
	}
	
	// aとbを読み込む
	public static boolean read() {
		if (!sc.hasNext()) {
			return false;
		}
		
		a = sc.nextInt();
		b = sc.nextInt();
		return true;
	}
	
	public static void solve() {
		int d = a / b, r = a % b;
		double f = (double)a / b;
		System.out.println(d + " " + r + " " + f);
		
	}

}