import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e5 + 1;

	int N;
	int[] A, num;
	void doIt() {
		N = sc.nextInt();
		int M = sc.nextInt();
		A = new int[N];//値
		num = new int[LEN];//累積人数
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			num[A[i]]++;
		}
		for(int i = LEN - 2; i >= 0; i--) {
			num[i] += num[i + 1];
		}
		int l = 0, r = LEN, m = 0;
		while(l <= r) {
			m = (l + r) / 2;
			long n = getNum(m);
			if(n < M) {
				r = m - 1;
			}
			else if(n > M){
				l = m + 1;
			}
			if(n == M) {
				break;
			}
			//System.out.println(l + " " + m + " " + r + " " + n);
		}
		Arrays.sort(A);
		long sum[] = new long[LEN];
			
		for(int i = N - 1; i >= 0; i--) {
			sum[A[i]] += A[i];
		}
		for(int i = LEN - 2; i >= 0; i--) {
			sum[i] += sum[i + 1];
		}
		long ans = 0;
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			ans += sum[Math.max(m - A[i], 0)];
			ans += A[i] * num[Math.max(m - A[i], 0)];
			cnt += num[Math.max(m - A[i], 0)];
			//System.out.println(ans);
		}
		ans -= (cnt - M ) * m;
		//System.out.println();
		//System.out.println(m);
		System.out.println(ans);
		/*for(int i = 0; i < 100; i++) {
			System.out.println(sum[i]);
		}
		for(int i = 0; i < 100; i++) {
			System.out.println(i + " : " + sum[i]);
		}
		*/
	}
	long getNum(int m) {
		long ans = 0; //人数
		for(int i = 0; i < N; i++) {
			ans += num[Math.max(m - A[i], 0)];
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
