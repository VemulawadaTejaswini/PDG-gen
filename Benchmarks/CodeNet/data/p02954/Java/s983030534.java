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

		//同じ文字が連続する回数をカウント
		//その数以上の偶数回シミュレートする
		String before = "";
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < sList.length; i++) {
			String now = sList[i];
			//System.out.println(before+now);
			if (!before.equals(now)) {
				count = 1;
				//System.out.println("count1");
			} else {
				count++;
				//System.out.println("coutn++");
			}
			before = now;
			if (count > maxCount) maxCount = count;
		}

		count = maxCount;
		if (count%2==1) count++;
		//System.out.println(count);
		int[] numList = new int[sList.length];
		for (int i = 0; i < sList.length; i++) {
			numList[i] = 1;
		}

		for (int i = 0; i < count; i++) {

			int[] newNumList = new int[sList.length];
			for (int j = 0; j < sList.length; j++) {
				//System.out.println(i + " " + j);
				if (sList[j].equals("R")) {
					//System.out.println("R" + numList[j]);
					newNumList[j+1] += numList[j];
				} else {
					//System.out.println("L" + numList[j]);
					newNumList[j-1] += numList[j];
				}

			}

			//result = "";
			//for (int k = 0; k < sList.length; k++) {
			//	if (k >= 1) result += " ";
			//	result += String.valueOf(newNumList[k]);
			//}

			//System.out.println(result);
			numList = newNumList;
		}


		result = "";
		for (int i = 0; i < sList.length; i++) {

			if (i >= 1) result += " ";
			result += String.valueOf(numList[i]);
		}

		System.out.println(result);
	}