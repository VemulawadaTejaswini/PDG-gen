import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(a+b>=10 ? "error" : a+b);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}