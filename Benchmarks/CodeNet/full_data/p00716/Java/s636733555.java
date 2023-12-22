import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int m;
		int money, year, n;
		m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			money = sc.nextInt();
			year = sc.nextInt();
			n = sc.nextInt();
			int max = 0;
			for (int j = 0; j < n; j++) {
				int ans = money;
				int a = sc.nextInt();
				double rate = sc.nextDouble();
				int fee = sc.nextInt();
				if (a == 0) {
					int pool = 0;
					for (int k = 0; k < year; k++) {
						pool += (int)Math.floor(ans*rate);
						ans -= fee;
					}
					ans += pool;
				} else {
					for (int k = 0; k < year; k++) {
						ans = ans + (int)Math.floor(ans*rate) -fee;
					}
				}
				max = Math.max(max, ans);
			}
			out.println(max);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}