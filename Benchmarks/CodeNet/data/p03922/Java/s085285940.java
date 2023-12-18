import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
	int N,M;
	int[] X;
	TreeMap<Integer,HashMap<Integer,Integer>> s,t;

	public void solve() {
		N = nextInt();
		M = nextInt();

		X = new int[N];
		s = new TreeMap<Integer,HashMap<Integer,Integer>>();
		t = new TreeMap<Integer,HashMap<Integer,Integer>>();

		for(int i = 0;i < N;i++){
			X[i] = nextInt();
			int mod = X[i] % M;

			if(!s.containsKey(mod)){
				s.put(mod,new HashMap<Integer,Integer>());

			}
			s.get(mod).put(X[i], s.get(mod).containsKey(X[i]) ? s.get(mod).get(X[i]) + 1 : 1);
		}

		int ans = 0;

		for(int mod = 0;mod <= M / 2;mod++){
			if(!s.containsKey(mod))continue;
			int dom = M - mod;
			int sSize = 0;
			int tSize = 0;

			for(int key : s.get(mod).keySet()){
				sSize += s.get(mod).get(key);
			}

			if(!s.containsKey(dom)){
				ans += sSize / 2;
				continue;
			}

			for(int key : s.get(dom).keySet()){
				tSize += s.get(dom).get(key);
			}


			if(mod == dom){
				ans += sSize / 2;
			}
			else if(sSize < tSize){
				for(int key : s.get(dom).keySet()){
					int cnt = s.get(dom).get(key);

					if(cnt >= 2){
						int min = Math.min(cnt,tSize - sSize);
						tSize -= (min / 2 * 2);
						ans += min / 2;
					}
				}

				ans += sSize;

			}else{
				for(int key : s.get(mod).keySet()){
					int cnt = s.get(mod).get(key);

					if(cnt >= 2){
						int min = Math.min(cnt,sSize - tSize);
						sSize -= (min / 2 * 2);
						ans += min / 2;
					}
				}
				ans += tSize;
			}
		}

		out.println(ans);
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