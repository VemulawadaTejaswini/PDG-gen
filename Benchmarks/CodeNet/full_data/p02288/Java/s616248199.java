
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] heap = new int[size + 1];
		for (int i = 1; i < size + 1; i++) {
			heap[i] = in.nextInt();
		}
		StringBuilder sb = new StringBuilder();
		Main.buildMaxHeap(heap);
		for (int i = 1; i < size + 1; i++) {
			sb.append(" ").append(heap[i]);
		}
		System.out.println(sb.toString());
		
	}
	
	
	
	public static void maxHeapify(int[] A, int i) {
		int l = left(i);
		int r = right(i);
		int largest;
		if (l < A.length && A[l] > A[i]) {
			largest = l;
		}
		else {
			largest = i;
		}
		
		if (r < A.length && A[r] > A[largest]) {
			largest = r;
		}
		
		if (largest != i) {
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			maxHeapify(A, largest);
		}
	}
	
	public static void buildMaxHeap(int[] A) {
		for (int i = (A.length - 1) / 2; i >= 1; i--) {
			maxHeapify(A, i);
		}
	}
	
	private static int left(int i) {
		return i * 2;
	}
	
	private static int right(int i) {
		return (i * 2) + 1;
	}
	
	
}

