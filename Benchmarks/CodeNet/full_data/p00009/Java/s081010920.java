/*@author Raj sharma
 *Date- 2016/03/06
 * Description- This program calculates the number of prime numbers in a given number of data sets.
 * Data sets Should be in between 1 to 30 
 */

import java.util.Scanner;

class PrimeNumbers {
	public static void main(String[] args) {
		int primeCounter = 0; // Prime number counter
		int NoOfDatasets = 0; // NoOfDatasets this will be used for storing no
								// of datasets in an array in order to save
								// memory.
		Scanner scanner = new Scanner(System.in);
		x: System.out.println("Enetr valid number of datasets between 1 to 30");
		NoOfDatasets = scanner.nextInt(); // get input from the user for no. of
											// data sets.

		int DataSets[] = new int[NoOfDatasets]; // Here we store our number of
												// data sets.

		if (NoOfDatasets > 0 && NoOfDatasets <= 30) { // if NoOfDatasets is
														// greater than 0 and
														// less than equal to
														// 30.
			System.out.println("Enetr " + NoOfDatasets + " Datasets");
			for (int i = 0; i < NoOfDatasets; i++) {
				DataSets[i] = scanner.nextInt(); // Get inputs from the user and
													// store these data sets in
													// an array.
			}

			for (int k = 0; k < DataSets.length; k++) {

				for (int i = 2; i <= DataSets[k]; i++) {

					boolean isPrime = true;
					for (int j = 2; j < i; ++j) {

						if (i % j == 0) {
							isPrime = false;
							break;
						}
					}
					if (isPrime)
						primeCounter++; // If any number is prime number
										// increase the counter.
				}
				System.out.println(primeCounter); // Print the number of prime
													// numbers.
				primeCounter = 0; // Make it 0 so that it can be used for the
									// next data set.
			}

		} else {
			System.out.println("Sorry You didn't enter valid dataSet numbers");
		}

	}
}