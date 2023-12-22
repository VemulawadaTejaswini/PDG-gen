import java.util.*;

class Main {

	static Scanner sc;

	static void solve() {

		int ans = 0;
		for (int i = 0; i < 5; ++i) {
			int tmp = sc.nextInt();
			if (tmp == 0) ans = i + 1;
		}

		System.out.println(ans);
	}
    
    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

		solve();
    }
}
