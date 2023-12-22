
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			int cost = sc.nextInt();
			int y = sc.nextInt();
			int m = sc.nextInt();
			int ans = cost;
			for(int j=0;j<m;j++) {
				int th = sc.nextInt();
				double r = sc.nextDouble();
				int yr = sc.nextInt();
				int tmp = cost;
				int rr = 0;
				if( th == 0 ) {
					for(int k=0;k<y;k++) {
						rr += r*tmp;
						tmp -= yr;
					}
					tmp += rr;
					ans = max(ans, tmp);
				}
				else {
					for(int k=0;k<y;k++) {
						tmp += r*tmp-yr;
					}
					ans = max(ans, tmp);
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}