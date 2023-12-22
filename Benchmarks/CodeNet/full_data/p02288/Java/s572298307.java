
import java.util.Scanner;

public class Main{
	
	public static void maxHeapify(int[] a, int x) {
		int left = 2 * x + 1;
		int right = 2 * x + 2;
		int largest = x;
		if(left < a.length)
			if(a[left] > a[x])
				largest = left;
		if(right < a.length)
			if(a[right] > a[largest])
				largest = right;
		if(largest != x) {
			int temp = a[x];
			a[x] = a[largest];
			a[largest] = temp;
			maxHeapify(a, largest);
		}
	}
	public static void buildMaxHeap(int[] a) {
		for(int i = a.length/2; i >= 0; i--) {
			maxHeapify(a, i);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[in.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		buildMaxHeap(a);
		for(int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println("");
		in.close();
	}
}

