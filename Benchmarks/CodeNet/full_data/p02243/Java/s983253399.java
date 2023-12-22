import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;


public class Main {
	static int n;
	
	private static class Node {
		int id;
		int[] v;
		int[] c;
		
		// shortest
		int d;
		int prev;
		
		Node(int id, int[] v, int[] c) {
			this.id = id;
			this.v = v;
			this.c = c;
			
			this.d = Integer.MAX_VALUE;
			this.prev = -1;
		}
		
		@Override
		public String toString() {
			StringBuffer str = new StringBuffer();
			str.append(id);
			str.append("v ");
			str.append(v.toString());
			str.append("c ");
			str.append(c.toString());
			str.append("d ");
			str.append(d);
			str.append(" ");
			str.append(prev);
			return str.toString();
		}
	}
	
	private static class NodeComparator implements Comparator<Node>{
		@Override
		public int compare(Node o1, Node o2) {
			return o1.d - o2.d; // IDの値に従い昇順で並び替えたい場合
			// return -(user1.getId() - user2.getId()); // IDの値に従い降順で並び替えたい場合
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		n = sc.nextInt();

		debug_msg_start();
		debug_msg();

		Node[] array = new Node[n];
		PriorityQueue<Node> pq = new PriorityQueue<Node>(11, new NodeComparator());
		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			int[] v = new int[k];
			int[] c = new int[k];
			for (int j = 0; j < k; j++) {
				v[j] = sc.nextInt();
				c[j ]= sc.nextInt();
			}
			array[i] =new Node(u, v, c);
		}

		debug_msg();

		array[0].d = 0;
		pq.add(array[0]);

		for (; !pq.isEmpty(); ) {
			Node u = pq.poll();
			for (int i = 0; i < u.v.length; i++) {
				if (u.prev == u.v[i]) {
					continue;
				}
				Node next = array[u.v[i]];
				if (next.d > u.c[i] + u.d) {
					if (pq.contains(next)) {
						pq.remove(next);
					}
					next.d = u.c[i] + u.d;
					next.prev = u.id;
					pq.add(next);
				}
			}
		}
		
//		for (int j = 0; j < n; j++) {
//			for (int i = 0; i < n; i++) {
//				if (kk[j] != kk[i] && a[kk[j]][kk[i]] != -1 && prev[kk[j]] != kk[i]) {
//					if (d[kk[i]] > a[kk[j]][kk[i]] + d[kk[j]]) {
//						d[kk[i]] = a[kk[j]][kk[i]] + d[kk[j]];
//						prev[kk[i]] = kk[j];
//					}
//				}
//			}

//			int min = Integer.MAX_VALUE;
//			int min_index = n;
//			for (int i = j + 1; i < n; i++) {
//				if (d[kk[i]] < min) {
//					min = d[kk[i]];
//					min_index = i;
//				}
//			}
//			if (j + 1 < n && min_index < n) {
//				int temp = kk[j + 1];
//				kk[j + 1] = kk[min_index];
//				kk[min_index] = temp;
//			}
//		}

		debug_msg();

		for (int i = 0; i < n; i++) {
			pr.print(i);
			pr.print(" ");
			pr.print(array[i].d);
//			pr.print(" ");
//			pr.print(prev[i]);
//			pr.print(" ");
//			pr.print(k[i]);
			pr.println("");
		}

		debug_msg();

		pr.close();
		sc.close();
	}

	static final boolean debug_checkTime = false;
	static long debug_stime;
	static int debug_cnt;
	static StringBuffer debug_str;
	
	private static void debug_msg_start() {
		debug_stime = System.currentTimeMillis();
		debug_cnt = 0;
		debug_str = new StringBuffer();
	}		
	
	private static void debug_msg() {
		if (debug_checkTime) {
			debug_str.setLength(0);
			debug_str.append(debug_cnt++);
			debug_str.append(" Time: ");
			debug_str.append((System.currentTimeMillis() - debug_stime));
			System.err.println(debug_str);
		}
	}

	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;
		
		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}
		
		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return st.sval;
		}
		
		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return (int)st.nval;
		}

		void close() {
		}
	}
	
	private static class Printer {
		PrintStream out;
		StringBuffer strbuf;
		int bufSize;
		final String CR;

		Printer(PrintStream out) {
			this.out = out;
			strbuf = new StringBuffer();
			bufSize = 64 * 1024;
			CR = System.getProperty("line.separator");
		}

		void println(String str) {
			strbuf.append(str);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(String str) {
			strbuf.append(str);
			checkStringBuffer();
		}

		void println(int n) {
			strbuf.append(n);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(int n) {
			strbuf.append(n);
			checkStringBuffer();
		}

		void print(char c) {
			strbuf.append(c);
			checkStringBuffer();
		}

		void printArray(int[] array) {
			for (int i = 0; i < array.length; i++) {
				checkStringBuffer();
				strbuf.append(array[i]);
				strbuf.append(" ");
			}
			strbuf.delete(strbuf.length() - 1, strbuf.length());
			strbuf.append(CR);
		}

		void close() {
			flashStringBuffer();
		}
		
		private void flashStringBuffer() {
			if (strbuf.length() > 0) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
		
		private void checkStringBuffer() {
			if (strbuf.length() > bufSize) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
	}
}