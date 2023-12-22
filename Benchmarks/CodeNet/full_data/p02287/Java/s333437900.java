import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Main {
	
	static Integer NULL = 2000000001;
	
	static class CompleteBinaryTree {
		public void cbt (InputReader ir) {
			
			int n = ir.nextInt();
			Node[] node = new Node[n + 1];
			
			for ( int i = 1; i <= n; i++) {
				node[i].key = ir.nextInt();
			}
			
			Heaps (node, n);		
			
			StringBuilder sb = new StringBuilder ();
			
			for (int i = 1; i <= n; i++) {
				sb.append("node ").append(i)
				.append(": key = ").append(node[i].key).append(", ");
				
				if (node[i].parent != NULL)
					sb.append("parent key = ").append(node[i].parent).append(", ");
				if (node[i].left != NULL)
					sb.append("left key = ").append(node[i].left).append(", ");
				if (node[i].right != NULL)
					sb.append("right key = ").append(node[i].right).append(", ");
				sb.append("\n");	
			}
			
			System.out.print(sb);
			
		}
		
		static void Heaps (Node[] node, int n) {
			
			for (int i = 1; i <= n; i++) {
				if (i / 2 > 0) node[i].parent = node[i / 2].key;
				if ( i * 2  <= n) node[i].left = node[ i * 2].key;
				if ( i * 2 +1 <= n) node[i].right = node[ i * 2 + 1].key;
			}
			
		}
		
	}
	
	static class Node {
		Integer key = NULL;
		Integer parent = NULL;
		Integer left = NULL;
		Integer right = NULL;
	}
	
	static class InputReader {
		BufferedReader br;
		StringTokenizer st;
		
		public String nextString() {
			
			 while (!st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine(), " ");
	                } catch (IOException e) {
	                    throw new InputMismatchException();
	                }
	            }
			return st.nextToken();
		}
		
		public Integer nextInt() {
			return Integer.parseInt(nextString());
		}
					
		public InputReader (InputStream inputStream) {
			br = new BufferedReader (new InputStreamReader (inputStream));
			st = new StringTokenizer ("");
		}
		
	}
	
	public static void main (String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader (inputStream);
		CompleteBinaryTree obj = new CompleteBinaryTree();
		obj.cbt(in);
	}
	
	
}
