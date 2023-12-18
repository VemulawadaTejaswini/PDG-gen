/* Filename: AGC003B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			int sum = 0;
			int countPair = 0;
			for(int i = 0; i < N; ++i){
				int Ai = input.nextInt();
				
				if(Ai != 0){
					sum += Ai;
				} else {
					countPair += sum / 2;
					sum = 0;
				}
			}
			countPair += sum / 2;
			
			System.out.println(countPair);
		}
	}

}
