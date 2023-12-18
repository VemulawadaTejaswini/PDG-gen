
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t[], m, p, x;
		n = sc.nextInt();
		t = new int[n];
		
		int ans = 0;
		
		for(int i = 0; i < n; ++i) {
			t[i] = sc.nextInt();
			ans += t[i];
		}
		
		m = sc.nextInt();
		
		for(int i = 0; i < m; ++i) {
			p = sc.nextInt();
			x = sc.nextInt();
			ans -= t[p - 1];
			ans += x;
			System.out.println(ans);
			ans -= x;
			ans += t[p - 1];
		}
		
		sc.close();
	}

}
