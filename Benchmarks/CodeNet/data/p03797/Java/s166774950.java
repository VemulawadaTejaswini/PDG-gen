import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong(), m=sc.nextLong(), t=0;
		if (m<n) t=m/2;
		else {
			t+=n; 
			m-=(n*2); 
			t+=(m/4);
		}
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}