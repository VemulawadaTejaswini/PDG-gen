

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		// game set
		int gameset = sc.nextInt();

		ArrayList<int[]> numList = new ArrayList<int[]>();
		ArrayList<int[]> colorList = new ArrayList<int[]>();
		//ArrayList<Integer> answer = new ArrayList<Integer>();

		for (int i = 0; i < gameset; i++) {
			int[] tmpNum = new int[UTRummy.ONECARDSET];
			int[] tmpColor = new int[UTRummy.ONECARDSET];
			for (int j = 0; j < 9; j++) {
				tmpNum[j] = sc.nextInt();
			}
			for (int j = 0; j < 9; j++) {
				if (sc.next().equals("R"))
					tmpColor[j] = UTRummy.RED;
				else if (sc.next().equals("G"))
					tmpColor[j] = UTRummy.GREEN;
				else if (sc.next().equals("B"))
					tmpColor[j] = UTRummy.BLUE;
				else
					break;
			}
			numList.add(tmpNum);
			colorList.add(tmpColor);
		}

		for (int i = 0; i < gameset; i++) {
			UTRummy utr = new UTRummy(numList.get(i),colorList.get(i) );

			//utr.playtheGame(utr);
		}
	}

	static class UTRummy {

		// declear
		static final int ONECARDSET = 9;
		// static final int CARDPAGE = 2;

		// color
		static final int RED = 0;
		static final int GREEN = 1;
		static final int BLUE = 2;

		// cardNum
		static final int card1 = 0;
		static final int card2 = 1;
		static final int card3 = 2;
		static final int card4 = 3;
		static final int card5 = 4;
		static final int card6 = 5;
		static final int card7 = 6;
		static final int card8 = 7;
		static final int card9 = 8;

		int[][] Cardset = new int[ONECARDSET][ONECARDSET];

		public UTRummy(){

		}
		public UTRummy(int[] numList, int[] colorList) {
			for (int i = 0; i < ONECARDSET; i++) {
				for (int j = 0; j < numList.length; j++) {
					Cardset[j][i] = numList[j];
					Cardset[i][j] = colorList[j];
				}
			}
		}

		// num
		public int getNum(int position) {

			return Cardset[position][card1];

		}

		// color
		public int getColor(int label) {

			for (int i = 0; i < ONECARDSET; i++) {

				if (label == Cardset[card1][i])
					return i;
			}

			return -1;
		}
	}
}