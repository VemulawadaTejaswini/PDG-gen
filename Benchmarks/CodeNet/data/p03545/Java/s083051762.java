
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] a = new int[4];
		for(int i = 0 ; i < 4 ; i++) {
			a[i] = s.charAt(i) - '0';
		}
		for(int i = 0 ; i < (1<<3) ; i++) {
			String ans = "";
			int tot = 0;
			ans += (char)(a[0] + '0');
			tot += a[0];
			for(int j = 0 ; j < 3 ; j++) {
				if(((i>>j)&1) == 1) {
					ans += '+';
					ans += (char)(a[j + 1] + '0');
					tot += a[j + 1];
				} else {
					ans += '-';
					ans += (char)(a[j + 1] + '0');
					tot -= a[j + 1];
				}
			}
			if(tot == 7) {
				ans += '=';
				ans += '7';
				System.out.println(ans);
				return;
			}
		}
	}
}