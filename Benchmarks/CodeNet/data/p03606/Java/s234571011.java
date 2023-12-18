import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), t = 0;
		while (N-->0) {
			int a = sc.nextInt(), b = sc.nextInt();
			t+=(b-a)+1;
		}
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}