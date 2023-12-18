import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main implements Runnable {

	public static void main(String[] args) {

		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

	}

	@Override
	public void run() {
		exec();
	}

	private void exec() {

		int n;
		int q;
		FastScanner sc = new FastScanner(System.in);
		n = sc.nextInt();
		q = sc.nextInt();
		int pa;
		int c;
		List<List<Integer>> tree = new ArrayList<>();
		// 初期化
		for(int i = 0 ; i < n ; i++) {
			tree.add(new ArrayList<>());
		}
		// 木を作成
		for(int i = 0 ; i < n - 1 ; i++) {
			pa = sc.nextInt();
			c = sc.nextInt();
			pa--;
			c--;
			tree.get(pa).add(c);
			tree.get(c).add(pa);
		}

		int p;
		long x;
		long[] mark = new long[n];
		// 頂点にクエリの分マーキング
		for(int i = 0 ; i < q ; i++) {
			p = sc.nextInt();
			x = sc.nextLong();
			p--;
			mark[p] += x;
		}

		long[] ans = new long[n];
		Arrays.fill(ans, -1);
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(0);
		ans[0] = mark[0];
		// 深さ優先
		while(!queue.isEmpty()) {
			int parent = queue.poll();
			for(int child : tree.get(parent)) {
				// 通過済みは無視
				if(ans[child] != -1) {
					continue;
				} else {
					ans[child] = ans[parent] + mark[child];
					queue.add(child);
				}
			}
		}

		for(long ret : ans) {
			System.out.println(ret);
		}

	}

}

class FastScanner {

	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public FastScanner(InputStream in) {
		this.in = in;
	}

	private boolean hasNextByte() {
		if(ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if(hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while(hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

}
