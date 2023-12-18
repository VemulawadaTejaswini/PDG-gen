
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		int cnt = 0;
		for(int i = 1; i < n; i++) {
			if(s.charAt(i) == s.charAt(i - 1)) {
				ans++;
			} else {
				cnt++;
			}
		}
		boolean flag = cnt % 2 == 1;
		int div = cnt / 2;
		if(k <= div) {
			ans += k * 2;
		} else if(flag) {
			ans += div * 2;
			ans++;
		} else {
			ans += div * 2;
		}
		System.out.println(ans);
	}

}
