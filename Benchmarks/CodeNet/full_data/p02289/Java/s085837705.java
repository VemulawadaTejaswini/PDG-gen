import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		int n = 2000000;
		
		int[] heap = new int[n+1];
		Arrays.fill(heap, Integer.MIN_VALUE);
		//String[] tmpArray = br.readLine().split(" ");
		String[] tmpArray;
		while(true){
			//heap[i] = new Node(Integer.parseInt(tmpArray[i - 1]));
			tmpArray = br.readLine().split(" ");
			if(tmpArray[0].equals("insert")){
				heap[n] = Integer.parseInt(tmpArray[1]);
				buildMaxHeap(heap);
			}
			else if(tmpArray[0].equals("extract")){
				System.out.println(heap[1]);
				heap[1] = Integer.MIN_VALUE;
				buildMaxHeap(heap);
				//System.out.println(heap[0]);
			}
			else {
				break;
			}
		}
		/*
		buildMaxHeap(heap);
		
		for(int i = 1; i < heap.length ; i++){
			System.out.print(" "+heap[i]);
		}
		System.out.println();
		*/
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