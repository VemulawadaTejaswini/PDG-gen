import java.util.Scanner;

public class Main {
	public static void bubbleSort(int[] array, int n) {
		boolean flag = true;
		int tmp, count = 0;
		while (flag) {
			flag = false;
			for (int j = n - 1; j > 0; j--) {
				if (array[j] < array[j-1]) {
					tmp = array[j]; array[j] = array[j-1]; array[j-1] = tmp;
					count++;
					flag = true;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]);
			if (i < n - 1) System.out.print(" ");;
		}
		System.out.println();
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		bubbleSort(array, n);
	}
}

