import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		new Main(new Scanner(System.in), System.out, System.err).exec();
	}
	private final Scanner sc;
	private final PrintStream out, err;
	public Main(final Scanner sc, final PrintStream out, final PrintStream err) {
		this.sc = sc;
		this.out = out;
		this.err = err;
	}

	public void exec() throws Exception{
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		final int L = sc.nextInt();
		final int[][] table = new int[N+1][N+1];
		for(int i=1;i<=M;i++) {
			final int A_i = sc.nextInt();
			final int B_i = sc.nextInt();
			final int C_i = sc.nextInt();
			if(C_i > L) {
				continue;
			}else {
				table[A_i][B_i]=C_i;
				table[B_i][A_i]=C_i;
			}
		}
		final int Q = sc.nextInt();
		final int[] s = new int[Q];
		final int[] t = new int[Q];
		for(int i=0;i<Q;i++) {
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}

		final long[] R = new long[N+1];
		final int[] next = new int[N];
		final int[] next_t = new int[N];
		int nextSize = 0;
		int nextSize_t = 0;
		for(int q=0;q<Q;q++) {
			Arrays.fill(R, Long.MAX_VALUE);
			nextSize=0;

			final int si = s[q];
			final int ti = t[q];
			R[si]=L;
			nextSize = 1;
			next[0]=si;

			while(nextSize!=0) {
				nextSize_t=0;
				for(int i=0;i<nextSize;i++) {
					final int n = next[i];
					if(n==ti) {
						continue;
					}
					final long score_n = R[n];
					final long last = (int)(score_n & 0xFFFFFFFF);
					final long count = (int)(score_n >> 32);
					for(int j=1;j<=N;j++) {
						if(table[n][j]==0) {
							continue;
						}
						long newScore = 0;
						if(table[n][j] > last) {
							// 補給して、燃料更新する。
							newScore = ((count + 1)<<32) + (L - table[n][j]);
						}else {
							// 補給せず燃料だけ減らす。
							newScore = score_n - table[n][j];
						}
						if(R[j] > newScore) {
							next_t[nextSize_t++]=j;
							R[j]=newScore;
						}
					}
				}
				for(int i=0;i<nextSize_t;i++) {
					next[i]=next_t[i];
				}
				nextSize = nextSize_t;
			}
			if(R[ti]==Long.MAX_VALUE) {
				out.println(-1);
			}else {
				out.println(R[ti]>>32);
			}
		}
	}
}
