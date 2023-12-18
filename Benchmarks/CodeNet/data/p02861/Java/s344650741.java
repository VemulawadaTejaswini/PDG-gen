import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		new Main(new Scanner(System.in), System.out, System.err).exec();
	}
	public final Scanner sc;
	public final PrintStream out, err;
	public Main(final Scanner sc, final PrintStream out, final PrintStream err) {
		this.sc = sc;this.out = out;this.err = err;
	}
	static private final long pair(int a, int b) {return (((long)a) << 32) + b;}
	static private final int upper(long v) {return (int)(v >> 32);}
	static private final int lower(long v) {return (int)(v & 0xFFFFFFFF);}

	//-----------------------------------------

	static private final long load(int end, int length) {
		return pair(end, length);
	}
	static private final int end(long load) {
		return upper(load);
	}
	static private final int length(long load) {
		return lower(load);
	}
	static private final long score(int count, int last) {
		return pair(count, last);
	}
	static private final int count(long score) {
		return upper(score);
	}
	static private final int last(long score) {
		return lower(score);
	}

	//------------------------------------------

	public void exec() throws Exception{
		final int N = sc.nextInt();
		final long[][] P = new long[N][2];
		final int x = 0;
		final int y = 1;

		for(int i=0;i<N;i++) {
			P[i][x] = sc.nextLong();
			P[i][y] = sc.nextLong();
		}

		final double[][] D = new double[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i!=j) {
					D[i][j] = Math.sqrt(
							1.0*(
									(P[i][x]-P[j][x])*(P[i][x]-P[j][x]) +
									(P[i][y]-P[j][y])*(P[i][y]-P[j][y])
							));
				}
			}
		}
		boolean[] flags = new boolean[N];
		double sum = 0;
		int route[] = new int[N];
		cnt=0;
		for(int i=0;i<N;i++) {
			flags[i]=true;
			route[0]=i;
			sum += search(route, flags, D, 1, N, i, 0);
			flags[i]=false;
		}
//		err.println(sum);
//		err.println(N*(N+1)/2);
//		err.println(cnt);
		out.println(sum/cnt);
	}
	private int cnt = 0;

	private double search(int[] route, boolean[] flags, double[][] D, int depth, int N, int pos, double now) {
		if(depth == N-1) {
			cnt++;
			// 次が最終
			for(int i=0;i<N;i++) {
				if(!flags[i]) {
					route[depth]=i;
//					err.println(Arrays.toString(route));
					return now+D[pos][i];
				}
			}
		}
		double sum = 0;
		for(int i=0;i<N;i++) {
			if(!flags[i]) {
				flags[i]=true;
				route[depth]=i;
				sum+=search(route, flags, D, depth+1, N, i, now+D[pos][i]);
				flags[i]=false;
			}
		}
		return sum;
	}

}
