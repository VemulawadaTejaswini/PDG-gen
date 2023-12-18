import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char prev = 'a';
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (prev == s.charAt(i)) {// 前と同じ
				ans++;
			}
			prev = i % 2 == 0 ? '1' : '0';
		}
		System.out.println(Math.min(ans, s.length() - ans));
	}
}