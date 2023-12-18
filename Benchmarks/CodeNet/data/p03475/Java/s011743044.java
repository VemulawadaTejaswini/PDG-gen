import java.util.Scanner;

public class Main {
	
	static int n;
	static int c[], s[], f[];
	
	public static int solve(int start) {
		int ans = 0;
		if(start == n - 1)return 0;
		ans = s[start] + c[start];
		int t = ans;
		for(int i = start + 1; i < n - 1; ++i) {
			int tmp = (t - s[i]) / f[i];
			if((t - s[i]) % f[i] != 0)tmp++;
			if(t < s[i])tmp = 0;
			tmp = s[i] + (f[i] * tmp);
			tmp = tmp - t;
			ans += tmp + c[i];
			t += tmp + c[i];
		}
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = new int[n - 1];
		s = new int[n - 1];
		f = new int[n - 1];
		for(int i = 0; i < n - 1; ++i) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		int x = 0;
		sc.close();
		for(int i = 0; i < n; ++i) {
			x = solve(i);
			System.out.println(x);
		}
		
	}
}
