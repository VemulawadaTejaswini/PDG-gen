import java.util.*;

public class Main {

	void solve() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		if(x == 3 || x == 5 || x == 7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
