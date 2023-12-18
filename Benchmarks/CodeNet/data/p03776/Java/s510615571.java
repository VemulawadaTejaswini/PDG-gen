import java.util.*;
import java.math.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long v[] = new long[N];
		for(int i = 0; i < N; i++) {
			v[i] = sc.nextLong();
		}
		
		Arrays.sort(v);
		long n = v[N - A];
		int cnt = 0;
		int cnt2 = 0;
		double sum = 0;
		for(int i = 0; i < A; i++) {
			sum += v[N - i - 1];
		}
		System.out.println(sum / A);
		
		for(int i = N - 1; i >= 0; i--) {
			if(v[i] == n) {
				cnt++;
			} else if(v[i] > n) {
				cnt2++;
			}
		}
		
		long ans = 0;
		long t = A - cnt2;
		long mod = 1000000007;
		for(int i = A; i <= B; i++) {
			if(cnt + cnt2 < i) {
				break;
			} else {
				long a = conv(cnt, i - cnt2, mod);
				System.out.println(a);
				ans += a;
			}
		}
		
		System.out.println(ans);
	}
	
	public static long conv(long m, long n, long mod) {
		BigInteger num = new BigInteger("1");
		for(int i = (int)n + 1; i <= (int)m; i++) {
			num = num.multiply(new BigInteger(String.valueOf(i)));
		}
		
		BigInteger num2 = new BigInteger("1");
		for(int i = 1; i <= m - n; i++) {
			num2 = num2.multiply(new BigInteger(String.valueOf(i)));
		}
		
		long ans = Long.parseLong(num.divide(num2).toString());
		return ans;
	}
}
