import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	int[] UF;
	int N,Q;

	public int find(int x){
		if(UF[x] == x)return x;
		return UF[x] = find(UF[x]);
	}

	public void unite(int x,int y){
		if(same(x,y))return;

		int a = find(x);
		int b = find(y);

		if(a < b){
			UF[b] = a;
		}else{
			UF[a] = b;
		}
	}

	public boolean same(int x,int y){

		if(find(x) == find(y))return true;
		return false;
	}

	public void solve() {
		N = nextInt();
		Q = nextInt();

		UF = new int[N];
		for(int i = 0;i < N;i++){
			UF[i] = i;
		}


		for(int i = 0;i < Q;i++){
			int c = nextInt();
			int x = nextInt();
			int y = nextInt();

			if(c == 0){
				unite(x,y);
			}else{
				if(same(x,y)){
					out.println(1);
				}else{
					out.println(0);
				}
			}
		}
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