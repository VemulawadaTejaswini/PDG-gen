package internship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	/*
	 * ???52???
	 *
	 * ???????????????????????????????????????????????? ??????????????? ???n <= 52???
	 *
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ?????±??\???
		String card = sc.next();
		int rank = Integer.parseInt(card);

		ArrayList<Integer> S_card = new ArrayList<Integer>(); // ????????????
		ArrayList<Integer> H_card = new ArrayList<Integer>(); // ?????????
		ArrayList<Integer> C_card = new ArrayList<Integer>(); // ?????????
		ArrayList<Integer> D_card = new ArrayList<Integer>(); // ?????????

		for (int i = 0; i < rank; i++) {
			// ??????
			String Shape = sc.next();
			String No = sc.next();
			int choice = Integer.parseInt(No);
			if (Shape.equals("S")) {
				S_card.add(choice);
			} else if (Shape.equals("H")) {
				H_card.add(choice);
			} else if (Shape.equals("C")) {
				C_card.add(choice);
			} else if (Shape.equals("D")) {
				D_card.add(choice);
			}
		}

		// ??¢?´¢
		// ?¶???????????????????
		Collections.sort(S_card);// ex : 1 2 3 4 5 8 9 10 11 12 13 // 6 7
		for (int i = S_card.size() - 1; i >= 0; i--)
			for (int j = 13; j >= 0; j--) {

				if (j != i)
					System.out.println("S" + "" + j);
			}
		Collections.sort(H_card);
		for (int i = H_card.size() - 1; i >= 0; i--) {
			for (int j = 13; j >= 0; j--) {

				if (j != i)
					System.out.println("H" + "" + j);
			}
		}
		Collections.sort(C_card);
		for (int i = C_card.size() - 1; i >= 0; i--) {
			for (int j = 13; j >= 0; j--) {

				if (j != i)
					System.out.println("C" + "" + j);
			}
		}
		Collections.sort(D_card);
		for (int i = D_card.size() - 1; i >= 0; i--) {
			for (int j = 13; j >= 0; j--) {

				if (j != i)
					System.out.println("D" + "" + j);
			}
		}
	}
}