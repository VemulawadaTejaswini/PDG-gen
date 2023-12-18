/* Filename: AGC003C.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] even = new int[N / 2 + N % 2];
			int[] odd = new int[N / 2];
			
			for(int i = 0; i < N; ++i){
				if(i % 2 == 0){
					even[i / 2] = input.nextInt();
				} else {
					odd[i / 2] = input.nextInt();
				}
			}
			
			Arrays.sort(even);
			Arrays.sort(odd);
			int[] A = new int[N];
			
			for(int i = 0; i < A.length; ++i){
				if(i % 2 == 0){
					A[i] = even[i / 2];
				} else {
					A[i] = odd[i / 2];
				}
			}
			
			long swap2 = 0;
			for(int i = 0; i < A.length; ++i){
				for(int j = i + 1; j < A.length; ++j){
					if(A[j] < A[i]){
						++swap2;
					}
				}
			}
			
			System.out.println(swap2);
		}
	}

}
