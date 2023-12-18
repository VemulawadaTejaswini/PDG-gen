import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n == 1) {
			System.out.println("Hello World");
			return;
		}
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a + b);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
