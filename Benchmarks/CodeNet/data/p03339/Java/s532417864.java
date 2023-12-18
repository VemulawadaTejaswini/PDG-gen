import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int cnt = n;

		for (int i = 0 ; i <= n ; i++) {
			int c = 0;
			for (int j = 0 ; j < n ; j++) {
				if (j < i) {
					if (s.charAt(j) == 'W') {
						c++;
					}
				} else {
					if (s.charAt(j) == 'E') {
						c++;
					}
				}
				if (c >= cnt) {
					break;
				}
			}
			if (c < cnt) {
				cnt = c;
			}
		}
		System.out.println(cnt);
	}
}
