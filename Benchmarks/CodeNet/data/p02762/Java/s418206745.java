import java.io.PrintStream;
import java.util.Arrays;
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
	static public final long pair(int a, int b) {return (((long)a) << 32) + b;}
	static public final int getPair1(long v) {return (int)(v >> 32);}
	static public final int getPari2(long v) {return (int)(v & 0xFFFFFFFF);}

	static public final long quad(long a, long b, long c, long d) {
		return ((a&0xFFFF)<< 48) + ((b&0xFFFF)<< 32) + ((c&0xFFFF)<< 16) +(d&0xFFFF);}
	static public final int getQuad1(long v) {return (int)( v >> 48          );}
	static public final int getQuad2(long v) {return (int)((v >> 32) & 0xFFFF);}
	static public final int getQuad3(long v) {return (int)((v >> 16) & 0xFFFF);}
	static public final int getQuad4(long v) {return (int)( v        & 0xFFFF);}

	static public final long record(int e, int m, int i) {
		return quad(-1, e, m, i);
	}
	static public final int re(long record) {
		return getQuad2(record);
	}
	static public final int rm(long record) {
		return getQuad3(record);
	}
	static public final int ri(long record) {
		return getQuad4(record);
	}

	//------------------------------------------

	private int p;
	private int[] inv;
	private int[] fact;
	private int[] finv;
	public final int mod(long v) {
		return mod(v, p);
	}
	static public final int mod(long v, int M) {
		v %= M;
		return (int)(v < 0 ? v+M : v);
	}
	/**
	 * a * b (mod p)
	 * 事前にinitFactを行うこと。
	 */
	public final int mul(long a, long b) {
		return mod(a*b);
	}
	public final void initFact(double limit, double p) {
		initFact((int)limit, (int)p);
	}
	/**
	 * 集合数nの組み合わせ計算を高速化するため、事前に計算を行う。
	 * 組み合わせ数はpで割った余りを算出する。
	 */
	public final void initFact(int n, int p) {
		this.p = p;
		this.inv = new int[n+1];
		this.fact = new int[n+1];
		this.finv = new int[n+1];
		fact[1] = finv[1] = inv[0] = inv[1] = 1;
		for(int i=2;i<=n;i++) {
			int a = p / i;
			int b = p % i;
			inv[i]  = mul(-a, inv[b]);
			fact[i] = mul(fact[i-1], i);
			finv[i] = mul(finv[i-1], inv[i]);
		}
	}
	/**
	 * mCnを計算する。事前にinitFactを実行すること。
	 */
	public final int comb(int m, int n) {
		return mul(mul(fact[m], finv[n]), finv[m-n]);
	}
	/**
	 * a^b (mod M)を計算する。
	 */
	public static long pow(long a, long b, int M) {
		long ret = 1;
		long tmp = a;
		while (b > 0) {
			if ((b & 1) == 1) {
				ret = (ret * tmp) % M;
			}
			tmp = (tmp * tmp) % M;
			b = b >> 1;
		}
		return ret;
	}
	/**
	 * nCk (mod M)を計算する。
	 */
	public static int nCk(int n, int k, int M) {
		long ret = 1;
		int min = Math.min(k, n - k);
		// 分母
		for (int i = 1; i <= min; i++) {
			// a^-1 ≡ a^M-2  ※フェルマーの小定理
			ret = (ret * pow(i, M - 2, M)) % M;
		}
		// 分子
		for (int i = n - min + 1; i <= n; i++) {
			ret = (ret * i) % M;
		}
		return (int) ret;
	}
	//------------------------------------------
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (long)(c/b);
	}

	//------------------------------------------


	static public final int FRIEND = 1;
	static public final int BLOCK = -1;
	class Chain{
		public Chain(Chain next, int target, int type) {
			this.next = next;
			this.target = target;
			this.type = type;
		}
		Chain next;
		int target;
		int type;
	}

	public void exec() throws Exception{

		final int N = sc.nextInt();
		final int M = sc.nextInt();
		final int K = sc.nextInt();

		// 0無関係、1友好、-1ブロック
/*		final int[][] LINK = new int[N+1][N+1];
		for(int i=0;i<M;i++) {
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			LINK[A][B] = LINK[B][A] = FRIEND;
		}
		for(int i=0;i<K;i++) {
			final int C = sc.nextInt();
			final int D = sc.nextInt();
			LINK[C][D] = LINK[D][C] = BLOCK;
		}*/
		final Chain[] chains = new Chain[N+1];
		for(int i=0;i<M;i++) {
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			chains[A] = new Chain(chains[A], B, FRIEND);
			chains[B] = new Chain(chains[B], A, FRIEND);
		}
		for(int i=0;i<K;i++) {
			final int C = sc.nextInt();
			final int D = sc.nextInt();
			chains[C] = new Chain(chains[C], D, BLOCK);
			chains[D] = new Chain(chains[D], C, BLOCK);
		}

		final int[] ANS = new int[N+1];
		Arrays.fill(ANS, -1);
		final boolean[] CLS = new boolean[N+1];
		final int[] TMP = new int[N+1];

		for(int i=1;i<=N;i++) {
			if(ANS[i]!=-1) {
				continue;
			}
			Arrays.fill(CLS, false);
			findCluster(CLS, chains, i, TMP, N);
//			err.println(i+"/"+Arrays.toString(CLS));
			for(int j=i;j<=N;j++) {
				// クラスタに含まれるならカウントする。
				if(CLS[j]) {
					ANS[j] = count(CLS, chains, j, TMP, N);
				}
			}
		}
		for(int i=1;i<N;i++) {
			out.print(ANS[i]+" ");
		}
		out.println(ANS[N]);
	}
	public int count(final boolean[] CLS, final Chain[] chains, final int base, final int[] TMP, final int N) {
		int num = 0;
		Chain c = chains[base];
		int tail = 0;
		int head = 0;
		while(c != null) {
			TMP[tail] = c.target;
			c = c.next;
			tail ++;
		}
		Arrays.sort(TMP, 0, tail);
		for(int i=1;i<=N;i++) {
			// chainに含まれているならスキップ
			if(head != tail && TMP[head] == i) {
				head++;
				continue;
			}
			// 含まれていない、かつ、自分でないならカウントする。
			if(CLS[i] && base != i) {
				num++;
			}
		}
		return num;
	}
	public void findCluster(final boolean[] CLS, final Chain[] chains, final int base, final int[] TMP, final int N) {
		int tail = 0;
		int head = 0;
		TMP[tail] = base;
		tail++;
		CLS[base] = true;
		while(head != tail) {
			final int a = TMP[head];
			head++;
			Chain c = chains[a];
			while(c != null) {
				if(!CLS[c.target] && c.type == FRIEND) {
					CLS[c.target]=true;
					TMP[tail]=c.target;
					tail++;
				}
				c = c.next;
			}
		}
	}
}
