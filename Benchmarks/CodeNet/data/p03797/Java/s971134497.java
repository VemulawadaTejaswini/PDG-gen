import java.util.*;
// warm-up
//Got it. Missed the condition around m<n
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong(), m=sc.nextLong(), t=0;
		if (m/2<n) t=m/2;
		else t=n+(m-n*2)/4;
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}