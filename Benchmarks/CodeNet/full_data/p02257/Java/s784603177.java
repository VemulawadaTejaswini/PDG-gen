

import java.util.Scanner;

public class Main {

//	public static int prime(int number) {
//		int count = 0;
//		int j = 2;
//		boolean notPrime = false;
//		while (j < number) {
//			if (number % j == 0) {
//				notPrime = true;
//				break;
//			} else {
//				notPrime = false;
//			}
//			j++;
//
//		}
//		if (notPrime == false) {
//			count++;
//		}
//		return count;
//	}
	public static int prime(int[] number) {
		boolean notPrime = false;
		int count = 0;
//how to remove duplicates
		for (int i = 0; i < number.length; i++) {

			int j = 2;
			int currentNum = number[i];
			if (currentNum == 2) {
				notPrime = false;
			} else {
				while (j <= Math.floor(Math.sqrt(currentNum))) {

					if (currentNum % j == 0) {

						notPrime = true;
						break;
					} else {

						notPrime = false;
					}
					j++;
				}
			}
			if (notPrime == false) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		
		
		
		
		
		
//		/*
//		 * scan numbers into array
//		 * 
//		 */
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int numbers[] = new int[number];
		for (int i = 0; i < numbers.length; i++) 
		{
			number = scan.nextInt();
			numbers[i] = number;
		}

		System.out.println(prime(numbers));
		

//		int[] nums = { 5, 2, 3, 4, 5, 6 };
//		int[] nums2 = {11,7,8,9,10,12,13,14,15,16,17};
//		System.out.println(prime(nums));
//		System.out.println(prime(nums2));

	}
}

