

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

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
			String shape = sc.next();
			String no = sc.next();
			int choice = Integer.parseInt(no);
			if (shape.equals("S")) {
				S_card.add(choice);
			} else if (shape.equals("H")) {
				H_card.add(choice);
			} else if (shape.equals("C")) {
				C_card.add(choice);
			} else if (shape.equals("D")) {
				D_card.add(choice);
			}
		}

		// ??¢?´¢
		// ?¶???????????????????

		String[] card_chk = new String[] { "S", "H", "C", "D" };
		for (int i = 0; i < card_chk.length; i++) {
			switch (card_chk[i]) {
			case "S":
				check(card_chk, S_card);
				break;
			case "H":
				check(card_chk, H_card);
				break;
			case "C":
				check(card_chk, C_card);
				break;
			case "D":
				check(card_chk, D_card);
				break;
			}
		}

		// Collections.sort(S_card);
		// // ex : 1 2 3 4 5 8 9 10 11 12 13 // 6 7
		// for(int i = 0; i <= S_card.size(); i--)
		// for (int j = 1; j < 13; j--) {
		// // ex : 7 6
		//
		// if (j != i) System.out.println("S" + j);
		// }

		// Collections.sort(H_card);
		// for (int i = 0; i <= H_card.size(); i--) for (int j = 1; j < 13; j--)
		// {// ex : 7 6
		//
		// if (j != i) System.out.println("H" + j); } Collections.sort(C_card);
		// for (int i = 0; i <= C_card.size(); i--) for (int j = 1; j < 13; j--)
		// {// ex : 7 6
		//
		// if (j != i) System.out.println("C" + j); } Collections.sort(D_card);
		// for (int i = 0; i <= D_card.size(); i--) for (int j = 1; j < 13; j--)
		// {// ex : 7 6
		//
		// if (j != i) System.out.println("D" + j); }

	}

	static void check(String[] card_chk, ArrayList<Integer> N_card) {
		Collections.sort(N_card);
		for (int i = 0; i <= N_card.size(); i++) {
			for (int j = 1; j < 13; j++) {

				if (j != i)
					System.out.println(card_chk[i] + j);
			}

		}
	}
}