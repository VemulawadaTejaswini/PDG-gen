
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x[] = new int[n];
		x[0] = 0;
		for(int i=1;i<n;i++) {
			x[i] = sc.nextInt() + x[i-1];
		}
		int p = 0;
		long sum = 0;
		for(int i=0;i<m;i++) {
			int next = sc.nextInt();
			sum += abs( x[p + next] - x[p] );
			p = p + next;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}