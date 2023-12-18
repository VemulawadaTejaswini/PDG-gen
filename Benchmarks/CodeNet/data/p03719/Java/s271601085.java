import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		System.out.println((C>=A && C<=B) ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}