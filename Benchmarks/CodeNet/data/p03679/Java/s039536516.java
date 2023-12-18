import java.util.*;
// warm-up
// Expired???
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		if (B>A && B-A>X) System.out.println("dangerous");
		else if (B<A) System.out.println("delicious");
		else if (B<A+X) System.out.println("safe");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}