import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static class Reconstruction {
		
		static int n;
		static List<Integer> preorder, inorder, postorder;
		static int pos;
		
		public void reconstruction (InputReader ir) {
			
			n = ir.nextInt();
			
			preorder = new ArrayList<>();
			inorder = new ArrayList<>();
			postorder = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				preorder.add(ir.nextInt());
			}
			for (int i = 0; i < n; i++) {
				inorder.add(ir.nextInt());
			}
			
			pos = 0;
			Postorder (0, n);
			
			StringBuilder sb = new StringBuilder ();
			sb.append(postorder.get(0));
			
			for (int i = 1; i < n; i++) sb.append(" ").append(postorder.get(i));
			
			System.out.println(sb);
			
		}
		
		static void Postorder (int i, int n) {
			
			if (i >= n) return;
			
			int root = preorder.get(pos++);
			int m = inorder.indexOf(root);
			
			Postorder (i, m);
			Postorder (m + 1, n);
			
			postorder.add(root);
			
		}
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
		
		public int nextInt() {
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
		Reconstruction obj = new Reconstruction();
		obj.reconstruction(in);
	}
	
	
}

