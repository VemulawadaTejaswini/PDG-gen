import java.io.PrintStream;
import java.util.ArrayList;
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
		v %= p;
		return (int)(v < 0 ? v+p : v);
	}
	public final int mul(long a, long b) {
		return mod(a*b);
	}
	public final void initFact(double limit, double p) {
		initFact((int)limit, (int)p);
	}
	public final void initFact(int limit, int p) {
		this.p = p;
		this.inv = new int[limit+1];
		this.fact = new int[limit+1];
		this.finv = new int[limit+1];
		fact[1] = finv[1] = inv[0] = inv[1] = 1;
		for(int i=2;i<=limit;i++) {
			int a = p / i;
			int b = p % i;
			inv[i]  = mul(-a, inv[b]);
			fact[i] = mul(fact[i-1], i);
			finv[i] = mul(finv[i-1], inv[i]);
		}
	}
	public final int comb(int m, int n) {
		return mul(mul(fact[m], finv[n]), finv[m-n]);
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


	static public class Node{
		private final LinkedList<Node> next = new LinkedList<>();
		private int u = -1;
		private int v = -1;
		public boolean isEnd() {
			// uがここに到着するまでの回数がvと同じか、より後の場合、
			// ここに来るかここでつかまることになる。
			return u >= v;
		}
		public int diff() {
			return v - u;
		}
	}

	public void exec() throws Exception{
		final int N = sc.nextInt();
		final int u = sc.nextInt();
		final int v = sc.nextInt();
		final Node[] graph = new Node[N+1];
		for(int i=1;i<=N;i++) {
			graph[i] = new Node();
		}
		for(int i=1;i<=N-1;i++) {
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			graph[A].next.add(graph[B]);
			graph[B].next.add(graph[A]);
		}
		final ArrayList<Node> list = new ArrayList<>(N);
		list.add(graph[v]);
		graph[v].v=0;
		while(!list.isEmpty()) {
			final Node node = list.remove(list.size()-1);
			for(Node next : node.next) {
				if(next.v==-1) {
					next.v = node.v+1;
					list.add(next);
				}
			}
		}
		list.add(graph[u]);
		graph[u].u = 0;
		Node max = graph[u];
		while(!list.isEmpty()) {
			final Node node = list.remove(list.size()-1);
			if(node.isEnd()){
				if(max.diff() < node.diff()) {
					max = node;
				}
				continue;
			}
			boolean isEnd = true;
			for(Node next : node.next) {
				if(next.u == -1) {
					next.u = node.u+1;
					list.add(next);
					isEnd = false;
				}
			}
			// 終端に来ている場合
			if(isEnd) {
				if(max.v < node.v) {
					max = node;
				}
			}
		}
		out.println(max.v-1);
	}
}
