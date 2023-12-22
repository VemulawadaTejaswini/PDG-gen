
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			int n = sc.nextInt();
			long sp[] = new long[n+1];
			sp[0] = 1;
			for(int i=1;i<=n;i++) {
				sp[i] = sp[i-1]+i;
			}
			System.out.println(sp[n]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}