

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		bubbleSort(A, N);
		scan.close();
	}

	public static void bubbleSort(int[] A, int N) {
		// ???????????°
		int count = 0;
		boolean flag = true;
		int i = 0;
		while(flag){
			flag = false;
			for (int j = N - 1; j > i; j--) {
				if (A[j] < A[j - 1]) {
					int temp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = temp;
					flag = true;
					count++;
				}
			}
			i++;
		}
		String output = Arrays.toString(A).replaceAll(",", "");
		System.out.println(output.substring(1, output.length() - 1));
		System.out.println(count);
	}
}