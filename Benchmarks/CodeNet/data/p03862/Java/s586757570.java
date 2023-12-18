import java.util.*;
import java.text.DecimalFormat;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble(), x = sc.nextDouble(), t = 0, no = n;
		double[] a = new double[(int)n];
		int j = 0;
		while (no-->0) a[j++] = sc.nextDouble();
		for (int i=0; i<n-1; i++) {
			if (a[i]+a[i+1]>x) {
				t+=a[i+1]-(x-a[i]);
				a[i+1] = x-a[i];
			}
		}
		System.out.println(new DecimalFormat("#").format(t));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}