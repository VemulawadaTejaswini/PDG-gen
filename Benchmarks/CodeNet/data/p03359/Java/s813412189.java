import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(Math.min(a, Math.min(12,b)));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}