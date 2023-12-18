import java.util.*;
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
		double ave = 0;
		boolean flag = true;
		for(int i = 0; i < A; i++) {
			ave += v[N - 1 - i];
			if(i > 0 && v[N - 1 - i] != v[N - i]) {
				flag = false;
			}
		}
		ave = ave / A;
		System.out.println(BigDecimal.valueOf(ave).toPlainString());
		
		if(flag) {
			long temp = v[N - 1];
			long cnt = 0;
			for(int i = N - 1; i >= 0; i--) {
				if(temp == v[i]) cnt++;
			}
			long ans2 = 0;
			for(int i = A; i <= cnt; i++) {
				double ans = 1;
				for(int j = 0; j < cnt - i; j++) {
					ans *= (cnt - j);
				}
				for(int j = 1; j <= cnt - i; j++) {
					ans /= j;
				}
				ans2 += ans;
			}
			System.out.println((long)ans2);
		} else {
			long cnt1 = 0;
			long cnt2 = 0;
			for(int i = 0; i < N; i++) {
				if(v[i] == v[N - 1 - A]) {
					cnt1++;
					if(i < N - 1 - A) cnt2++;
				}
			}
			
			if(cnt2 == 0) {
				System.out.println(1);
			} else {
				double ans = 1;
				for(int i = 0; i < cnt1 - cnt2; i++) {
					ans *= (cnt1 - i);
				}
				for(int i = 1; i <= cnt1 - cnt2; i++) {
					ans /= i;
				}
				System.out.println((int)ans);
			}
			
		}
	}
}
