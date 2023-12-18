/* Filename: AGC021A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String N = input.next();
			int maxDigitSum = N.charAt(0) - '0' - 1;
			
			for(int i = 1; i < N.length(); ++i){
				maxDigitSum += 9;
			}
			
			System.out.println(maxDigitSum);
		}
	}

}
