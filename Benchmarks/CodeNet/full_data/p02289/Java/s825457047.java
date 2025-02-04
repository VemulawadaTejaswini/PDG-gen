import java.util.Scanner;
// Java program to implement Max Heap 
class MaxHeap { 
	private int[] Heap; 
	private int size; 
	private int maxsize; 

	// Constructor to initialize an 
	// empty max heap with given maximum 
	// capacity. 
	public MaxHeap(int maxsize) 
	{ 
		this.maxsize = maxsize; 
		this.size = 0; 
		Heap = new int[this.maxsize + 1]; 
		Heap[0] = Integer.MAX_VALUE; 
	} 

	// Returns position of parent 
	private int parent(int pos) 
	{ 
		return pos / 2; 
	} 

	// Below two functions return left and 
	// right children. 
	private int leftChild(int pos) 
	{ 
		return (2 * pos); 
	} 
	private int rightChild(int pos) 
	{ 
		return (2 * pos) + 1; 
	} 

	// Returns true of given node is leaf 
	private boolean isLeaf(int pos) 
	{ 
		if (pos >= (size / 2) && pos <= size) { 
			return true; 
		} 
		return false; 
	} 

	private void swap(int fpos, int spos) 
	{ 
		int tmp; 
		tmp = Heap[fpos]; 
		Heap[fpos] = Heap[spos]; 
		Heap[spos] = tmp; 
	} 

	// A recursive function to max heapify the given 
	// subtree. This function assumes that the left and 
	// right subtrees are already heapified, we only need 
	// to fix the root. 
	private void maxHeapify(int pos) 
	{ 
		if (isLeaf(pos)) 
			return; 

		if (Heap[pos] < Heap[leftChild(pos)] || 
			Heap[pos] < Heap[rightChild(pos)]) { 

			if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) { 
				swap(pos, leftChild(pos)); 
				maxHeapify(leftChild(pos)); 
			} 
			else { 
				swap(pos, rightChild(pos)); 
				maxHeapify(rightChild(pos)); 
			} 
		} 
	} 

	// Inserts a new element to max heap 
	public void insert(int element) 
	{ 
		Heap[++size] = element; 

		// Traverse up and fix violated property 
		int current = size; 
		while (Heap[current] > Heap[parent(current)]) { 
			swap(current, parent(current)); 
			current = parent(current); 
		} 
	} 

	public int extractMax() 
	{ 
		int popped = Heap[1]; 
		Heap[1] = Heap[size--]; 
		maxHeapify(1); 
		return popped; 
	}  
} 

public class Main {
	public static void main(String[] arg) 
	{ 
		MaxHeap maxHeap = new MaxHeap(2000000); 
		Scanner in = new Scanner(System.in);
    String operacao; int valor;
    while(in.hasNext()){
      operacao = in.next();
      if (operacao.equals("insert")){
        valor = in.nextInt();
        maxHeap.insert(valor);
      } else if (operacao.equals("extract")){
        System.out.println(maxHeap.extractMax());
      } else {
        break;
      }
    }
	}
}
