import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final long K = sc.nextLong();
		final int A[] = new int[N];
		final int cnt[][] = new int[N][2];

		final long mod = 1000*1000*1000+7;

		final int prev = 0;
		final int next = 1;
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}

		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(A[i] > A[j]) {
					if(i<j) {
						cnt[i][next]++;
					}else {
						cnt[i][prev]++;
					}
				}
			}
		}
		final long Sn = K*(K+1)/2;
		final long Sp = Sn - K;


		long sum = 0;
		for(int i=0;i<N;i++) {
			sum += cnt[i][next]*Sn;
			sum = sum %mod;
			sum += cnt[i][prev]*Sp;
			sum = sum % mod;
		}

		out.println(sum);

	}
}
