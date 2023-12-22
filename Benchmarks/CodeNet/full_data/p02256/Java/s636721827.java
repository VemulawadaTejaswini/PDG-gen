/**
 * 
 */
package com.aizu;

import java.util.Scanner;

/**
 * @author Rancho
 *
 */
public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numStr = sc.nextLine();

		String[] numArr = numStr.split(" ");
		int[] arr = new int[numArr.length];

		for (int i = 0; i < numArr.length; i++) {
			arr[i] = Integer.parseInt(numArr[i]);
		}

		int gcd = 2;
		int min = 0;

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				min = arr[j] < arr[j + 1] ? arr[j] : arr[j + 1];
			}
		}

		int count = 2;
		while (count <= min) {
			if (arr[0] % count == 0 && arr[1] % count == 0)
				gcd = count;
			count++;
		}

		System.out.println("GCD is : " + gcd);
		sc.close();
	}

}

