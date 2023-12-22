package alds1_1.a;

import java.util.Scanner;

class InsertionSort {

	public static void main(String[] args) {
		int length = new Scanner(System.in).nextInt();
		
		String[] metaValues = new Scanner(System.in).nextLine().split(" ");
		int[] array = new int[length];
		for (int i=0; i<metaValues.length; i++) {
			array[i] = Integer.parseInt(metaValues[i]);
		}
		
		printArray(array);
		insertionSort(array, length);
		
		
	}
	
	public static void insertionSort(int[] array, int length) {
		for (int i=1; i<length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j>=0 && key<array[j]) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
			
			printArray(array);
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

