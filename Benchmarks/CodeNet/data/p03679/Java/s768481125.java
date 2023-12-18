import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		if (B-A<=0) System.out.println("delicious");
		else if (B-A<=X) System.out.println("safe");
		else System.out.println("dangerous");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}