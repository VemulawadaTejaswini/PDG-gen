import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		String str = scan.next();
		int ans = 0;
		for (int i = 0; i < len - 1; i++) {
			int temp = check(str.substring(0, i + 1), str.substring(i + 1, len));
			if (temp > ans) {
				ans = temp;
			}
		}
		System.out.println(ans);
	}

	public static int check(String tag1, String tag2) {
		int cnt = 0;
		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> set2 = new HashSet<>();
		for (int i = 0; i < tag1.length(); i++) {
			set1.add(tag1.charAt(i));
		}
		for (int i = 0; i < tag2.length(); i++) {
			set2.add(tag2.charAt(i));
		}
		for (char c : set1) {
			if (set2.contains(c)) {
				cnt++;
			}
		}
		return cnt;
	}
}