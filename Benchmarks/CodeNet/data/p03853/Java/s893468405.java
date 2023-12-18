/* Filename: ABC049B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int H = input.nextInt();
			int W = input.nextInt();
			String[] C = new String[W];
			
			for(int i = 0; i < H; ++i){
				C[i] = input.next().trim();
				
				System.out.println(C[i]);
				System.out.println(C[i]);
			}
		}
	}

}
