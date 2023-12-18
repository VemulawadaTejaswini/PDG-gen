import java.util.*;
import java.text.DecimalFormat;
// warm-up
// Looks like initial solution was correct. Except precision issues
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		double n=sc.nextDouble(), m=sc.nextDouble(), t=0;
		if (m<n) t=Math.floor(m/2);
		else {
			t+=n;
			m-=(n*2); 
			t+=Math.floor(m/4);
		}
		System.out.println(new DecimalFormat("#").format(t));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}