import java.util.Scanner;
public class Main {
	
		public static void main(String[] args) {
			try(Scanner sc = new Scanner(System.in)){
				int n = sc.nextInt();
				long[] s = new long[n];
				long[] f = new long[n+1];
				int mod = 1000000007;
				f[0] = 0;
				 long d = 0;
				for(int x = 0;x < n;x++) {
					s[x] = sc.nextInt();
				}
				for(int x = 1;x <= n;x++) {
					f[x] = f[x-1]+s[x-1];
				}
				for(int x = 0;x < n;x++) {
					long sum = f[n] - f[x + 1];
					d += s[x] * sum; 
					d = d % mod;
				}
				System.out.println(d);
			}
		}
}

