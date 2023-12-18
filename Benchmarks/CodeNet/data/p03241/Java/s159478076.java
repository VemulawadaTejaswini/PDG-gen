import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		for(int i=1;i*i<=m;i++) {
			if (m % i != 0) continue;
			ans = Math.max(ans, f(i,n,m));
			ans = Math.max(ans, f(m/i,n,m));
		}
		System.out.println(ans);
	}
	public static int f(int i, int n, int m) {
		int g = i;
		int num = m / g;
		if (num < n) return 0;
		return g;
	}
}
