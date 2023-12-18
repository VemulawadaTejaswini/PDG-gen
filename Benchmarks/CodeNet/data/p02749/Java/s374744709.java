import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
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
	static public final long pair(int a, int b) {return (((long)a) << 32) + (((long)b)&0xFFFFFFFF);}
	static public final int getPair1(long v) {return (int)(v >> 32);}
	static public final int getPair2(long v) {return (int)(v & 0xFFFFFFFF);}

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

	static class DisjointSetUnion {
		public int[] parent;
		public int[] weight;
		public int count;

		public DisjointSetUnion(int nodes) {
			count = nodes;
			parent = new int[nodes];
			weight = new int[nodes];
			for (int i = 0; i < nodes; i++) {
				parent[i] = i;
				weight[i] = 1;
			}
		}
		//"find"
		public int root(int p) {
			while (p != parent[p]) {
				p = parent[p];
			}
			return p;
		}

		//"union"
		public void connect(int p, int q) {
			int rootP = root(p);
			int rootQ = root(q);
			if (rootP == rootQ) return;
			if (weight[rootP] < weight[rootQ]) {
				parent[rootP] = rootQ;
				weight[rootQ] += weight[rootP];
			} else {
				parent[rootQ] = rootP;
				weight[rootP] += weight[rootQ];
			}
			count--;
		}

		public boolean connected(int p, int q) {
			return root(p) == root(q);
		}
	}
	static class IntList{
		int tail = 0;
		final int[] element;
		public IntList(int cap) {
			element = new int[cap];
		}
		public int size() {
			return tail;
		}
		public int get(int index) {
			return element[index];
		}
		public void reset() {
			tail = 0;
		}
		public void add(int v) {
			element[tail++] = v;
		}
	}
	static class Link{
		Link next;
		int node;
		public Link(int node, Link next) {
			this.node = node;
			this.next = next;
		}
	}
	static class Node implements Comparable<Node>{
		int index;
		int number;
		Link head;
		int cnt;
		boolean visited;
		Link threehead;
		int threecnt;
		Node chain;
		public Node(int index) {
			this.index = index;
		}
		public void link(int node) {
			this.head = new Link(node, this.head);
			cnt++;
		}
		public boolean isLeaf() {
			return cnt==1;
		}

		public void add(int node) {
			this.threehead = new Link(node, this.threehead);
			threecnt++;
		}
		public String toLinkString() {
			Link l = head;
			StringBuilder s = new StringBuilder();
			while(l!=null) {
				s.append(l.node).append(", ");
				l = l.next;
			}
			return s.toString();
		}

		public String toThreeString() {
			Link l = threehead;
			StringBuilder s = new StringBuilder();
			while(l!=null) {
				s.append(l.node).append(", ");
				l = l.next;
			}
			return s.toString();
		}
		@Override
		public int compareTo(Node o) {
			return this.threecnt - o.threecnt;
		}
	}

	public void exec() throws Exception{
		final int N = sc.nextInt();
		final Node[] nodes = new Node[N+1];
		for(int i=1;i<=N;i++) {
			nodes[i] = new Node(i);
		}
		for(int i=0;i<N-1;i++) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			nodes[a].link(b);
			nodes[b].link(a);
		}
		Node head = null;
		for(int i=N;i>=1;i--) {
			if(nodes[i].isLeaf()) {
				head = nodes[i];
				break;
			}
		}
		head.visited = true;
		LinkedList<Node> list = new LinkedList<>();
		list.add(head);
		while(!list.isEmpty()) {
			Node now = list.remove();

			Node d1 = null;
			Node d2 = null;

			// 隣接
			Link l1 = now.head;
			while(l1!=null) {
				Node n1 = nodes[l1.node];
				l1 = l1.next;
				if(n1.visited) {
					continue;
				}
				n1.chain = d1;
				d1 = n1;

				n1.visited = true;
				list.add(n1);

				// 距離2
				Link l2 = n1.head;
				while(l2 != null) {
					Node n2 = nodes[l2.node];
					l2 = l2.next;
					if(n2.visited) {
						continue;
					}
					n2.chain = d2;
					d2 = n2;

					// 距離3
					Link l3 = n2.head;
					while(l3!=null) {
						Node n3 = nodes[l3.node];
						l3 = l3.next;
						if(n3.visited) {
							continue;
						}
//						err.println(n1.index+","+n3.index);
						now.add(n3.index);
						n3.add(now.index);
					}

					// 距離1と距離2の接続

					// 先頭は親ノードが設定されているのでスキップ
					Node d = d1.chain;
					while(d != null) {
						d.add(n2.index);
						n2.add(d.index);
						d = d.chain;
					}
				}
			}
		}
//		err.println();
//		for(int i=1;i<=N;i++) {
//			err.println(i+"\t"+nodes[i].toLinkString());
//		}
//		for(int i=1;i<=N;i++) {
//			err.println(i+"\t"+nodes[i].toThreeString());
//		}

		Arrays.sort(nodes, 1, N+1);

//		for(int i=1;i<=N;i++) {
//			err.println(i+"\t"+nodes[i].toThreeString());
//		}
	}
}
