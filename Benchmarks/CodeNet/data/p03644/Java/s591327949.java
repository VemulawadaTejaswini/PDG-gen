import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = 1, b = 2, c = 0, n = sc.nextInt();
		while (2*a<=n) {
			a*=b; c++;
		}
		System.out.println((int)Math.pow(2,c));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}