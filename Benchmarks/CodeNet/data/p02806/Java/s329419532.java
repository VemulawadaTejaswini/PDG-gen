import java.util.*;
import java.io.*;

class Song{
	String title;
	int time;
	public Song(String title, int time) {
		super();
		this.title = title;
		this.time = time;
	}
	
}


public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		List<Song> l = new ArrayList<Song>();
		for(int i=0;i<n;i++) {
			String s = fs.next();
			int t = fs.nextInt();
			Song song = new Song(s,t);
			l.add(song);
		}
		String x = fs.next();
		
		int all = 0;
		for(int i=0;i<n;i++) {
			Song song = l.get(i);
			all += song.time;
		}
		
		int total = 0;
		for(int i=0;i<n;i++) {
			Song song = l.get(i);
			if(!x.equals(song.title)) {
				total += song.time;
			}else {
				total += song.time;
				System.out.println(all-total);
				return;
			}
		}
		
		
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}