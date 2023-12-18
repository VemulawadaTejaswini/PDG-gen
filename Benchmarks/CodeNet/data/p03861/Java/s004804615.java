import java.util.*;
import java.text.DecimalFormat;
// warm-up
// Highly embarassing last submission. Hope this one works
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble(), b=sc.nextDouble(), x=sc.nextDouble();
		System.out.println(new DecimalFormat("#").format(Math.floor(b/x)-Math.ceil(a/x)+1));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}
