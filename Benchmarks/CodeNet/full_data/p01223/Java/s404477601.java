
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int c=0;c<t;c++) {
			int n = sc.nextInt();
			int saizo[] = new int[n];
			for(int i=0;i<n;i++) {
				saizo[i] = sc.nextInt();
			}
			
			int up = 0;
			int down = 0;
			for(int i=0;i<n-1;i++) {
				up = max(up, saizo[i+1] - saizo[i]);
				down = max(down, saizo[i] - saizo[i+1]);
			}
			System.out.println(up + " " + down);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}