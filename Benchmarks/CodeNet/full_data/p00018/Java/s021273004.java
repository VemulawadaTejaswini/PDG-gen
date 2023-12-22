

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < 5; i++) {
			if (i != 0)
				System.out.print(" ");
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}