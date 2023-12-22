import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static Scanner sc = new Scanner(System.in);
	
	
	void run() {
		int n, ans;
		boolean[] sieve;
		while (sc.hasNextInt()) {
			n = sc.nextInt();
			ans = 0;
			sieve = new boolean[n+1];
			if (n <= 1) System.out.println(0);
			else {
				for (int i = 2; i <= n; i++) {
					if (!sieve[i]) {
						ans++;
						for (int j = 2; j * i <= n; j++)
							sieve[j*i] = true;
					}
				}
				System.out.println(ans);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}