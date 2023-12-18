import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String S = sc.next();
		
		int ans =0;
		for (int i = 1; i < S.length(); i++) {
			String s = S.substring(0, S.length() - i);
			if (s.length() % 2 == 1) continue;
			int half = s.length() / 2;
	
			if (s.substring(0, half).equals(s.substring(half, half + half))) {
				ans = s.length();
				break;
			}
		}
		System.out.println(ans);
	}
}
