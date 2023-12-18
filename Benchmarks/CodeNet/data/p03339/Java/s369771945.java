import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String S = scan.next();
		char[] s = new char[n];
		for (int i = 0; i < n; i++) {
			s[i] = S.charAt(i);
		}
		int numMin = 100000;
		// リーダーの位置
		for (int i = 0; i < n; i++) {
			int num = 0;
			// 西にいて西を向いている人の数
			for (int j = 0; j < i; j++) {
				if (s[j] == 'W') {
					num++;
				}
			}
			for (int j = i + 1; j < n; j++) {
				if (s[j] == 'E') {
					num++;
				}
			}
			if (num < numMin) {
				numMin = num;
			}
		}
		System.out.println(numMin);
	}
}
