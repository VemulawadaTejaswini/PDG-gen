import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		long ans = 0;
		int cnt = 0;
		for (int i = s.length - 1; i >= 0; i--) {
			if (s[i] == 'W') {
				cnt++;
			} else {
				ans += cnt;
			}
		}
		System.out.println(ans);
	}
}
