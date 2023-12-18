
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	private int f(int x) {
		int res = 0;
		while(res % 2 == 0) {
			res++;
		}
		return res;
	}

	private long gcd(long x, long y) {
		if(y == 0) return x;
		return gcd(y, x % y);
	}

	private long lcm(long x, long y) {
		return x / gcd(x,y) *  y;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			a[i] /= 2;
		}
		int t = f(a[0]);
		for(int i=1; i<n; i++) {
			if(t != f(a[i])) {
				System.out.println(0);
				sc.close();
				return;
			}
		}
		long l=1;
		for(int i=0; i<n; i++) {
			l = lcm(l, a[i]);
		}
		if(l>m) {
			System.out.println(0);
			sc.close();
			return;
		}
		long ans = m/l;
		ans = (ans+1)/2;
		System.out.println(ans);

		sc.close();
	}
}
