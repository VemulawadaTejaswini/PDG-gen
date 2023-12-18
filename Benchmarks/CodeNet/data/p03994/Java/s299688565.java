/* Filename: C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			char[] s = input.next().toCharArray();
			int K = input.nextInt();

			int cur = 0;

			while (K > 0) {
				if (cur < s.length - 1) {
					int distToA = ('z' - s[cur] + 1) % 26;
					
					if(distToA < K){
						s[cur] = 'a';
						K -= distToA;
					}
					
				} else {
					s[cur] = (char)((s[cur] - 'a' + K % 26) % 26 + 'a');
					K = 0;
				}
				
				++cur;
			}
			
			System.out.println(s);
		}
	}

}
