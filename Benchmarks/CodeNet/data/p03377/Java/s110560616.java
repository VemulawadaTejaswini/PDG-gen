import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), X = sc.nextInt();
		if (X-A>=0 && X-A<=B) System.out.println("YES");
		else System.out.println("NO");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}