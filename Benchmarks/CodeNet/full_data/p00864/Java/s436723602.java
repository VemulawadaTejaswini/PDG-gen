import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int max(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(max < a[i])
				max = a[i];
		}
		return max;
	}
	
	void run() {
		int n, w;
		while (true) {
			n = sc.nextInt(); w = sc.nextInt();
			if (n == 0 && w == 0) break;
			int[] v = new int[n];
			for (int i = 0; i < n; i++)
				v[i] = sc.nextInt();
			int max = max(v);
			int num = max/w + 1;
			int[] x = new int[num];
			for (int i : v)
				x[i/w]++;
			
			int m = max(x);
			double ans = 0;
			for (int i = 0; i < num; i++) {
				ans += (double)(num-i-1)/(num-1)*x[i]/m;
			}
			
			out.println(ans+0.01);
		}
		
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}