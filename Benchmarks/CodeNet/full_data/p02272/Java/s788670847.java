import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		String[] strArray = reader.readLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}
		
		mergeSort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			if (i != n - 1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
		System.out.println(count);
	}

	private static void mergeSort(int[] arr) {
		int[] tempArray = new int[arr.length];	
		mergeSort(0, arr.length - 1, arr, tempArray);
	}

	private static void mergeSort(int floor, int ceiling, int[] arr, int[] tempArray) {		
		if (floor < ceiling) {
			int mid = floor + (ceiling - floor) / 2;
			mergeSort(floor, mid, arr, tempArray);
			mergeSort(mid + 1, ceiling, arr, tempArray);
			merge(floor, mid, ceiling, arr, tempArray);
		}
	}

	private static void merge(int floor, int mid, int ceiling, int[] arr, int[] tempArray) {

		for (int i = floor; i <= ceiling; i++) {
			tempArray[i] = arr[i];
		}

		int i = floor;
		int j = mid + 1;
		int k = floor;
		while (k <= ceiling) {
			count++;
			if (j > ceiling || (i <= mid && tempArray[i] < tempArray[j])) {
				arr[k] = tempArray[i];
				i++;
			} else {
				arr[k] = tempArray[j];
				j++;
			}
			k++;
		}
	}
}

