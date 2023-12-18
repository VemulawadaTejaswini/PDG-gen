import java.util.Scanner;

public class Main {
	
	static int r = (int)Math.pow(10,  9) + 7;
	static int n;
	static long precomb[][];
	
	
	public static long comb(int n, int r) {
		if(r < 0 || n < 0)return 0;
		if(r == 0)return 1;
		if(precomb[n][r] > 0)return precomb[n][r];
		
		long ans = 1;
		
		for(int i = 0; i < r; ++i) {
			ans *= n - i;
			ans /= (i + 1);
		}
		precomb[n][r] = ans;
		return ans;
	}
	
	public static long solve(int a[], int k, int snum[]) {
		long ans = 0, tmp;
		int n = a.length;
		
		for(int i = 0; i <= n - k; ++i) {
			if(i == snum[1])continue;
			tmp = comb(n - i - 1, k - 1);
			if(i < snum[0])tmp -= comb(n - snum[1] - 1, k - 2);
			ans += tmp;
			ans %= r;
		}
		
		ans %= r;
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[], count[];
		
		n = sc.nextInt();
		a = new int[n + 1];
		count = new int[n + 1];
		precomb  = new long[n + 1][n + 1];
		
		for(int i = 0; i <= n; ++i) {
			a[i] = sc.nextInt();
			++count[a[i]];
		}
		sc.close();
		
		long ans = 0;
		int s = 0, snum[];
		snum = new int[2];
		
		for(int i = 0; i < n + 1; ++i) {
			if(count[i] == 2)s = i;
		}
		
		int k = 0;
		for(int i = 0; i < n + 1; ++i) {
			if(a[i] == s) {
				snum[k] = i;
				++k;
			}
		}
		
		for(int i = 1; i <= n + 1; ++i) {
			ans = solve(a, i, snum);
			System.out.println(ans);
		}
		
	}

}
