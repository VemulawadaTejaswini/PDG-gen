import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char s[][] = new char[3][n];
		s[0] = sc.next().toCharArray();
		s[1] = sc.next().toCharArray();
		s[2] = sc.next().toCharArray();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (s[0][i] == s[1][i] && s[1][i] == s[2][i]) {
			} else if (s[0][i] == s[1][i] || s[1][i] == s[2][i] || s[2][i] == s[0][i]) {
				cnt++;
			} else {
				cnt += 2;
			}
		}
		System.out.println(cnt);
	}
}
