import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main {
	int N, M;
	int[] P = new int[1000];

	TreeSet<Integer> set = new TreeSet<Integer>();
	ArrayList<Integer> list = new ArrayList<Integer>();

	public void solve() {
		while (true) {
			N = nextInt();
			M = nextInt();
			if(N+M==0)break;

			for (int i = 0; i < N; i++) {
				P[i] = nextInt();
			}

			set.clear();
			set.add(0);
			for (int i = 0; i < N; i++) {
				set.add(P[i]);
				for (int j = 0; j < N; j++) {
					set.add(P[i] + P[j] > M ? 0 : P[i] + P[j]);
				}
			}

			list.clear();
			list.addAll(set);

			int ans = 0;
			for (int a : list) {
				int kkey = binarySearch(list,M - a);

				ans = Math.max(ans, list.get(kkey) + a);
			}
			out.println(ans);
		}
	}

	public int binarySearch(List<Integer> list,int key){

		int low = 0;
		int high = list.size();

		while(high-low>1){
			int mid = high+low>>1;

			if(list.get(mid) == key){
				return mid;
			}
			if(list.get(mid) < key){
				low = mid;
			}else{
				high = mid;
			}
		}
		return low;
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