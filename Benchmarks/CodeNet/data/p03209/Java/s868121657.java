
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		long burger = 1;
		for(int i = 0; i < N; i++) {
			burger = 3 + 2 * burger;
		}
		long ans = calc(burger, X);
		System.out.println(ans);
	}

	static long calc(long burger, long x) {
		long ans = 0;
		if(burger == 1) {
			ans = 1;
		} else {
			long tmp = (burger - 3) / 2;
			if(x < 2) {
				ans = 0;
			} else if(2 <= x && x < tmp + 2) {
				ans = calc(tmp, x - 1);
			} else if(tmp + 2 == x) {
				ans = calc(tmp, tmp);
				ans++;
			} else if(tmp + 2 < x && x < tmp * 2 + 3) {
				ans = calc(tmp, x - tmp - 2);
				ans += calc(tmp, tmp);
				ans++;
			} else if(tmp * 2 + 3 <= x) {
				ans = 2 * calc(tmp, tmp);
				ans++;
			}
		}
		return ans;
	}
}
