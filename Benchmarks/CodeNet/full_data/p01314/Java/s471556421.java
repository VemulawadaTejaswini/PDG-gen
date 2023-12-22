import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n;
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			int ans = 0, b;
			I:for (int i = 1; i <= n/2; i++) {
				b = i;
				for (int j = i+1; j <= n/2+1; j++) {
					b += j;
					if (b == n) {
						ans++;
						continue I;
					} else if (b > n) {
						continue I;
					}
				}
			}
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}