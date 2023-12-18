import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		System.out.println(Math.max(A+B, Math.max(A-B, A*B)));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}