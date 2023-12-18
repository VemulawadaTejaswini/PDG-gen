import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;

		for (int i = 0; i <= (b - a); i++) {
			String sb = String.valueOf((b - i));
			String rb = (new StringBuilder(sb)).reverse().toString();
			if (sb.equals(rb)) {
				ans++;
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}
