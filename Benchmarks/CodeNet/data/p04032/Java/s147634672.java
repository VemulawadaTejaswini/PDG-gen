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
			int[] countChar = new int[26];
			
			for(int i = 0; i < s.length(); ++i){
				++countChar[s.charAt(i) - 'a'];
			}
			
			boolean isUnbalanced = false;
			int mostChar = -1;
			for(int i = 0; i < countChar.length; ++i){
				 if(countChar[i] * 2 >= s.length()){
					 if(isUnbalanced){
						 isUnbalanced = false;
						 mostChar = -1;
						 break;
					 }
					 
					 isUnbalanced = true;
					 mostChar = i;
				 }
			}

			if(s.length() > 1 && isUnbalanced){
				int a = s.indexOf('a' + mostChar) + 1;
				int b = s.lastIndexOf('a' + mostChar) + 1;
				
				System.out.printf("%d %d\n", a, b);
			} else {
				System.out.println("-1 -1");
			}
		}
	}

}
