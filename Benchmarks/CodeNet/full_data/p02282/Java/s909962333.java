import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static int reconstruction(final int n, final int pre_pos, final int in_start, final int in_end, int[] pre_order, int[] in_order, int[] n_left, int[] n_right){
		final int partition = pre_order[pre_pos];
		
		//System.out.println("> " + pre_pos + " " + in_start + " " + in_end + " [" + (partition + 1) + "]");
		
		for(int in_pos = in_start; in_pos < in_end; in_pos++){
			if(in_order[in_pos] == partition){
				if(in_start < in_pos){
					n_left[partition] = reconstruction(n, pre_pos + 1, in_start, in_pos, pre_order, in_order, n_left, n_right);
				}else{
					n_left[partition] = -1;
				}
				
				if(in_pos < in_end && pre_pos + (in_pos - in_start + 1) < n){
					n_right[partition] = reconstruction(n, pre_pos + (in_pos - in_start + 1), in_pos + 1, in_end, pre_order, in_order, n_left, n_right);
				}else{
					n_right[partition] = -1;
				}
				//System.out.println(n_left[in_pos] + "<-" + partition + "->" + n_right[in_pos]);
				return partition;
			}
		}
		
		return -1;
	}
	
	public static void postorder(int node, int[] n_left, int[] n_right, LinkedList<Integer> list){
		if(n_left[node]  != -1){ postorder(n_left[node] , n_left, n_right, list); }
		if(n_right[node] != -1){ postorder(n_right[node], n_left, n_right, list); }
		list.add(node);
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[] pre_order = new int[n];
		for(int i = 0; i < n; i++){
			pre_order[i] = sc.nextInt() - 1;
		}
		int[] in_order = new int[n];
		for(int i = 0; i < n; i++){
			in_order[i] = sc.nextInt()  - 1;
		}
		
		int[] n_left = new int[n];
		int[] n_right = new int[n];
		Arrays.fill(n_left, -1);
		Arrays.fill(n_right, -1);
		
		final int root = reconstruction(n, 0, 0, n, pre_order, in_order, n_left, n_right);
		//System.out.println(root);
		LinkedList<Integer> list = new LinkedList<Integer>();
		//System.out.println(Arrays.toString(n_left));
		//System.out.println(Arrays.toString(n_right));
		postorder(root, n_left, n_right, list);
		boolean first = true;
		for(int num : list){
			if(first){ first = false; }
			else{ System.out.print(" "); }
			System.out.print(num + 1);
		}
		System.out.println();
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