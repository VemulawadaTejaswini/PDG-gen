
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		bubbleSort(array, n);

	}

	public static void bubbleSort(int array[], int n) {
		int count = 0;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int j = n - 1; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					swap(array, j, j - 1);
					count++;
					flag = true;
				}
			}
		}
		printArray(array, n);
		System.out.println(count);
	}

	public static void printArray(int array[], int n) {
		for (int i = 0; i < n - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(array[n - 1]);
	}

	public static void swap(int array[], int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

}

