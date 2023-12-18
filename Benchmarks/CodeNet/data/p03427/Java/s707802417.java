/* Filename: AGC021A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String N = input.next();
			int digitSumN = 0;
			
			for(int i = 0; i < N.length(); ++i){
				digitSumN += N.charAt(0) - '0';
			}
			
			int maxDigitSum = Math.max(digitSumN, N.charAt(0) - '0' - 1 + (N.length() - 1) * 9);
			
			System.out.println(maxDigitSum);
		}
	}
}