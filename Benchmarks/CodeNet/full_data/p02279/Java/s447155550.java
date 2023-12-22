import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	Node[] nodes;

	private static class Node{

		int parent;
		int childSize;
		int[] children;
	}

	public void solve() {
		int n = nextInt();

		nodes = new Node[n];

		for(int i = 0;i < n;i++){
			nodes[i] = new Node();
			nodes[i].parent = -1;
		}

		for(int i = 0;i < n;i++){
			int id = nextInt();
			int k = nextInt();

			nodes[id].childSize = k;

			nodes[id].children = new int[k];

			for(int j = 0;j < k;j++){
				int c = nextInt();
				nodes[id].children[j] = c;
				nodes[c].parent = id;
			}
		}

		for(int i = 0;i < n;i++){
			out.print("node " + i + ": ");
			out.print("parent = " + nodes[i].parent + ", ");
			int depth = 0;
			int parent = nodes[i].parent;
			while(parent != -1){
				parent = nodes[parent].parent;
				depth++;
			}

			out.print("depth = " + depth + ", ");

			if(nodes[i].parent == - 1){
				out.print("root, ");
			}else if(nodes[i].childSize == 0){
				out.print("leaf, ");
			}else{
				out.print("internal node, ");
			}

			out.print("[");
			for(int c = 0;c < nodes[i].childSize;c++){
				if(c != 0)out.print(", ");
				out.print(nodes[i].children[c]);
			}
			out.println("]");
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