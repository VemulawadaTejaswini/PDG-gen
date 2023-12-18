
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String S = scanner.next();
		// N == S.length();
		boolean flag = false;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == '#') {
				flag = true;
			}
			if (flag == true && S.charAt(i) == '.') {
				ans++;
				flag = false;
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}
