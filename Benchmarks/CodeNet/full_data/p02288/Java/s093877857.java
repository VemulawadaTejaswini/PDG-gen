import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		buildMaxHeap(a);
		for (int i = 1; i <= n; i++) {
			System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
		
		sc.close();
	}
	
	void maxHeapify(int[] A, int i) {
		int l = 2*i;
		int r = 2*i+1;
		
		int largest = i;
		if(l < A.length && A[l] > A[i])
			largest = l;
		
		if(r < A.length && A[r] > A[largest])
			largest = r;
		
		if(largest != i) {
			int tmp = A[i];
			A[i] = A[largest];
			A[largest] = tmp;
			maxHeapify(A, largest);
		}
	}
	
	void buildMaxHeap(int[] A) {
		for(int i = (A.length-1)/2; i >= 1; i--) {
			maxHeapify(A, i);
		}
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
