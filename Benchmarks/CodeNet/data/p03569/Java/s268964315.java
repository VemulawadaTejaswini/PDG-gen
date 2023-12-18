import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int ans = 0, l = 0, r = n - 1;
		while(l < r) {
			if(s.charAt(l) == s.charAt(r)) {
				l++; r--;
			} else {
				if(s.charAt(l) != 'x' && s.charAt(r) != 'x') {
					System.out.println(-1);
					return;
				} else {
					if(s.charAt(l) == 'x') {
						l++;
						ans++;
					}
					if(s.charAt(r) == 'x') {
						r--;
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
