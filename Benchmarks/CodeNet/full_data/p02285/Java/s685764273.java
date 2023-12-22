import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void preorder(int cur, int[] n_value, int[] n_left, int[] n_right){
		System.out.print(" " + n_value[cur]);
		if(n_left[cur]  != -1){ preorder(n_left[cur] , n_value, n_left, n_right); }
		if(n_right[cur] != -1){ preorder(n_right[cur], n_value, n_left, n_right); }
	}
	
	public static void inorder(int cur, int[] n_value, int[] n_left, int[] n_right){
		if(n_left[cur]  != -1){
			//System.out.print("(");
			inorder(n_left[cur] , n_value, n_left, n_right);
			//System.out.print(")");
		}
		
		System.out.print(" " + n_value[cur]);
		
		if(n_right[cur] != -1){
			//System.out.print(" (");
			inorder(n_right[cur], n_value, n_left, n_right);
			//System.out.print(")");
		}
	}
	
	public static boolean find(int value, int cur, int[] n_value, int[] n_left, int[] n_right){
		if(cur == -1){
			return false;
		}else if(n_value[cur] == value){
			return true;
		}else if(value < n_value[cur]){
			return find(value, n_left[cur], n_value, n_left, n_right);
		}else if(value > n_value[cur]){
			return find(value, n_right[cur], n_value, n_left, n_right);
		} else {
			return false;
		}
	}
	
	public static void delete(int value, int cur, int parent, int[] n_value, int[] n_left, int[] n_right){
		//System.out.println(cur + " : " + value);
		
		if(cur == -1){
			return;
		}else if(n_value[cur] == value){
			int count = 0;
			count += n_left[cur]  != -1 ? 1 : 0;
			count += n_right[cur] != -1 ? 1 : 0;
			
			if(count == 2){
				int left_most = n_right[cur];
				while(n_left[left_most] != -1){
					left_most = n_left[left_most];
				}
				//System.out.println(value + " " + left_most + "=>" + n_left[left_most] + "," + n_right[left_most] + " ->" + n_value[left_most]);
				
				n_value[cur] = n_value[left_most];
				n_value[left_most] = n_value[left_most] + 1;
				
				delete(n_value[left_most], 0, -1, n_value, n_left, n_right);
			}else if(count == 1){
				if(n_left[parent] == cur){
					n_left[parent] = Math.max(n_left[cur], n_right[cur]);
				}else{
					n_right[parent] = Math.max(n_left[cur], n_right[cur]);
				}
			}else{
				if(n_left[parent] == cur){
					n_left[parent] = -1;
				}else{
					n_right[parent] = -1;
				}
			}
		}else if(value < n_value[cur]){
			delete(value, n_left[cur], cur, n_value, n_left, n_right);
		}else if(value > n_value[cur]){
			delete(value, n_right[cur], cur, n_value, n_left, n_right);
		} else {
			return;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int q = sc.nextInt();
		
		int[] n_value = new int[q];
		int[] n_left  = new int[q];
		int[] n_right = new int[q];
		Arrays.fill(n_left,  -1);
		Arrays.fill(n_right, -1);
		
		int node_count = 0;
		for(int i = 0; i < q; i++){
			final String ops = sc.next();
			
			//System.out.print("=> ");
			//inorder(0, n_value, n_left, n_right);
			//System.out.println();
			
			if("insert".equals(ops)){
				final int value = sc.nextInt();
				n_value[node_count] = value;
				
				if(node_count != 0){
					int parent  = -1;
					int current =  0;
					
					while(current != -1){
						if(value < n_value[current]){
							parent  = current;
							current = n_left[current];
						}else{
							parent  = current;
							current = n_right[current];
						}
					}
					
					if(value < n_value[parent]){
						n_left[parent]  = node_count;
					}else{
						n_right[parent] = node_count;
					}
				}
				
				node_count++;
			}else if("delete".equals(ops)){
				final int value = sc.nextInt();
				delete(value, 0, -1, n_value, n_left, n_right);
			}else if("find".equals(ops)){
				final int value = sc.nextInt();
				System.out.println(find(value, 0, n_value, n_left, n_right) ? "yes" : "no");
			}else if("print".equals(ops)){
				inorder(0, n_value, n_left, n_right);
				System.out.println();
				preorder(0, n_value, n_left, n_right);
				System.out.println();
			}
		}
		
		
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}