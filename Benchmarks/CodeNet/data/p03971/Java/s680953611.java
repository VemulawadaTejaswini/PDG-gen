import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int cnt = 0, fcnt = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] == 'a') {
				if (cnt < a + b) {
					sb.append("Yes" + "\n");
					cnt++;
				} else {
					sb.append("No" + "\n");
				}
			} else if (s[i] == 'b') {
				if (cnt < a + b && fcnt < b) {
					sb.append("Yes" + "\n");
					cnt++;
					fcnt++;
				} else {
					sb.append("No" + "\n");
				}
			} else {
				sb.append("No" + "\n");
			}
		}
		System.out.print(sb);
	}
}
