import java.util.Arrays;
import java.util.Scanner;

/**
 * 【問題概要】
 *
 * 0 と 1 のみから成る 3 桁の番号 s が与えられます。1 が何個含まれるかを求めてください。
 *
 * @author tsuch
 *
 */
public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main instance = new Main();
		instance.solve();
	}

	private void solve() {
		try {
			String s = sc.next();
			String[] ar = s.split("");
			long count = Arrays.stream(ar).filter(f -> f.equals("1")).count();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}