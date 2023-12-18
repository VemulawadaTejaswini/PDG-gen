// (C) 2014 KYOCERA Document Solutions Japan Inc.

package atcorder;

import java.util.Scanner;

public class Tutorial002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int count = 0;
		
		count = B/A;
		if(count >= C) {
			System.out.println(C);
		}else if(count < C) {
			System.out.println(count);	
		}
		
	}
}
