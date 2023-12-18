import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long K = scn.nextLong();
		int[] A = new int[N];

		final long MOD = 1000000007;

		for(int i = 0;i < N;i++) {
			A[i] = scn.nextInt();
		}

		long[] sin = new long[N], dob = new long[N];

		for(int i = 0;i < N;i++) {
			long buf = 0;
			for(int j = 0;j < N;j++) {
				if(A[i] > A[j]) {
					buf++;
				}
			}
			dob[i] = buf;
		}
		for(int i = 0;i < N;i++) {
			long buf = 0;
			for(int j = i+1;j < N;j++) {
				if(A[i] > A[j]) {
					buf++;
				}
			}
			sin[i] = buf;
		}

		long ans = 0;
		for(int i = 0;i < N;i++) {
			ans += (sin[i]*K)%MOD;
			ans += ((((K)*(K-1)/2)%MOD) * dob[i])%MOD;
			ans %= MOD;
		}
		System.out.println(ans);

	}

}
