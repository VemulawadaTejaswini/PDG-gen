import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] targets = new String[]{"dream", "dreamer", "erase", "eraser"};
		String s = sc.next();
		while (s.length() > 0) {
			boolean flag = true;
			for (String t : targets) {
				if (s.endsWith(t)) {
					s = s.substring(0, s.length() - t.length());
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
