import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[100];
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		doInsertionSort(array, n);
		
		printArray(array, n);
	
	}
	public static void doInsertionSort(int[] array, int n) {
		for (int i = 1; i < n; i++) {
			printArray(array, n);
			int val = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > val) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = val;
		}
	}
	public static void printArray(int[] array, int n) {
		for (int i = 0; i < n; i++) {
			if (i != 0) 
				System.out.print(" ");
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}
}