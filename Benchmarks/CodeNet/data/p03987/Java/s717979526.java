/* Filename: AGC005B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] a = new int[N];

			long sum = 0;
			for (int i = 0; i < a.length; ++i) {
				a[i] = input.nextInt();
				sum += a[i];
			}

			int len = a.length - 1;
			while (len > 0) {
				for (int i = 0; i < len; ++i) {
					a[i] = Math.min(a[i], a[i + 1]);
					sum += a[i];
				}

				--len;
			}
			
			System.out.println(sum);
		}
	}

}
