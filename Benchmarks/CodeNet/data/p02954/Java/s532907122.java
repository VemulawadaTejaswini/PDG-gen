import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 地点数の入力
		String s = sc.nextLine();
		String result = "";
		String[] sList = s.split("");

		//人数初期化
		int[] defList = new int[sList.length];

		//人数初期化
		int[] resList = new int[sList.length];

		for (int i = 0; i < defList.length; i++) {
			defList[i] = 1;
		}

		//巡回展。Rの移動
		//次がLならステイ
		//次がRRなら次の次へ移動
		//RLならresListへ
		//末尾2つ前まで
		for (int i = 0; i < sList.length-2; i++) {
			if (sList[i].equals("L")) continue;
			String nextStrs = lookNext(sList[i+1], sList[i+2]);
			if (nextStrs.equals("RR") ) {
				defList[i+2] += defList[i];
				//System.out.println("RR"+i);
			} else if (nextStrs.equals("RL")) {
				resList[i+2] += defList[i];
				//System.out.println("RL"+i);
			} else if (sList[i+1].equals("L")) {
				resList[i] += defList[i];
				//System.out.println("L"+i);
			}
		}
		//末尾一つ前
		//returnResult(resList);

		if (sList[sList.length-2].equals("R")) resList[sList.length-2] = defList[sList.length-2];


		//returnResult(resList);

		//巡回展。Rの移動
		//次がRならステイ
		//次がRRなら次の次へ移動
		//RLならresListへ
		//末尾2つ前まで
		for (int i = sList.length-1; i > 1; i--) {
			if (sList[i].equals("R")) continue;
			String nextStrs = lookNext(sList[i-2], sList[i-1]);
			//System.out.println("test"+nextStrs+i);
			if (nextStrs.equals("LL") ) {
				defList[i-2] += defList[i];
				//System.out.println("LL"+i);
			} else if (nextStrs.equals("RL")) {
				resList[i-2] += defList[i];
				//System.out.println("RL"+i);
			} else if (sList[i-1].equals("R")) {
				resList[i] += defList[i];
				//System.out.println("R"+i);
			}
		}
		//末尾一つ前

		if (sList[1].equals("L")) resList[1] = defList[1];

		returnResult(resList);

	}

	private static String lookNext(String next, String nexnex) {
		return next + nexnex;
	}

	private static void returnResult(int[] resList) {
		String result = "";


		for (int i = 0; i < resList.length; i++) result += resList[i]+" ";

		System.out.println(result.substring(0, result.length()-1));
	}
}