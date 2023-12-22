package internship;

import java.util.Scanner;

public class test1 {



	public static void main(String[] args) {
		int x = 0, temp,  tot;
		boolean swi = false;
		Scanner sc = new Scanner(System.in);

		while (swi == true ) {
			temp = sc.nextInt();

			if (1 <= temp || 100 <= temp)
				x = temp;
			swi=true;
		}
		tot = x * x * x;

		System.out.println(tot);
		System.out.println();

	}

}