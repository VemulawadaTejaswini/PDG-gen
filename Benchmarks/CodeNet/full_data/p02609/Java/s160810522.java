
import java.util.*;

// 普通に全探索、たぶんTLEになる
public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String baseStr = sc.next();

		for (int i = 1; i <= n; i++) {

			// 左からiビット目を反転してsolveに渡す
			String str = baseStr;
			if (str.charAt(i - 1) == '0') {
				str = str.substring(0, i - 1) + '1' + str.substring(i, n);
			} else {
				str = str.substring(0, i - 1) + '0' + str.substring(i, n);
			}

			solve(str);
		}

	}

	public static void solve(String str) {
		int loop = 0;
		while (true) {
			loop++;
			int x = Integer.parseInt(str, 2) % pop(str);
			if (x == 0) {
				System.out.println(loop);
				return;
			}
			str = Integer.toBinaryString(x);
		}
	}

	public static int pop(String str) {

		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				result++;
			}
		}

		return result;
	}
}
