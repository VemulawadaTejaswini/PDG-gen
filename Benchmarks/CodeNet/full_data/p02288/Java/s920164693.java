import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] heap = new int[n+1];
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 1; i <= n ;i++){
			//heap[i] = new Node(Integer.parseInt(tmpArray[i - 1]));
			heap[i] = Integer.parseInt(tmpArray[i - 1]);
		}
		
		buildMaxHeap(heap);
		
		for(int i = 1; i < heap.length ; i++){
			System.out.print(" "+heap[i]);
		}
		System.out.println();
		
	}
	
	static void maxHeapify(int[] nodes, int i){
		int l = left(i);
		int r = right(i);
		
		int largest;
		if (l <= nodes.length - 1 && nodes[l] > nodes[i]){
			largest = l;
		}
		else {
			largest = i;
		}
		if( r <= nodes.length - 1 && nodes[r] > nodes[largest]){
			largest = r;
		}
		
		if (largest != i){
			int tmp = nodes[i];
			nodes[i] = nodes[largest];
			nodes[largest] = tmp;
			maxHeapify(nodes, largest);
		}
	}
	
	static void buildMaxHeap(int[] a){
		for(int i = a.length/2 ; i >= 1 ;i--){
			maxHeapify(a, i);
		}
	}
	
	static int left(int i){
		return i*2;
	}
	
	static int right(int i){
		return i*2 + 1;
	}
	
	static int parent(int i){
		return i/2;
	}

}