import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		boolean a = scan.nextInt() % 2 != 0;
		boolean b = scan.nextInt() % 2 != 0;
		System.out.println(a && b ? "Yes" : "No");
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
