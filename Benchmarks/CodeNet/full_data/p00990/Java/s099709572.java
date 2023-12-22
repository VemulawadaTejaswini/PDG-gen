import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int m;
	int[] a;
	int oddcount, evencount;
	
	int calc(int oc, int ec, int s) {
		if (oc == 0 && ec == 0) {
			if (s % 10 == 0) return 1;
			else return 0;
		} else {
			int ans = 0;
			if (oc > 0) {
				for (int i = 0; i < m; i++) {
					ans += calc(oc-1, ec, s+a[i]);
				}
			} else {
				for (int i = 0; i < m; i++) {
					if (2*a[i] < 10) {
						ans += calc(oc, ec-1, s+2*a[i]);
					} else {
						ans += calc(oc, ec-1, s+1+2*a[i]-10);
					}
				}
			}

			return ans;
		}
	}
	
	void run() {
		int n = sc.nextInt(); 
		String ID = sc.next(); 
		char[] id = ID.toCharArray();
		m = sc.nextInt();
		a = new int[m];
		for (int i = 0; i < m; i++)
			a[i] = sc.nextInt();
		
		oddcount = evencount = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (id[n-i] == '*') {
				if (i % 2 == 0) evencount++;
				else oddcount++;
			} else {
				int t = Integer.parseInt(""+id[n-i]);
				if (i % 2 == 0) {
					if (2*t < 10) sum += 2*t;
					else sum += 1+2*t-10;
				} else {
					sum += t;
				}
			}
		}
		
		out.println(calc(oddcount, evencount, sum));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}