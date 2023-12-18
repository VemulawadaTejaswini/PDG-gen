import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		sc.close();

		int cnt = 0;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i - 1) != s.charAt(i)) {
				cnt++;
			}
		}
		cnt = Math.max(cnt - 2 * k, 0);
		System.out.println(n - cnt - 1);
	}
}
