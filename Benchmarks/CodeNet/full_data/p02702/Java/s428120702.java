import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		String s = new String(ss);

		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sub = s.substring(i, j+1);
				if (j - i >= 9)
					continue;
				if (Long.parseLong(sub) % 2019 == 0)
					ans++;
			}
		}
		System.out.println(ans);
	}
}