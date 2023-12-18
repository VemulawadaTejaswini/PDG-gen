
import java.util.Scanner;

import java.math.*;

public class Solve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int counter = 0;
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {

			array[i] = scan.nextInt();
		}

		Solve s = new Solve();
		array = s.sort(array);
		for (int i = 0; i < N - 1; i++) {

			if (array[i] == array[i + 1]) {

				array[i + 2] = array[i + 1];
				array[i] = 0;
				array[i + 1] = 0;
				i = i + 2;

				counter++;
				counter++;

			}
		}
		System.out.println(N - counter);

	}

	int[] spare;

	public int[] sort(int[] array) {

		spare = array;
		quickSort(spare, 0, spare.length - 1);

		return spare;
	}

	public void quickSort(int[] array, int low, int high) {

		if (low < high) {

			int p = partition(array, low, high);
			quickSort(array, low, p - 1);
			quickSort(array, p + 1, high);
		}
	}

	public int partition(int[] array, int low, int high) {
		int pivot = array[low];
		int left = low + 1;

		int right = high;
		while (true) {

			while (array[left] <= pivot && left < high) {
				left = left + 1;
			}
			while (array[right] >= pivot && right > low) {
				right = right - 1;
			}

			if (left >= right) {

				int temp = array[low];
				array[low] = array[right];
				array[right] = temp;

				return right;
			}

			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;

		}

	}

}
