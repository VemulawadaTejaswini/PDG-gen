import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), t = 1;
		while (N-->0) t = Math.min(2*t, t+K);
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}