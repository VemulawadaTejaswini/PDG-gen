import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
        	array[i] = sc.nextInt();
        }

        selectionSort(array);

	}

	static void selectionSort(int[] array) {

        int count = 0;
		for(int i = 0; i < array.length; i++) {

			int minj = i;
			for(int j = i; j < array.length; j++) {

				if(array[j] < array[minj]) {
					minj = j;
				}
			}

			if(i != minj) {
				int temp = array[i];
				array[i] = array[minj];
				array[minj] = temp;
				count++;
			}
		}

		printArray(array);
		System.out.println(count);
	}

	static void printArray(int[] array) {

		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println(array[array.length - 1]);
	}
}

