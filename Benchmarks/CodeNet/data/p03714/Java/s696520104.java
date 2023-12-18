
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	long[] first = new long[N];
	long[] second = new long[N];
	long[] third = new long[N];

	for (int i = 0; i < N; i++) {
	    first[i] = -Long.parseLong(scan.next());
	    upHeap(first, i);
	}
	for (int i = 0; i < N; i++) {
	    second[i] = Long.parseLong(scan.next());
	}
	for (int i = 0; i < N; i++) {
	    third[i] = Long.parseLong(scan.next());
	    upHeap(third, i);
	}

	long[] firstScore = new long[N+1];
	for (int i = 0; i < N; i++) firstScore[0] += (-first[i]);
	for (int i = 1; i <= N; i++) {
	    firstScore[i] = firstScore[i-1];
	    long dif = second[i-1] + first[0];
	    if(dif > 0) {
		firstScore[i] += dif;
		first[0] = -second[i-1];
		downHeap(first, 0);
	    }		    
	}

	long[] thirdScore = new long[N+1];
	for (int i = 0; i < N; i++) thirdScore[0] += third[i];
	for (int i = 1; i <= N; i++) {
	    thirdScore[i] = thirdScore[i-1];
	    long dif = third[0] - second[N-i];
	    if(dif > 0) {
		thirdScore[i] -= dif;
		third[0] = second[N-i];
		downHeap(third, 0);
	    }
	}

	long ans = firstScore[0] - thirdScore[N];
	for (int i = 1; i <= N; i++) {
	    long tmp = firstScore[i] - thirdScore[N-i];
	    ans = tmp > ans ? tmp : ans;
	}

	System.out.println(ans);
	scan.close();
    }

    private static void downHeap(long[] heap, int index) {
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

    private static void upHeap(long[] heap, int index) {
	if(index == 0) return;
	
	int parent = (index-1) / 2;
	if(heap[index] > heap[parent]) {
	    swap(heap, index, parent);
	    upHeap(heap, parent);
	}
    }

    private static void swap(long[] heap, int index1, int index2) {
	long tmp = heap[index1];
	heap[index1] = heap[index2];
	heap[index2] = tmp;
    }
}

