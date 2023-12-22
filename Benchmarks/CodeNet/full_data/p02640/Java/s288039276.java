import java.util.*;

class Main {

	static Scanner sc;

	static void solve() {
		int qnt = sc.nextInt();
		int legs = sc.nextInt();

		if (4*qnt < legs || legs < 2*qnt || legs % 2 != 0) {
			System.out.println("No");
			return;
		}

		System.out.println("Yes");
	}
    
    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

		solve();
    }
}
