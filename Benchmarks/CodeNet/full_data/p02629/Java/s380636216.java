

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		ArrayList<Integer> numList = new ArrayList<Integer>();
		while (true) {
			int digit = (int)(num % 26L);
			if (digit == 0) {
				digit = 26;
			}
			numList.add(digit + 96);
			num = (num - digit) / 26L;
			if (num == 0) {
				break;
			}
		}

		for (int i = numList.size() - 1; i >= 0; i--) {
			int let = (int)numList.get(i);
			char c = (char)let;
			System.out.print(c);
		}
	}


}
