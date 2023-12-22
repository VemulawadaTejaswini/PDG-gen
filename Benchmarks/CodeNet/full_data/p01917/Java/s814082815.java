import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main implements Runnable {
	static final int INF = (int)1e9+7;
	int N;
	int[] R,S,P,C;

	public boolean check(int x,int y,int z){
		int[] sum = new int[N];

		int[] rank_s = new int[N],rank_p = new int[N],rank_c = new int[N];
		int[] rank_all = new int[N];

		//smile
		for(int i = 0;i < N;i++){
			for(int j = i+1;j < N;j++){
				int add = 0;
				if(i == 0)add = x;
				if(S[i]+add < S[j])rank_s[i]++;
				else if(S[i]+add > S[j])rank_s[j]++;
			}
		}
		//pure
		for(int i = 0;i < N;i++){
			for(int j = i+1;j < N;j++){
				int add = 0;
				if(i == 0)add = y;
				if(P[i]+add < P[j])rank_p[i]++;
				else if(P[i]+add> P[j])rank_p[j]++;
			}
		}
		//cool
		for(int i = 0;i < N;i++){
			for(int j = i+1;j < N;j++){
				int add = 0;
				if(i == 0)add = z;
				if(C[i]+add < C[j])rank_c[i]++;
				else if(C[i]+add > C[j])rank_c[j]++;
			}
		}

		for(int i = 0;i < N;i++){
			sum[i] = R[rank_s[i]] + R[rank_p[i]] + R[rank_c[i]];
		}

		for(int i = 0;i < N;i++){
			for(int j = i+1;j < N;j++){
				if(sum[i] < sum[j])rank_all[i]++;
				else if(sum[i] > sum[j])rank_all[j]++;
			}
		}

		return rank_all[0] <= 7;
	}

	public void solve() {
		N = nextInt();

		R = new int[N];
		S = new int[N];
		P = new int[N];
		C = new int[N];
		for(int i = 0;i < N;i++){
			R[i] = nextInt();
		}

		for(int i = 0;i < N;i++){
			S[i] = nextInt();
			P[i] = nextInt();
			C[i] = nextInt();
		}

		int low = 0;
		int high = INF;
		for(int i = 0;i < 100;i++){
			int mid = high+low>>1;
			if(check(mid,0,0) || check(0,mid,0) || check(0,0,mid)){
				high = mid;
			}else{
				low = mid;
			}
		}
		if(high == INF)out.println("Saiko");
		else out.println(high);


	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
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

	@Override
	public void run() {
		out.flush();
		new Main().solve();
		out.close();

	}
}