import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, m;
		int[] t, h;
		int tt, th;
		int tans, hans;
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0) break;
			t = new int[n];
			h = new int[m];
			tt = th = 0;
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				tt += t[i];
			}
			for (int i = 0; i < m; i++) {
				h[i] = sc.nextInt();
				th += h[i];
			}
			
			Arrays.sort(t);
			Arrays.sort(h);
			
			tans = hans = -1;
			int d = tt - th;
			if (d % 2 == 0) {
				I:for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						if (t[i] - h[j] == d/2) {
							tans = t[i];
							hans = h[j];
							break I;
						}
					}
				}
			}
			
			if (tans < 0)
				out.println(-1);
			else 
				out.printf("%d %d\n", tans, hans);
			
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}