import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static int[] heap = new int[2000000];
	private static int heapSize = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while (!(line = br.readLine()).equals("end")) {
			if (line.startsWith("insert")) {
				insert(Integer.parseInt(line.split(" ")[1]));
			} else {
				int val = extractMax();
				System.out.println(val);
			}
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}

	private static int extractMax() {
		int max = heap[1];
		heap[1] = heap[heapSize];
		heapSize--;
		maxHeapify(1);
		return max;
	}

	private static void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);

		int largest;
		if (l <= heapSize && heap[l] > heap[i]) {
			largest = l;
		} else {
			largest = i;
		}
		if (r <= heapSize && heap[r] > heap[largest]) {
			largest = r;
		}

		if (largest != i) {
			swap(i, largest);
			maxHeapify(largest);
		}
	}

	private static void swap(int i, int j) {
		int tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}

	private static int parent(int i) {
		return i / 2;
	}

	private static int left(int i) {
		return i * 2;
	}

	private static int right(int i) {
		return i * 2 + 1;
	}

	private static void insert(int key) {
		heapSize++;
		heap[heapSize] = Integer.MIN_VALUE;
		increaseKey(key);
	}

	private static void increaseKey(int key) {
		heap[heapSize] = key;
		int i = heapSize;
		while (i > 1 && heap[parent(i)] < heap[i]) {
			swap(i, parent(i));
			i = parent(i);
		}
	}
}