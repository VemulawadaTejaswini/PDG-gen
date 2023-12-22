import java.util.*;

public class Main {
	
	//parent = (i-1)/2
	//left child = (2*i) + 1
	//right child = (2*i) + 2
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] heap = new int[length];
		for (int i = 0; i < length; i++) {
			heap[i] = in.nextInt();
		}
		
		for (int i = 0; i < length; i++) {
			int data = heap[i];
			System.out.print("node " + (i + 1) + ": key = " + data + ", ");
			double parent = ((double) i - 1)/2;
			if (parent >= 0) {
				System.out.print("parent key = " + heap[(int) parent] + ", ");
			}
			int left = 2*i + 1;
			if (left < length) {
				System.out.print("left key = " + heap[left] + ", ");
			}
			int right = 2*i + 2;
			if (right < length) {
				System.out.print("right key = " + heap[right] + ", ");
			}
			System.out.println();
			
		}
		
	}

}
