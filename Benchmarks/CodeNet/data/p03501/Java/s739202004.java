import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		System.out.println(Math.min(N*A, B));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}