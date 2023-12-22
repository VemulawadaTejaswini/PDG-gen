/**
 * Heaps - Maximum Heap
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int h = parseInt(br.readLine());
		int[] heap = new int[h + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < h + 1; i++) {
			heap[i] = parseInt(st.nextToken());
		}
		buildMaxHeap(heap);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < h + 1; i++) {
			sb.append(" ").append(heap[i]);
		}
		System.out.println(sb.toString());
	} //end main

	static int parent(int i) {
		return i / 2;
	}

	static int left(int i) {
		return i * 2;
	}

	static int right(int i) {
		return i * 2 + 1;
	}

	static void maxHeapify(int[] heap, int i) {
		int left = left(i);
		int right = right(i);
		int largest = i;
		if (left < heap.length && heap[left] > heap[i]) {
			largest = left;
		}
		if (right < heap.length && heap[right] > heap[largest]) {
			largest = right;
		}
		if (largest != i) {
			int tmp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = tmp;
			maxHeapify(heap, largest);
		}
	}

	static void buildMaxHeap(int[] heap) {
		for (int i = (heap.length - 1) / 2; i >= 1; i--) {
			maxHeapify(heap, i);
		}
	}
}