import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), p = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] m = new int[p]; int ans = 0;
		if(n==2) {
			for (int i = 0; i < n; i++) {
				if(s[i]%n==0) ans += i+1;
			}
		}else {
			int u = 0;
			int dig = 1;
			for (int i = n-1; i >= 0; i--) {
				u += (s[i]-'0')*dig;
				u %= p;
				ans += m[u];
				if(u==0) ans++;
				m[u]++;
				dig *= 10;
				dig %= p;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}