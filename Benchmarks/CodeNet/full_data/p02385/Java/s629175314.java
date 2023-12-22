

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		/*
		 * ????§?????????????????????\???????????????????????§???????????????????????°??£?§£
		 *
		 * ??????Arraylist???Collections.sort
		 *
		 * ??????????¶?????´???¨??????????????????
		 *
		 *
		 */

		Scanner sc = new Scanner(System.in);

		String [] tmpDice1 = sc.nextLine().split(" ");
		String [] tmpDice2 = sc.nextLine().split(" ");

		ArrayList<Integer> Dice1 = new ArrayList<Integer>();
		ArrayList<Integer> Dice2 = new ArrayList<Integer>();

		for (int i = 0; i < tmpDice1.length; i++) {
			Dice1.add(Integer.parseInt(tmpDice1[i]));
		}
		for (int i = 0; i < tmpDice2.length; i++) {
			Dice2.add(Integer.parseInt(tmpDice2[i]));
		}

		Collections.sort(Dice1);
		Collections.sort(Dice2);

		String [] chkStr=new String [6];
		for (int i = 0; i < Dice1.size(); i++) {
			if (Dice1.get(i) == Dice2.get(i)) {
				chkStr[i] ="Yes";
			}else{
				chkStr[i] ="No";
			}
		}
		String point = "";
		for (int i = 0; i < chkStr.length; i++) {
			if (chkStr[i].contains("Y")) {
				point = "Yes";
			} else {
				point = "No";
			}
		}
		System.out.println(point);







	}

}