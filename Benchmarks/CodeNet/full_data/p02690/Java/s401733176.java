

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		int ansa = 0;
		int ansb = 0;

		for (int i = -200; i < 201; i++) {
			for (int j = -200; j < 201; j++) {
				if (x == pow(i) - pow(j)) {
					ansa = i;
					ansb = j;
					break;
				}
			}
		}

		System.out.println(ansa + " " + ansb);
	}

	static long pow(int l) {
		long result = 1;
		for (int i = 0; i < 5; i++)
			result *= l;

		return result;
	}

}
