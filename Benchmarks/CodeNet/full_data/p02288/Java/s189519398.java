import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] heapArrays = new int[size + 1];
		for (int i = 1; i < size + 1; i++) {
			heapArrays[i] = scanner.nextInt();
		}
		
		for (int i = size / 2; i >= 1; i--) {
			maxHeapify(heapArrays, i, size);
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 1; i < size + 1; i++) {
				stringBuilder.append(" ").append(heapArrays[i]);
		}
		System.out.println(stringBuilder.toString());
	}
	
	static void maxHeapify(int[] heapArrays, int point, int size) {
		int left = left(point, size);
		int right = right(point, size);
		int largest;
		
		if (left != -1 && heapArrays[left] > heapArrays[point]) {
			largest = left;
		} else {
			largest = point;
		}
		if (right != -1 && heapArrays[right] > heapArrays[largest]) {
			largest = right;
		}
		if (largest != point) {
			int tmp = heapArrays[point];
			heapArrays[point] = heapArrays[largest];
			heapArrays[largest] = tmp;
			maxHeapify(heapArrays, largest, size);
		}
	}
	
	int parent(int point) {
		if (point != 1) {
			return point / 2;
		} else {
			return -1;
		}
	}
	
	static int left(int point, int size) {
		if (point * 2 <= size) {
			return point * 2;
		} else {
			return -1;
		}
	}
	
	static int right(int point, int size) {
		if (point * 2 + 1 <= size) {
			return point * 2 + 1;
		} else {
			return -1;
		}
	}
}