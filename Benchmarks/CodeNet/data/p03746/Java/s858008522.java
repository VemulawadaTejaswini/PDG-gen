import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	int N,M;
	int[] A,B;
	ArrayList<Integer>[] graph;
	@SuppressWarnings("unchecked")
	public void solve(){
		N = nextInt();
		M = nextInt();

		graph = new ArrayList[N];
		for(int i = 0;i < N;i++){
			graph[i] = new ArrayList<Integer>();
		}
		A = new int[M];
		B = new int[M];

		for(int i = 0;i < M;i++){
			int a = nextInt()-1;
			int b = nextInt()-1;
			A[i] = a;
			B[i] = b;

			graph[a].add(b);
			graph[b].add(a);
		}

		ArrayDeque<Long> q = new ArrayDeque<Long>();
		boolean[] used = new boolean[N];
		used[A[0]] = true;
		used[B[0]] = true;
		q.add(1000000L*A[0]);
		q.add(1000000L*B[0] + 1);

		int[][] pre = new int[2][N+1];
		int a = 0;
		int b = 0;
		while(q.size() > 0){

			long p = q.poll();
			int v = (int)(p / 1000000);
			int m = (int)(p % 1000000);

			if(m == 0){
				pre[m][a++] = v;
			}else{
				pre[m][b++] = v;
			}

			for(int n : graph[v]){
				if(used[n])continue;
				used[n] = true;
				q.add(n * 1000000L + m);
				break;
			}

		}
		out.println(a+b);
		for(int i = a-1;i >= 0;i--){
			if(i != a-1)out.print(" ");
			out.print(pre[0][i]+1);
		}
		for(int i = 0;i < b;i++){

			out.print(" "+ (pre[1][i]+1));
		}
		out.println();
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}