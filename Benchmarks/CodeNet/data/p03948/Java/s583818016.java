/* Filename: ARC063D.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int T = input.nextInt();
			int[] A = new int[N];
			int[] diffA = new int[N];
			diffA[0] = 0;
			
			for(int i = 0; i < A.length; ++i){
				A[i] = input.nextInt();
				
				if(i > 0){
					if(A[i] < A[i - 1]){
						diffA[i] = 0;
					} else {
						diffA[i] = diffA[i - 1] + (A[i] - A[i - 1]);
					}
				}
			}
			
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < diffA.length; ++i){
				max = Math.max(max, diffA[i]);
			}
			
			int countMax = 0;
			for(int i = 0; i < diffA.length; ++i){
				if(diffA[i] == max){
					++countMax;
				}
			}
			
			if(N == 1){
				System.out.println(0);
			} else {
				System.out.println(countMax);
			}
		}
	}

}
