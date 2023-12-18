import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 文字列の入力
			String s = sc.next();
			boolean flag = false;
			String before = "";
			for (int i = 0; i < s.length(); i++) {
				String now = s.substring(i, i + 1);
				if (before.equals("")) {
					if (!now.equals("h")) {
						flag = false;
						break;
					} else {
						before = "h";
					}
				} else if (before.equals("h")) {
					if (!now.equals("i")) {
						flag = false;
						break;
					} else {
						before = "i";
						flag = true;
					}
				} else if (before.equals("i")) {
					if (!now.equals("h")) {
						flag = false;
						break;
					} else {
						before = "h";
						flag = false;
					}
				}
			}
			System.out.println(flag ? "Yes" : "No");
		}
	}

	/**
	 * 最小公倍数
	 */
	static long lcm(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return c / b;
	}

	/**
	 * 最大公約数
	 */
	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}
}