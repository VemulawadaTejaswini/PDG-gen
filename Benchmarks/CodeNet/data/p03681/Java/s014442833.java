import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mod = 1000000007;
		int dis = Math.abs(n - m);
		long N = 1;
		long M = 1;
		if(dis >= 2) {
			System.out.println(0);
		} else if(dis == 1) {
			for(int i = n ; i >= 1 ; i--) {
				N = N * i % mod;
			}
			for(int i = m ; i >= 1 ; i--) {
				M = M * i % mod;
			}
			System.out.println(N * M % mod);
		} else {
			for(int i = n ; i >= 1 ; i--) {
				N = N * i % mod;
			}
			for(int i = m ; i >= 1 ; i--) {
				M = M * i % mod;
			}
			System.out.println(N * M * 2 % mod);
		}
	}
}
