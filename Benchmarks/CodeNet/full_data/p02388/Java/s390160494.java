package internship;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		int x = 0, temp, tot;
		Scanner sc = new Scanner(System.in);

		while (x != 0) {
			temp = sc.nextInt();

			if (1 >= temp || 100 <= temp) {
				x = temp;
			}
			tot = x * x * x;

			System.out.println(tot);
			System.out.println();

		}

	}
}