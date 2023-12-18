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


	static private final long cat(int a, int b) {
		return (((long)a) << 32) + b;

	}
	static private final long load(int end, int length) {
		return cat(end, length);
	}
	static private final int end(long load) {
		return (int)(load >> 32);
	}
	static private final int length(long load) {
		return (int)(load & 0xFFFFFFFF);
	}
	static private final long score(int count, int last) {
		return cat(count, last);
	}
	static private final int count(long score) {
		return (int)(score >> 32);
	}
	static private final int last(long score) {
		return (int)(score & 0xFFFFFFFF);
	}
	public void exec() throws Exception{
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		final int L = sc.nextInt();
		final long[][] table = new long[N+1][N];
		final int[] tableSize = new int[N+1];
		for(int i=1;i<=M;i++) {
			final int A_i = sc.nextInt();
			final int B_i = sc.nextInt();
			final int C_i = sc.nextInt();
			if(C_i > L) {
				continue;
			}else {
				table[A_i][tableSize[A_i]]=load(B_i, C_i);
				tableSize[A_i]++;
				table[B_i][tableSize[B_i]]=load(A_i, C_i);
				tableSize[B_i]++;
			}
		}
		final int Q = sc.nextInt();
		final int[] s = new int[Q];
		final int[] t = new int[Q];
		for(int i=0;i<Q;i++) {
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}

		final long[] SCORE = new long[N+1];
		final int[] next = new int[N];
		final int[] next_t = new int[N];
		final boolean[] contains = new boolean[N+1];
		int nextSize = 0;
		int nextSize_t = 0;
		final long INIT_SCORE = Long.MAX_VALUE & 0xFFFFFFFF00000000L;
		for(int q=0;q<Q;q++) {
			Arrays.fill(SCORE, INIT_SCORE);
			final int si = s[q];
			final int ti = t[q];
			SCORE[si]=score(0, L);
			nextSize = 1;
			next[0]=si;

			while(nextSize!=0) {
				nextSize_t=0;
				Arrays.fill(contains, false);
				for(int i=0;i<nextSize;i++) {
					final int town_s = next[i];
					if(town_s==ti) {
						continue;
					}
					final long score_n = SCORE[town_s];
					final int last_n = last(score_n);
					final int count_n = count(score_n);
					for(int j=0;j<tableSize[town_s];j++) {
						final long load = table[town_s][j];
						final int town_e = end(load);
						final int length = length(load);

						int last_t = 0;
						int count_t = count_n;
						if(length > last_n) {
							count_t++;
							last_t = L - length;
						}else {
							// 補給せず燃料だけ減らす。
							last_t = last_n - length;
						}
						final long score_j = SCORE[town_e];
						final int count_j = count(score_j);
						final int last_j = last(score_j);

						if(count_j > count_t || (count_j == count_t && last_j < last_t)) {
							SCORE[town_e]=score(count_t, last_t);
							if(!contains[town_e]) {
								next_t[nextSize_t++]=town_e;
								contains[town_e]=true;
							}
						}
					}
				}
				for(int i=0;i<nextSize_t;i++) {
					next[i]=next_t[i];
				}
				nextSize = nextSize_t;
			}
			if(SCORE[ti]==INIT_SCORE) {
				out.println(-1);
			}else {
				out.println(SCORE[ti]>>32);
			}
		}
	}
}
