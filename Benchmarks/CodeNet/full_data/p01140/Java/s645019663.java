import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, m;
		List<Integer> hlist = new ArrayList<Integer>();
		List<Integer> wlist = new ArrayList<Integer>();
		while (true) {
			n = sc.nextInt(); m = sc.nextInt();
			if (n == 0 && m == 0) break;
			int[] h = new int[n+1];
			int[] w = new int[m+1];
			for (int i = 0; i < n; i++)
				h[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				w[i] = sc.nextInt();
			
			hlist.clear(); wlist.clear();
			int sum;
			for (int i = 1; i <= n; i++) {
				sum = 0;
				for (int j = 0; j < i; j++) sum += h[j];
				for (int j = 0; j <= n-i; j++) {
					hlist.add(sum);
					sum -= h[j];
					sum += h[j+i];
				}
			}
			out.println();
			for (int i = 1; i <= m; i++) {
				sum = 0;
				for (int j = 0; j < i; j++) sum += w[j];
				for (int j = 0; j <= m-i; j++) {
					wlist.add(sum);
					sum -= w[j];
					sum += w[j+i];
				}
			}
			
			int ans = 0;
			for (int a : hlist)
				ans += Collections.frequency(wlist, a);
			out.printf("%d",ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}