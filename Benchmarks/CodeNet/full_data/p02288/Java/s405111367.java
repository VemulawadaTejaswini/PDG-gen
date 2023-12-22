import java.util.Scanner;

public class Main {
	int current = 0;
	int[] heap;
	
	public Main() {
		heap = new int[500000];
	}
	
	public Main(int capacity) {
		heap = new int[capacity];
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
		
		int length = Integer.parseInt(in.nextLine());
		String[] data = in.nextLine().split(" ");
		int[] ints = new int[data.length];
		
		Main heapy = new Main(length);

		for (int i = 0; i < data.length; i++) {
			ints[i] = Integer.parseInt(data[i]);
		}
		
		heapy.buildMaxHeap(ints);
		System.out.println(heapy.toString());
	}
}
