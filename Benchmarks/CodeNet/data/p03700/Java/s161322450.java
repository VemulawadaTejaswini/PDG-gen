
import java.util.Scanner;

public class Main {
    
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());

	int[] heap = new int[N];
	for (int i = 0; i < N; i++) {
	    int h = Integer.parseInt(scan.next());
	    heap[i] = h;
	    upHeap(heap, i);
	}

	int dif = A - B;

	long count = 0;
	while(heap[0] > 0) {
	    int length = 0;
	    long total = 0;
	    for (int i = 0; i < N; i++) {
		if(heap[i] > 0) {
		    total += heap[i];
		    length++;
		}
	    }
	    
	    long damage = dif + B * length;
	    long min = (total % damage == 0 ? total/damage : total/damage+1);
	    count += min;
	    for (int i = 0; i < N; i++) {
		heap[i] -= (min * B);
		if(heap[i] <= 0) N--;
	    }
	    for (int i = 0; i < min; i++) {
		heap[0] -= dif;
		if(heap[0] <= 0) N--;
		downHeap(heap, 0);
	    }
	}

	System.out.println(count);
	scan.close();
    }

    private static void downHeap(int[] heap, int index) {
	int left = 2*index+1;
	int right = left+1;

	if(left < heap.length) {
	    if(right < heap.length) {
		int biggerIndex = (heap[left] > heap[right] ? left : right);
		if(heap[index] < heap[biggerIndex]) {
		    swap(heap, index, biggerIndex);
		    downHeap(heap, biggerIndex);
		}
	    } else {
		if(heap[index] < heap[left]) {
		    swap(heap, index, left);
		    downHeap(heap, left);
		}
	    }
	}
    }

    private static void upHeap(int[] heap, int index) {
	if(index == 0) return;
	
	int parent = (index-1) / 2;
	if(heap[index] > heap[parent]) {
	    swap(heap, index, parent);
	    upHeap(heap, parent);
	}
    }

    private static void swap(int[] heap, int index1, int index2) {
	int tmp = heap[index1];
	heap[index1] = heap[index2];
	heap[index2] = tmp;
    }

}
