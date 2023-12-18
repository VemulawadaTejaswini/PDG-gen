import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Integer a[] = new Integer[M];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
		long ans[] = new long[N + 1];
		Arrays.fill(ans, 0);
		ans[0] = (long)1;
		if(!Arrays.asList(a).contains(1)) {
			ans[1] = (long)1;
		} else {
			ans[1] = (long)0;
		}
		
		long p = 1000000007;
		for(int i = 2; i <= N; i++) {
			if(!Arrays.asList(a).contains(i)) {
				if(!Arrays.asList(a).contains(i - 1)) {
					ans[i] = ans[i - 1] % p;
				}
				if(!Arrays.asList(a).contains(i - 2)) {
					ans[i] = (ans[i] + ans[i - 2]) % p;
				}
			} else {
				ans[i] = (long)0;
			}
		}
		System.out.println(ans[N]);
	}
}
