

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

		String[] cardShape = new String[] { "S", "H", "C", "D" };
		for (int i = 0; i < cardShape.length; i++) {
			switch (cardShape[i]) {
			case "S":
				check(cardShape[i], S_card);
				break;
			case "H":
				check(cardShape[i], H_card);
				break;
			case "C":
				check(cardShape[i], C_card);
				break;
			case "D":
				check(cardShape[i], D_card);
				break;
			}
		}
	}

	static void check(String cardShape, ArrayList<Integer> cArd_N) {
		Collections.sort(cArd_N);
		boolean[] chk_arr = new boolean[13];
		for (int i = 1; i < 13; i++) {
			for (int j = 0; j <= cArd_N.size(); j++) {
				if (i != j)
					chk_arr[i] = false;
				else
					chk_arr[i] = true;
			}
		}
			for (int j = 0; j <= chk_arr.length; j++) {
				if (chk_arr[j] == false)
					System.out.println(cardShape + "" + (j+1));
			}
		}
	}