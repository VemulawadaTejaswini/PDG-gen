

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int diceEA = sc.nextInt();
	String [] tmpDice = new String[DiceWorld2.DICEDESIGN];
	int[] diceNum = new int[DiceWorld2.DICEDESIGN];

	ArrayList<int[]> diceArr= new ArrayList<int[]>();

	for (int i = 0; i < diceEA; i++) {
		tmpDice = sc.nextLine().split(" ");
		for (int j = 0; j < DiceWorld2.DICEDESIGN; j++) {
			 diceNum[j] = Integer.parseInt(tmpDice[j]);
		}
		diceArr.add(diceNum);
	}
	for (int i = 0; i < diceEA; i++) {
		for (int j = 0; j < diceNum.length; j++) {

			DiceWorld2 dwA=new DiceWorld2(diceArr.get(j));
			DiceWorld2 dwB=new DiceWorld2(diceArr.get(i));

			if(dwA.chkDice(dwB)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}
}
class DiceWorld2{

	static final int DICEDESIGN = 6;
	static final int TOP = 0; // ?????¢ ex:1
	static final int FRONT = 1;// ??£??¢ ex:2
	static final int RIGHT = 2;// ex:3 order:East
	static final int LEFT = 3;// ex:4 order:West
	static final int BACK = 4;// ?£???¢ ex:5 order:North
	static final int BOTTOM = 5;// ex:6 order:South

	int[][] dice = new int[DICEDESIGN][2];

	public DiceWorld2() {
		for (int i = 0; i < DICEDESIGN; i++) {
			// [[1, 1], [2, 2], [3, 3], [4, 4], [5, 5], [6, 6]]
			dice[i][0] = i + 1;
			dice[i][1] = dice[i][0];
		}
	}

	public DiceWorld2(int[] diceNum) {
		this();

		for (int i = 0; i < DICEDESIGN; i++) {
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
		// orderN*2
		int []temp1 = dice[TOP];
		int []temp2 = dice[FRONT];
		dice[FRONT]=dice[BACK];
		dice[TOP] = dice[BOTTOM];
		dice[BACK] = temp2;
		dice[BOTTOM] = temp1;
	}
	public void orderRight(){
		//?¨?
        int[] temp = dice[FRONT];
        dice[FRONT] = dice[RIGHT];
        dice[RIGHT] = dice[BACK];
        dice[BACK] = dice[LEFT];
        dice[LEFT] = temp;
    }

    public void orderLeft(){
    	//?¨?
        int[] temp = dice[FRONT];
        dice[FRONT] = dice[LEFT];
        dice[LEFT] = dice[BACK];
        dice[BACK] = dice[RIGHT];
        dice[RIGHT] = temp;
    }

	public int outputTOP(int top) {

		return dice[top][1];
	}
	public String output(DiceWorld dwA, DiceWorld dwB) {

		if (dwA.dice[TOP] == dwB.dice[TOP] &&
				dwA.dice[FRONT] == dwB.dice[FRONT] &&
					dwA.dice[RIGHT] == dwB.dice[RIGHT] &&
						dwA.dice[LEFT] == dwB.dice[LEFT] &&
							dwA.dice[BACK] == dwB.dice[BACK] &&
								dwA.dice[BOTTOM] == dwB.dice[BOTTOM])
			return "Yes";
		else
			return "No";

	}

	public int getNum(int position) {

		return dice[position][1];

	}

	public int getPosition(int label) {

		for (int i = 0; i < DICEDESIGN; i++) {

			if (label == dice[i][0]) {
				return i;
			}
		}
		return -1;

	}

	public void toTop(int label) {
		switch (getPosition(label)) {
		case FRONT:
			orderN();
			break;
		case RIGHT:
			orderW();
			break;
		case LEFT:
			orderE();
			break;
		case BACK:
			orderS();
			break;
		case BOTTOM:
			orderBottom();
			break;
		}
	}

	public void toFront(int label) {

		switch (getPosition(label)) {
		case TOP:
			orderS();
			break;
		case RIGHT:
			orderRight();
			break;
		case LEFT:
			orderLeft();
			break;
		case BACK:
			orderRight();
			orderRight();
			break;
		case BOTTOM:
			orderN();
			break;
		}
	}

	public boolean chkDice(DiceWorld2 dwB) {

		boolean flag = false;

		for (int i = 0; i < DICEDESIGN; i++) {
			for (int j = 0; j < DICEDESIGN; j++) {

				toTop(i + 1);
				toFront(j + 1);

				for (int k = 0; k < DICEDESIGN; k++) {

					if (getNum(k) == dwB.getNum(k)) {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}
				if (flag) {
					return flag;
				}
			}
		}
		return flag;
	}
}