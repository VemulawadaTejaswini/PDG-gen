import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		String s = new String(ss);

		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (j - i > 9 || j - i < 4)
					continue;
				String sub = s.substring(i, j+1);			
				if (Long.parseLong(sub) % 2019 == 0)
					ans++;
			}
		}
		System.out.println(ans);
	}
}