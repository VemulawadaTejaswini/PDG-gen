import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		BST bst = new BST();
		
		for (int i = 0; i < n; i++) {
			String cmd = sc.next();
			if (cmd.equals("insert")) {
				bst.insert(sc.nextInt());
			} else if (cmd.equals("print")) {
				pr.println(bst.inorder());
				pr.println(bst.preorder());
        	}
    	}

    	pr.close();
        sc.close();
	}

	private static class BST {
		ArrayList<BSTNode> bst;
		int root;
		
		BST() {
			bst = new ArrayList<BSTNode>();
			root = -1;
		}
		
		void insert(int key) {
			bst.add(new BSTNode(key));
			int z = bst.size() - 1;
			int y = -1;
			int x = root;
			for (; x != -1; ) {
				y = x;
				if (bst.get(z).key < bst.get(x).key) {
					x = bst.get(x).l_child;
				} else {
					x = bst.get(x).r_child;
				}
			}
			bst.get(z).parent = y;
			if (y == -1) {
				root = z;
			} else {
				if (bst.get(z).key < bst.get(y).key) {
					bst.get(y).l_child = z;
				} else {
					bst.get(y).r_child = z;
				}
			}
		}

		String preorder() {
	    	int[] order = new int[bst.size()];
	    	// Preorder
	    	if (preorder(root, order, 0) != order.length) {
	    		return "Error" + preorder(root, order, 0) + " " + order.length;
	    	}

			StringBuffer str = new StringBuffer();
			for (int i = 0; i < order.length; i++) {
				str.append(" ");
				str.append(order[i]);
			}

			return str.toString();
		}
	    	
		int preorder(int id, int[] order, int k) {
			order[k] = bst.get(id).key;
			k++;
			
			if (bst.get(id).l_child != -1) {
				k = preorder(bst.get(id).l_child, order, k);
			}
			
			if (bst.get(id).r_child != -1) {
				k = preorder(bst.get(id).r_child, order, k);
			}

			return k;
			
		}
		
		String inorder() {
	    	int[] order = new int[bst.size()];
	    	// inorder
	    	if (inorder(root, order, 0) != order.length) {
	    		return "Error" + inorder(root, order, 0) + " " + order.length;
	    	}

			StringBuffer str = new StringBuffer();
			for (int i = 0; i < order.length; i++) {
				str.append(" ");
				str.append(order[i]);
			}

			return str.toString();
		}
	    	
		int inorder(int id, int[] order, int k) {
			if (bst.get(id).l_child != -1) {
				k = inorder(bst.get(id).l_child, order, k);
			}
			
			order[k] = bst.get(id).key;
			k++;
			
			if (bst.get(id).r_child != -1) {
				k = inorder(bst.get(id).r_child, order, k);
			}

			return k;
			
		}
		
	}
	
	private static class BSTNode {
		public int key;
		public int parent;
		public int l_child;
		public int r_child;
	
		public BSTNode(int key) {
			this.key = key;
			this.parent = -1;
			this.l_child = -1;
			this.r_child = -1;
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