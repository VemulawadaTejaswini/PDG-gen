import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if(n == 1) {
			System.out.println(0);
			return;
		}
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) != 'x' && s.charAt(n - 1 - i) != 'x' && s.charAt(i) != s.charAt(n - 1 - i)) {
				System.out.println(-1);
				return;
			}
		}
		int[] x = new int[26];
		for(int i = 0 ; i < n ; i++) {
			for(char c = 'a' ; c <= 'z' ; c++) {
				if(s.charAt(i) == c) {
					int point = c - 'a';
					x[point]++;
				}
			}
		}
		int cnt = 0;
		for(int i = 0 ; i < 26 ; i++) {
			if(x[i] % 2 == 1) {
				cnt++;
			}
		}
		System.out.println(cnt + 1);
	}
}
