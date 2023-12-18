import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sC();
	}
	
	void sC() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int gcd = gcd(a[0], a[1]);
		for(int i = 2; i < n; i++) {
			gcd = gcd(gcd, a[i]);
		}
		System.out.println(gcd);
	}
	
	int gcd(int m, int n) {
		while(m % n != 0) {
			int work = n;
			n = m % n;
			m = work;
		}
		return n;
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
