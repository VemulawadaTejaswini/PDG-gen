import java.util.*;

public class Main {

	static final int r = 2019;

	//n C 2
	public static long comb(int n) {
		return (long)n * (long)(n - 1) / 2;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		long ans = 0;
		int n = s.length();
		int mod[] = new int[r];
		int t[] = new int[n + 1];
		long m = 1;
		for(int i = n - 1; i >= 0; --i){
			int tmp = t[i + 1] + (int)m * (int)(s.charAt(i) - '0');
			tmp %= r;
			t[i] = tmp;
			mod[tmp]++;
			m *= 10;
			m %= (long)r;
		}
		ans = mod[0];
		for(int i = 1; i < r; ++i){
			ans += comb(mod[i]);
		}
		System.out.println(ans);
	}
}
