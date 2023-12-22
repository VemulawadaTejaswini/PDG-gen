import java.util.Scanner;

public class Main {
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int i=0; i<length; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		
		bubbleSort(array, length);
		printArray(array);
		System.out.println(count);
	}
	
	public static void bubbleSort(int[] array, int length) {
		// Variable i stands for the smallest value at this moment.
		// j to traverse the remain items, identify the position of the smallest value in the remain queue.
		for (int i=0; i<length; i++) {
			int mini = i;
			for (int j=i+1; j<length; j++) {
				if (array[j] < array[mini]) {
					mini = j;
				}
			}
			// Swap mini and i if mini!=i
			if (mini != i) {
				array[mini] = array[mini] + array[i];
				array[i] = array[mini] - array[i];
				array[mini] = array[mini] - array[i];
				count++;
			}
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i>0) System.out.print(" ");
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}
}

