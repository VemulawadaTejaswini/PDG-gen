import java.util.Scanner;

public class Main {
	int current = 0;
	int[] heap;
	
	public Main() {
		heap = new int[20000000];
	}
	
	public Main(int capacity) {
		heap = new int[capacity];
	}
	
	public void insert(int val) {
		current++;
		heap[current] = val;
		int iLoc = current;
		while (val > heap[parent(iLoc)]) {
			int tmp = heap[iLoc];
			heap[iLoc] = heap[parent(iLoc)];
			heap[parent(iLoc)] = tmp;
			iLoc = parent(iLoc);
		}
	}
	
	public int extractMax() {
		int max = heap[0];
		heap[0] = heap[current];
		heap[current] = 0;
		current--;
		this.maxHeapify(0);
		return max;
	}
	
	public int parent(int i) {
		return (i - 1) / 2;
	}
	
	public void maxHeapify(int i) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest;
		
		if (l < heap.length && heap[l] > heap[i]){
			largest = l;
		} else {
			largest = i;
		}
		
		if (r < heap.length && heap[r] > heap[largest]) {
			largest = r;
		}
		
		if (largest != i) {
			int tmp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = tmp;
			this.maxHeapify(largest);
		}
	}
	
	public void buildMaxHeap(int[] A) {
		this.heap = A;
		for (int i = A.length / 2; i >= 0; i--) {
			this.maxHeapify(i);
		}
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i : heap) {
			str.append(" " + i);
		}
		//str.append("\n");
		return str.toString();
	}
	
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		boolean notEnded = true;
		
		Main q = new Main();
		while (in.hasNextLine() && notEnded) {
			String line = in.nextLine();
			String[] components = line.split(" ");
			switch(components[0]) {
				case "insert":
					q.insert(Integer.parseInt(components[1]));
					break;
				case "extract":
					System.out.println(q.extractMax());
					break;
				default:
					notEnded = false;
					break;
			}
		}
		
	}
}
