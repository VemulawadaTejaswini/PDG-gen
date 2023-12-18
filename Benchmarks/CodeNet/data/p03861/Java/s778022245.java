import java.util.*;
import java.text.DecimalFormat;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble(), b=sc.nextDouble(), x=sc.nextDouble(), t=0, i=0;
		while (true) {
			double c = x*i++;
			if (c>=a && c<=b) t++;
			else if (c>b) break;
		}
		System.out.println(new DecimalFormat("#").format(t));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}