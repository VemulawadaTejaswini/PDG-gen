import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

	int N;
	int[] a;
	List<Integer> list;

	private class Node{
		Node prev,next;
		int value;
		public Node(int value){
			this.value = value;
			prev = null;
			next = null;
		}
	}

	public void solve() {
		N = nextInt();
		a = new int[N];
		for(int i = 0;i < N;i++){
			a[i] = nextInt();
		}

		Node first = new Node(-1);
		Node last = new Node(-1);
		first.next = last;
		last.prev = first;

		int count = N % 2;
		for(int i = 0;i < N;i++){
			Node node = new Node(a[i]);
			if(count % 2 == 0){
				Node prevNode = last.prev;
				node.next = last;
				node.prev = prevNode;
				last.prev = node;
				node.prev.next = node;
			}else{

				Node nextNode = first.next;
				first.next = node;
				node.next = nextNode;
				node.prev = first;
				node.next.prev = node;
			}
			count++;
		}


		Node node = first.next;
		for(int i = 0;i < N && node != null;i++,node = node.next){
			if(i != 0)out.print(" ");
			out.print(node.value);
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