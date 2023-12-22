

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		/*
		 * ????§?????????????????????\???????????????????????§???????????????????????°??£?§£
		 *
		 * ??????Arraylist???Collections.sort//Error
		 *
		 * ??????????¶?????´???¨??????????????????
		 */

		Scanner sc = new Scanner(System.in);

		// input info
		String [] tmpDice1 = sc.nextLine().split(" ");
		String [] tmpDice2 = sc.nextLine().split(" ");

		int[] diceNum1 = new int[6];
		int[] diceNum2 = new int[6];

		for (int i = 0; i < 6; i++) {
			 diceNum1[i] = Integer.parseInt(tmpDice1[i]);
			 diceNum2[i] = Integer.parseInt(tmpDice2[i]);
		}




		//RollingDice(diceNum1, diceNum2);

		// order
		//[1 2 3 4 5 6] [6 2 4 3 5 1]
		char [] order = {'E','E','S','W','N'}; //sample #3 error
		//EESWN
		//Diceclass3 dc = new Diceclass3();

		int cnt = 100;
		boolean swi = true;
		while(!swi){
			for (int i = 0; i < order.length; i++) {
			switch (order[i]) {
			case 'N':
				 int temp = diceNum2[0];
				 diceNum2[0] = diceNum2[1];
				 diceNum2[1] = diceNum2[5];
				 diceNum2[5] = diceNum2[4];
				 diceNum2[4] = temp;
				 break;
			case 'S':
				temp = diceNum2[0];
				diceNum2[0] = diceNum2[2];
				diceNum2[2] = diceNum2[5];
				diceNum2[5] = diceNum2[3];
				diceNum2[3] = temp;
				break;
			case 'E':
				 temp = diceNum2[0];
				diceNum2[0] = diceNum2[3];
				diceNum2[3] = diceNum2[5];
				diceNum2[5] = diceNum2[2];
				diceNum2[2] = temp;
				break;
			case 'W':
				temp = diceNum2[0];
				diceNum2[0] = diceNum2[4];
				diceNum2[4] = diceNum2[5];
				diceNum2[5] = diceNum2[1];
				diceNum2[1] = temp;
				break;
			}
			cnt--;
		}
			if (diceNum1[0] == diceNum2[0] &&
					diceNum1[1] == diceNum2[1] &&
					 diceNum1[2] == diceNum2[2] &&
					  diceNum1[3] == diceNum2[3] &&
					   diceNum1[4] == diceNum2[4] &&
					    diceNum1[5] == diceNum2[5])swi=false;
			else if(cnt == 0) {
				break;
			}
		}
		//check point
		if (diceNum1[0] == diceNum2[0] &&
				diceNum1[1] == diceNum2[1] &&
				 diceNum1[2] == diceNum2[2] &&
				  diceNum1[3] == diceNum2[3] &&
				   diceNum1[4] == diceNum2[4] &&
				    diceNum1[5] == diceNum2[5]) {
				System.out.println("Yes");
			} else {
				System.out.println("No");}

	/*	//Create Dice
		Diceclass3 DC2 = new Diceclass3(diceNum2);

		// diceNum1????????¬??¨??????????????????
		// top && front
		String result="Yes";
		if (diceNum2[0] == diceNum1[0] && diceNum2[1] == diceNum1[1]) {
			//System.out.println(result);
		} else if (diceNum2[1] == diceNum1[0]) {//?¨?????????¢?????????????????¨
			// Order N
			DC2.orderN();
		} else if (diceNum2[2] == diceNum1[0]) {
			// order W
			DC2.orderW();
		}else if (diceNum2[3] == diceNum1[0]) {
			// order E
			DC2.orderE();
		} else if (diceNum2[4] == diceNum1[0]) {
			// Order S
			DC2.orderS();
		}else if (diceNum2[5] == diceNum1[0]) {
			// BOTTOM
			DC2.orderBottom();
		}
		System.out.println(DC2.Checkout(result, diceNum1));*/
	}


	public static void RollingDice(int[] diceNum1, int[] diceNum2) {

		if (diceNum1[0] == diceNum2[4] && diceNum1[1] == diceNum2[5]) {
			int temp1 = diceNum2[0];
			int temp2 = diceNum2[1];
			diceNum2[0] = diceNum2[4];
			diceNum2[1] = diceNum2[5];
			diceNum2[4] = temp2;
			diceNum2[5] = temp1;
			if (diceNum1[3] != diceNum2[3]) {
				int temp = diceNum2[3];
				diceNum2[3] = diceNum2[4];
				diceNum2[4] = temp;
			}
			if (diceNum1[0] == diceNum2[0] &&
					diceNum1[1] == diceNum2[1] &&
					 diceNum1[2] == diceNum2[2] &&
					  diceNum1[3] == diceNum2[3] &&
					   diceNum1[4] == diceNum2[4] &&
					    diceNum1[5] == diceNum2[5]) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
			}
		}
	}
