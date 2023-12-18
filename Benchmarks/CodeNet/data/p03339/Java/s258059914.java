import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		String str = scan.next();
		if (str.length() <= 2) {
			if (str.charAt(0) == 'W' && str.charAt(1) == 'E') {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			return;
		}
		int ans = Integer.MAX_VALUE;
		int cnt = check(str.substring(0, 1), str.substring(2, len));
		char temp = str.charAt(1);
		for (int i = 2; i < len - 1; i++) {
			if (str.charAt(i) == 'E') {
				cnt--;
			}
			if (temp == 'W') {
				cnt++;
			}
			temp = str.charAt(i);
			if (cnt < ans) {
				ans = cnt;
			}
		}
		System.out.println(ans);
	}

	public static int check(String tag1, String tag2) {
		int ans = 0;
		for (int i = 0; i < tag1.length(); i++) {
			if (tag1.charAt(i) == 'W') {
				ans++;
			}
		}
		for (int i = 0; i < tag2.length(); i++) {
			if (tag2.charAt(i) == 'E') {
				ans++;
			}
		}
		return ans;
	}
}