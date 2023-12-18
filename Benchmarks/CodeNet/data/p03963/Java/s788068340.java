import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double k = sc.nextDouble(), t = 1;
		for (int i=0; i<n; i++) {
			t*=k--;
			if (t>Integer.MAX_VALUE) break;
		}
		System.out.println(new Double(t).intValue());
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}