import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextInt();
		int M = sc.nextInt();
		long prev = X, ans = X, x = 0;
		int st = -1, end = -1;
		long[] sum = new long[M+2];
		sum[0] = X;
		List<Long> l = new ArrayList<>();
		Set<Long> s = new HashSet<>();
		l.add(X);
		s.add(X);
		for(int i = 1; i < N; i++) {
			long mod = prev * prev % M;
			ans += mod;
			sum[i] = sum[i-1] + mod;
			if(!s.contains(mod)) {
				s.add(mod);
				l.add(mod);
			}
			else {
				x = mod;
				end = i;
				st = l.indexOf(mod);
				break;
			}
			prev = mod;
		}
		int T = end - st;
		if(end != -1 && end < N) {
			ans = (N - st) / T * (sum[end] - sum[st]);
			ans += sum[st];
			if((N - st) % T != 0)
				ans += sum[(int)((N - st) % T - 1) + st] - sum[st];
			if(st == 0)
				ans -= x;
		}
		System.out.println(ans);
	}

}
