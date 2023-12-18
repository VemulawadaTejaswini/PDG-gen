import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();

		int min = 0;
		int now = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] == '(') {
				now++;
			} else {
				now--;
			}
			min = Math.min(min, now);
		}
		min = -min;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < min; i++) {
			sb.append('(');
		}
		sb.append(s);
		for (int i = 0; i < now + min; i++) {
			sb.append(')');
		}
		System.out.println(sb.toString());
	}
}
