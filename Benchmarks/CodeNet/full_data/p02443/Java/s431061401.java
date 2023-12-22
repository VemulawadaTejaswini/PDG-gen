import java.util.ArrayList;
import java.util.Scanner;


public class Main {
//	入力値
	static Scanner scInputData = new Scanner(System.in);
//	配列
	static ArrayList<Integer> arrA = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
//		必要なパラメータを用意する処理
//		配列Aを取得する処理
		getArr(arrA);
//		reverse処理
		reverseArr();
//		結果を出力する処理
		putResult();
	}
	
	private static void putResult() {
		for(int arrNum=0; arrNum < arrA.size() - 1; arrNum++) {
			System.out.print(arrA.get(arrNum) + " ");
		}
		System.out.println(arrA.get(arrA.size() - 1));
	}

	private static void reverseArr() {
//		reverse処理の試行回数
		int revNum = scInputData.nextInt();
//		対象の範囲 (start/end)
		int start = 0, end = 0;
		for(int indexToRev = 0; indexToRev < revNum; indexToRev++) {
			start = scInputData.nextInt();
			end = scInputData.nextInt();
			reverseNum(start, end);
		}
	}

	private static void reverseNum(int start, int end) {
//		対象範囲の入替え回数
		int changeNum= (int) (end - start) / 2;

//		入替える対象の値(small側のみ)
		int val_small = 0;
		for(int indexToChange=0; indexToChange < changeNum; indexToChange++) {
			val_small = arrA.get(start + indexToChange);
			arrA.set(start + indexToChange, arrA.get(end - indexToChange - 1));
			arrA.set(end - indexToChange - 1 , val_small);
		}
	}

	private static void getArr(ArrayList<Integer> arr) {
//		 配列の要素数
		int iArrNum = 0;
		iArrNum = scInputData.nextInt();
		while(arr.size() < iArrNum) {
			arr.add(scInputData.nextInt());
		}
	}

}

