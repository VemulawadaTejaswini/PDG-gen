import java.util.*;
import java.text.DecimalFormat;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); double t=1;
		int m = 1000000007;
		for (double i=1; i<=n; i++) t=(t*i)%m;
		System.out.println(new DecimalFormat("#").format(t));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}