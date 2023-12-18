
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
public class Main {
	static final long C =  1000000007;
	static final int CY = 1000000000;
	StringBuilder sb;
	class Node {
		int num = 0;
		Node[] child = new Node[27];
	}
	public void calc() {
		sb = new StringBuilder();


		FastScanner sc = new FastScanner();

		int n = sc.nextInt();
		char[][] ss = new char[n][];
		int max = 0;
		for (int i=0; i < n; i++) {
			ss[i] = sc.next().toCharArray();
			max = Math.max(max, ss[i].length);
		}
		int q = sc.nextInt();
		int[] ks = new int[q];
		char[][] ps = new char[q][];

		for (int i=0; i < q; i++) {
			ks[i] = sc.nextInt();
			ps[i] = sc.next().toCharArray();
		}


		int[] ans = new int[q];

		Node parent = new Node();

		//データ作る
		for(int i=0; i < n; i++) {
			char[] s = ss[i];
			Node node = parent;
			node.num++;
			for (int t = 0; t < s.length; t++) {
				int num = s[t] - 'a';
				if (node.child[num] == null) {
					node.child[num] = new Node();
				}
				node.child[num].num++;
				node = node.child[num];
			}
			//空白ノード
			node.child[26] = new Node();
			node.child[26].num++;
		}
		//クエリ
		for (int i=0; i < q; i++) {
			int k = ks[i];
			char[] p = ps[i];
			char[] s = ss[k-1];
			Node node = parent;
			for (int t=0; t < s.length; t++) {
				char c = s[t];
				//System.err.print(c);
				if (node.child[26] != null) {
					ans[i] += node.child[26].num;
				}
				for (int v = 0; v <p.length; v++) {
					char jc = p[v];
					if (c == jc) {
						node = node.child[c- 'a'];
						break;
					}else {
						if (node.child[jc- 'a'] != null) {
							ans[i] += node.child[jc-'a'].num;
						}
					}
				}
			}
			//System.err.println();
		}

		for (int i=0; i < q; i++) {
			sb.append((ans[i]+1) + "\n");
		}

		System.out.print(sb);
	}



	public static void main(String[] args) {
		Main main = new Main();
		main.calc();

	}
	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			}else{
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}
		private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
		private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
		private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
			if (!hasNext()) throw new NoSuchElementException();
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
			if (!hasNext()) throw new NoSuchElementException();
			int n = 0;
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
	}
}
