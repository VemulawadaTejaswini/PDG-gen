import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char[][] s = new char[2][n];
		s[0] = sc.next().toCharArray();
		s[1] = sc.next().toCharArray();
		int idx = 0;
		long cnt = 0;
		int v = 1000000007;
		boolean x = false, y = false;
		if (s[0][0] == s[1][0]) {
			idx = 1;
			cnt = 3;
			x = true;
		} else {
			idx = 2;
			cnt = 6;
			y = false;
		}
		for (; idx < n; idx++) {
			if (s[0][idx] == s[1][idx]) {
				if (x) {
					cnt = (cnt * 2) % v;
				} else if (y) {
					y = false;
					x = true;
				}
			} else {
				idx++;
				if (x) {
					cnt = (cnt * 2) % v;
					x = false;
					y = true;
				} else if (y) {
					cnt = (cnt * 3) % v;
				}
			}
		}
		System.out.println(cnt);
	}
}