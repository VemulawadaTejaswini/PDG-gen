import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		int[] heap;
		size = input.nextInt();
		heap = new int[size+1];
		for(int i = 1; i <= size; i++) {
			heap[i] = input.nextInt();
		}
		input.close();
		for(int i = 1; i <= size; i++) {
			int parent = -100000000;
			int key = heap[i];
			int left = -100000000;
			int right = -100000000;
			if(i == 1) {
				if(2 * i <= size) {
				left = heap[2 * i];
				}
				if(((2 * i) + 1) <= size) {
				right = heap[(2 * i) + 1];
				}
				
				
			}
			else {
				parent = heap[i/2];
				if(2 * i <= size) {
				left = heap[2 * i];
				}
				if(((2 * i) + 1) <= size) {
				right = heap[(2 * i) + 1];
				}
				
			}
			System.out.print("node " + (i) + ": key = " + key  + ", ");
			if(parent != -100000000) {
				System.out.print("parent key = " + parent + ", ");
			}
			if(left != -100000000) {
				System.out.print("left key = " + left + ", ");
				
			}
			if(right != -100000000) {
				System.out.print("right key = " + right + ", ");
				
			}
			System.out.println();
	
		}
	}

}
