import java.util.Scanner;
public class Main {
    static int h;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	h = Integer.parseInt(scan.nextLine()) + 1;
	int[] a = new int[h];
	String[] input = scan.nextLine().split(" ");
	for (int i = 1; i < h; i++) {
	    a[i] = Integer.parseInt(input[i-1]);
	}
        buildMaxHeap(a);
	for (int i = 1; i < h; i++) {
	    System.out.print(a[i] + " ");
	}
	System.out.println();
    }
    static void buildMaxHeap (int[] a) {
	for (int i = h / 2; i > 0; i--) {
	    maxHeapify(a, i);
	}
    }
    static void maxHeapify (int[] a, int i) {
	int leftId = i * 2;
	int rightId = i * 2 + 1;
	int largest = 0;
	if (leftId < h && a[leftId] > a[i]) {
	    largest = leftId;
	} else {
	    largest = i;
	}
	if (rightId < h && a[rightId] > a[largest]) {
	    largest = rightId;
	}
	if (largest != i) {
	    int tmp = a[i];
	    a[i] = a[largest];
	    a[largest] = tmp;
	    maxHeapify(a, largest);
	}
    }
}