import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int solve() {
		String s1 = sc.next();
		String s2 = sc.next();
		int ans = 0;
		for (int i = -s1.length() + 1; i < s2.length(); ++i) {
			int count = 0;
			for (int j = Math.max(0, -i); j < s1.length() && i + j < s2.length(); ++j) {
				if (s1.charAt(j) == s2.charAt(i + j)) {
					++count;
					ans = Math.max(ans, count);
				} else {
					count = 0;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			System.out.println(solve());
		}
	}

}