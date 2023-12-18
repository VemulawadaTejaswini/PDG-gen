import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a == b && b == c)) {
			sb.append(-1);
		} else {
			int aa, bb, cc, cnt = 0;
			while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
				aa = (b + c) / 2;
				bb = (a + c) / 2;
				cc = (a + b) / 2;
				a = aa;
				b = bb;
				c = cc;
				cnt++;
			}
			sb.append(cnt);
		}
		System.out.println(sb);
	}
}
