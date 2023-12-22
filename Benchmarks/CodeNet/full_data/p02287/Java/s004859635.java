import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] heap = new int[n];

		for(int i = 0; i < n; i++) {
			heap[i] = input.nextInt();
		}
		
		for(int i = 1; i < heap.length + 1; i++) {
			System.out.print("node " + i + ": ");
			System.out.print("key = " + heap[i - 1] + ", ");
			
			if(i != 1)
				System.out.print("parent key = " + heap[i/2 - 1] + ", ");
			if(2*i - 1 < heap.length)
				System.out.print("left key = " + heap[2*i - 1] + ", ");
			if(2*i < heap.length)
				System.out.print("right key = " + heap[2*i] + ", ");
			
			System.out.println();
		}

	}

}

