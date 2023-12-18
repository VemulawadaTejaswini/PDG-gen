import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		boolean isPossible = true;
		for (int i = 0; i < n; i++) {
			int abs = sc.nextInt();
			a[abs]++;
			
			if (n % 2 == abs % 2 || a[abs] >= 3) {
				isPossible = false;
				break;
			}
		}
		
		long ans = 1;
		for (int i = (n % 2) ^ 1; i < n && isPossible; i += 2) {
			if (i == 0 && a[i] != 1 || (i > 0 && a[i] != 2)) {
				isPossible = false;
				break;
			}
			
			if (i > 0) {
				ans = mlt(ans, 2);
			}
		}
		
		if (!isPossible) ans = 0;
		
		System.out.println(ans);
		
		sc.close();
	}
	
	public static long mlt(long a, long b) {
		final long MOD = 1_000_000_007;
		return ((a % MOD) * (b % MOD)) % MOD;
	}
}

