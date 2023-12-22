import java.util.Scanner;

public class Main {

	private static long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if(n==1) {
			System.out.println(0);
			return;
		}

		if(n==2) {
			System.out.println(2);
			return;
		}

		long aa = 1L;
		for(int i=1;i<=n-2;i++) {
			aa = aa * 10L%MOD;
		}

		long ans = bigFactorial(n)*aa%MOD;
		System.out.println(ans);
	}

	static long bigFactorial(int n) {
		long[] ar = new long[n];
		for (int i=0; i<n; i++) {
			ar[i] = i+1;
		}
		long t = 1L;
		long length = ar.length;
		while (t <= length) {
			for (int i=0; i<length; i+=(t<<1)) {
				if (t+i < length) {
					ar[i] = ar[i]*ar[(int) (i+t)]%MOD;
				}
			}
			t = t<<1;
		}
		return ar[0];
	}
}
