
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

		String[] cardChk = new String[] { "S", "H", "C", "D" };
		for (int i = 0; i < cardChk.length; i++) {
			switch (cardChk[i]) {
			case "S":
				check(cardChk, S_card);
				break;
			case "H":
				check(cardChk, H_card);
				break;
			case "C":
				check(cardChk, C_card);
				break;
			case "D":
				check(cardChk, D_card);
				break;
			}
		}
	}

	static void check(String[] cardChk, ArrayList<Integer> cArd_N) {
		Collections.sort(cArd_N);
		for (int i = 0; i <= cArd_N.size(); i++) {
			for (int j = 1; j < 13; j++) {

				if (j != i)
					System.out.println(cardChk[i] + j);
			}

		}
	}
}