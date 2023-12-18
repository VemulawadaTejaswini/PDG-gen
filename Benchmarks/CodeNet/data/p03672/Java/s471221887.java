import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		main.solve();
	}

	void solve() throws Exception {
		try (Scanner cin = new Scanner(System.in)) {
			String str = cin.next();

			System.out.println(test(str.substring(0, str.length() - 1)));
		} finally {
		}
	}

	int test(String str) {
		int ans;

		if (str.length() % 2 != 0) {
			ans = test(str.substring(0, str.length() - 1));
		} else {
			if (str.substring(0, str.length() / 2).equals(str.substring(str.length() / 2))) {
				ans = str.length();
			} else {
				ans = test(str.substring(0, str.length() - 2));
			}
		}

		return ans;
	}

}
