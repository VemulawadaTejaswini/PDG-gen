import java.util.*;
import java.text.DecimalFormat;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), t = sc.nextInt(), i=0, no=n;
		double s = t;
		int[] T = new int[n];
		while (no-->0) T[i++] = sc.nextInt();
		for (i=0; i<n-1; i++) s+=Math.min(T[i+1]-T[i], t);
		System.out.println(new DecimalFormat("#").format(s));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}