class Diceclass3 {

	// declear
	static final int DICEDESIGN = 6;
	static final int TOP = 0; // ?????¢ ex:1
	static final int FRONT = 1;// ??£??¢ ex:2
	static final int RIGHT = 2;// ex:3 order:East
	static final int LEFT = 3;// ex:4 order:West
	static final int BACK = 4;// ?£???¢ ex:5 order:North
	static final int BOTTOM = 5;// ex:6 order:South

	int[][] dice = new int[DICEDESIGN][2];

	public Diceclass3() {
		for (int i = 0; i < DICEDESIGN; i++) {
			// [[1, 1], [2, 2], [3, 3], [4, 4], [5, 5], [6, 6]]
			/*
			 * for (int j = 0; j < 3; j++) { dice[i][j] = dice[i+1][j+1]; //
			 * error }
			 */
			dice[i][0] = i + 1;
			dice[i][1] = dice[i][0];
		}
	}

	public Diceclass3(int[] diceNum) {
		this();

		for (int i = 0; i < DICEDESIGN; i++) {
			// [[1, 1], [2, 2], [3, 4], [4, 8], [5, 16], [6, 32]]
			dice[i][1] = diceNum[i];
		}
	}

	public void orderN() {// clear

		// logic T - T ->F, B ->F, BA ->BT, T ->BA
		int[] temp = dice[TOP];
		dice[TOP] = dice[FRONT];
		dice[FRONT] = dice[BOTTOM];
		dice[BOTTOM] = dice[BACK];
		dice[BACK] = temp;
	}

	public void orderS() {// clear

		// logic BT - F -> BT, T ->F, BA -> T, BT ->BA
		int[] temp = dice[BOTTOM];
		dice[BOTTOM] = dice[FRONT];
		dice[FRONT] = dice[TOP];
		dice[TOP] = dice[BACK];
		dice[BACK] = temp;
	}

	public void orderE() {
		// logic L - R->BT, T->R, L->T, B->L
		int[] temp = dice[BOTTOM];
		dice[BOTTOM] = dice[RIGHT];
		dice[RIGHT] = dice[TOP];
		dice[TOP] = dice[LEFT];
		dice[LEFT] = temp;

	}

	public void orderW() {
		// logic R - BT -> R, L -> BT, L -> T, T->R
		int[] temp = dice[RIGHT];
		dice[RIGHT] = dice[BOTTOM];
		dice[BOTTOM] = dice[LEFT];
		dice[LEFT] = dice[TOP];
		dice[TOP] = temp;

	}
	public void orderBottom(){

		int []temp1 = dice[TOP];
		int []temp2 = dice[FRONT];
		dice[FRONT]=dice[BACK];
		dice[TOP] = dice[BOTTOM];
		dice[BACK] = temp2;
		dice[BOTTOM] = temp1;
	}

	public int outputTOP(int top) {
		// TOP?
		return dice[top][1];
	}


	public String Checkout(String result, int[] diceNum1){
		//test

		for (int i = 0; i < diceNum1.length; i++) {
			if(dice[i][1] != diceNum1[i]){
				 result = "No";
			}
		}
		return " ";
	}

