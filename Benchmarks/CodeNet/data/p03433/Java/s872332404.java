import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt();
		boolean ok = false;
		while (true) {
			if (N<=0) break;
			if (N<=A) ok=true;
			N-=500;
		}
		System.out.println(ok ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}