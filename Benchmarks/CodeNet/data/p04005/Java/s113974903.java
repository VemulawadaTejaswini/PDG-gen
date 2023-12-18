/* Filename: AGC004A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int A = input.nextInt(), B = input.nextInt(), C = input.nextInt();

			long AxB = A * B;
			long BxC = B * C;
			long AxC = A * C;
			long maxDiff = Math.min(AxB, Math.min(AxC, BxC));

			if (maxDiff == AxB) {
				if(C % 2 == 0){
					System.out.println(0);
				} else {
					System.out.println(maxDiff);
				}
			} else if (maxDiff == BxC) {
				if(A % 2 == 0){
					System.out.println(0);
				} else {
					System.out.println(maxDiff);
				}
			} else { // maxDiff = AxC
				if(B % 2 == 0){
					System.out.println(0);
				} else {
					System.out.println(maxDiff);
				}
			}
		}
	}

}