	public int CheckRight(int tmptop, int tmpfront, int[][] diceNum) {
		//
		if (tmptop == diceNum[0][1]) {// TOP
			// FRONT
			if (tmpfront == diceNum[1][1])
				return diceNum[2][1];
			// RIGHT
			if (tmpfront == diceNum[2][1])
				return diceNum[4][1];
			// LEFT
			if (tmpfront == diceNum[3][1])
				return diceNum[1][1];
			// BACK
			if (tmpfront == diceNum[4][1])
				return diceNum[3][1];
		} else if (tmptop == diceNum[1][1]) {// FRONT
			// T
			if (tmpfront == diceNum[0][1])
				return diceNum[3][1];
			// R
			if (tmpfront == diceNum[2][1])
				return diceNum[0][1];
			// L
			if (tmpfront == diceNum[3][1])
				return diceNum[5][1];
			// BT
			if (tmpfront == diceNum[5][1])
				return diceNum[2][1];
		} else if (tmptop == diceNum[2][1]) {// RIGHT
			// T
			if (tmpfront == diceNum[0][1])
				return diceNum[1][1];
			// F
			if (tmpfront == diceNum[1][1])
				return diceNum[5][1];
			// R
			if (tmpfront == diceNum[4][1])
				return diceNum[0][1];
			// BT
			if (tmpfront == diceNum[5][1])
				return diceNum[4][1];
		} else if (tmptop == diceNum[3][1]) {// LEFT
			// T
			if (tmpfront == diceNum[0][1])
				return diceNum[4][1];
			// F
			if (tmpfront == diceNum[1][1])
				return diceNum[0][1];
			// R
			if (tmpfront == diceNum[4][1])
				return diceNum[5][1];
			// BT
			if (tmpfront == diceNum[5][1])
				return diceNum[1][1];
		} else if (tmptop == diceNum[4][1]) {// BACK
			// T
			if (tmpfront == diceNum[0][1])
				return diceNum[2][1];
			// R
			if (tmpfront == diceNum[2][1])
				return diceNum[5][1];
			// L
			if (tmpfront == diceNum[3][1])
				return diceNum[0][1];
			// BT
			if (tmpfront == diceNum[5][1])
				return diceNum[3][1];
		} else if (tmptop == diceNum[5][1]) {// BOTTOM
			// F
			if (tmpfront == diceNum[1][1])
				return diceNum[3][1];
			// R
			if (tmpfront == diceNum[2][1])
				return diceNum[1][1];
			// L
			if (tmpfront == diceNum[3][1])
				return diceNum[4][1];
			// BA
			if (tmpfront == diceNum[4][1])
				return diceNum[2][1];
		}
		return 0;
	}

	/*public int[] chkTwoDice(int[] diceNum2, int[] diceNum1){ //test Area


		if (diceNum2[FRONT] == diceNum1[TOP]) {//?¨?????????¢?????????????????¨
			// Order N
			int temp = diceNum2[TOP];
			diceNum2[TOP] = diceNum2[FRONT];
			diceNum2[FRONT] = diceNum2[BOTTOM];
			diceNum2[BOTTOM] = diceNum2[BACK];
			diceNum2[BACK] = temp;

		} else if (diceNum2[RIGHT] == diceNum1[TOP]) {
			// order W
			int temp = diceNum2[RIGHT];
			diceNum2[RIGHT] = diceNum2[BOTTOM];
			diceNum2[BOTTOM] = diceNum2[LEFT];
			diceNum2[LEFT] = diceNum2[TOP];
			diceNum2[TOP] = temp;

		} else if (diceNum2[LEFT] == diceNum1[TOP]) {
			// order E
			int temp = diceNum2[BOTTOM];
			diceNum2[BOTTOM] = diceNum2[RIGHT];
			diceNum2[RIGHT] = diceNum2[TOP];
			diceNum2[TOP] = diceNum2[LEFT];
			diceNum2[LEFT] = temp;

		} else if (diceNum2[BACK] == diceNum1[TOP]) {
			// Order S
			int temp = diceNum2[BOTTOM];
			diceNum2[BOTTOM] = diceNum2[FRONT];
			diceNum2[FRONT] = diceNum2[TOP];
			diceNum2[TOP] = diceNum2[BACK];
			diceNum2[BACK] = temp;

		} else if (diceNum2[BOTTOM] == diceNum1[TOP]) {
			// BOTTOM
			int temp = diceNum2[BOTTOM];
			int temp2 = diceNum2[TOP];
			diceNum2[FRONT] = diceNum2[TOP];
			diceNum2[BACK] = diceNum2[BOTTOM];
			diceNum2[TOP] = temp;
			diceNum2[BOTTOM] = temp2;
		}
		//?¨?????????¢?????????????????¨
			return diceNum2;
	}*/
}}