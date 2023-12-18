/* Filename: ABC043D.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String s = input.next();
			
			boolean isUnbalanced = false;
			for(int i = 1; i < s.length(); ++i){
				if(s.charAt(i) == s.charAt(i - 1)){
					System.out.printf("%d %d\n", i, i + 1);
					isUnbalanced = true;
					break;
				}
			}
			
			if (isUnbalanced == false) {
				System.out.println("-1 -1");
			}

		}
	}
}
