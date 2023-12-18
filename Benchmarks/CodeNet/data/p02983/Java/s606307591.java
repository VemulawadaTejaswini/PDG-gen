import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int mod = 2019;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		l %= mod;
		int r = sc.nextInt();
		r %= mod;

		int ans = 2018;
		for(int i=l+1; i<=r; i++) {
			for(int j=l; j<i; j++) {
				int tmp = i*j;
				tmp %= mod;
				ans = Math.min(ans, tmp);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
