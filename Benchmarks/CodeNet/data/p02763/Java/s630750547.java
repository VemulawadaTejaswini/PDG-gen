import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

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



	public void exec() throws Exception{
		final int N = sc.nextInt();
		final String str = sc.next();
		final int[] S = new int[N+1];
		for(int i=1;i<=N;i++) {
			S[i] = str.charAt(i-1)-'a';
		}
		final int Q = sc.nextInt();

		class Query{
			public Query(int type, int q1, int q2) {
				this.type = type;
				this.q1 = q1;
				this.q2 = q2;
			}
			int type;
			int q1, q2;
		}
		final TreeMap<Integer, int[]> map = new TreeMap<>();
		Query[] queries = new Query[Q];
		for(int i=0;i<Q;i++) {
			final int type = sc.nextInt();
			if(type == 1) {
				final int a = sc.nextInt();
				final int b = sc.next().charAt(0)-'a';
				queries[i] = new Query(type, a, b);
			}else {
				final int a = sc.nextInt();
				final int b = sc.nextInt();
				queries[i] = new Query(type, a, b);
				map.put(a,   new int[26]);
				map.put(b+1, new int[26]);
			}
		}
		int[] num = new int[26];
		Iterator<Entry<Integer, int[]>> iter = map.entrySet().iterator();
		Entry<Integer, int[]> entry = iter.next();
		for(int i=1;i<=N;i++) {
			if(entry.getKey().equals(i)) {
				int[] t = entry.getValue();
				for(int a=0;a<26;a++) {
					t[a] = num[a];
				}
				if(iter.hasNext()) {
					entry = iter.next();
				}
			}
			num[S[i]]++;
		}
		map.put(N+1, num);

		for(int q = 0; q<Q; q++) {
			Query query = queries[q];
			if(query.type == 1) {
				for(int t[] : map.subMap(query.q1, N+2).values()) {
					t[S[query.q1]]--;
					t[query.q2]++;
				}
				S[query.q1] = query.q2;
				err.println(Arrays.toString(S));
			}else {
				int[] a = map.get(query.q1);
				int[] b = map.get(query.q2+1);
				int c = 0;
				for(int i=0;i<26;i++) {
					if(b[i]-a[i] > 0) {
						c++;
					}
				}
				out.println(c);
			}
		}


	}
}
