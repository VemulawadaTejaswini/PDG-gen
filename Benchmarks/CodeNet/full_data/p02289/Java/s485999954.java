import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static class PriorityQueue{
		int[] heap;
		int size;
		
		public PriorityQueue(){
			heap = new int[2000000];
			size = 0;
		}
		
		private void maxHeapify(int i){
			int l = i * 2 + 1;
			int r = i * 2 + 2;
		
			int largest = -1;
		
			if(l < size && heap[l] > heap[i]){
				largest = l;
			}else{
				largest = i;
			}
		
			if(r < size && heap[r] > heap[largest]){
				largest = r;
			}
		
			if(largest != i){
				int tmp = heap[i];
				heap[i] = heap[largest];
				heap[largest] = tmp;
			
				maxHeapify(largest);
			}
		}
		
		public void insert(int value){
			heap[size++] = value;
			this.maxHeapify(((size - 1) - 1) / 2);
		}
		
		public int extractMax(){
			final int ret = heap[0];
			heap[0] = heap[--size]; 
			
			for(int i = size / 2; i >= 0; i--){
				this.maxHeapify(i);
			}
			
			return ret;
		}
		
		public String toString(){
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for(int i = 0; i < size; i++){
				if(i != 0){
					sb.append(", ");
				}
				sb.append(heap[i]);
			}
			sb.append("]");
		
			return sb.toString();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue queue = new PriorityQueue();
		while(true){
			final String ops = sc.next();
			
			//System.out.println(queue);
			
			if("insert".equals(ops)){
				final int value = sc.nextInt();
				queue.insert(value);
			}else if("extract".equals(ops)){
				System.out.println(queue.extractMax());
			}else if("end".equals(ops)){
				break;
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