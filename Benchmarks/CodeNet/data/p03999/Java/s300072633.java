import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		long ans = 0;
		for(int i = 0 ; i < (1<<(n - 1)) ; i++) {
			String t = s; int x = n;
			for(int j = 0 ; j < n - 1 ; j++) {
				if((i & (1<<j)) != 0) {
					t = t.substring(0, j + 1 + t.length() - x) + "+" + t.substring(j + 1 + t.length() - x);
				}
			}
			t = t.replace("+", "A");
			String[] u = t.split("A");
			for(int j = 0 ; j < u.length ; j++) {
				ans += Long.valueOf(u[j]);
			}
		}
		System.out.println(ans);
	}
}
