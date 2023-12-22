import java.util.ArrayList;
import java.util.Scanner;


public class Main {
//	入力値
	static Scanner scInputData = new Scanner(System.in);
//	配列
	static ArrayList<Integer> arrA = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
//		必要なパラメータを用意する処理
//		個数情報を扱う変数
		int iNumVar = 0;
		
//		配列を取得する処理
		getArr();
//		クエリの回数を取得する処理
		iNumVar = getQueryNum();
		for(int iQueryNum=1; iQueryNum <= iNumVar; iQueryNum++) {
//			クエリを実行する処理
			doQuery();
		}

	}
	

	private static void doQuery() {
//		配列の範囲(b/e)
		int start = scInputData.nextInt();
		int end = scInputData.nextInt();
//		対象の値(k)
		int bingoNum = scInputData.nextInt();
//		対象の合計値
		int iTotal = 0;
		for(int iFactorNum=start; iFactorNum < end; iFactorNum++) {
			if(arrA.get(iFactorNum).intValue() == bingoNum)
				iTotal++;
		}
		 System.out.println(iTotal);
		
	}


	private static int getQueryNum() {
//		クエリの数
		return scInputData.nextInt();
		
	}


	private static void getArr() {
//		 配列の要素数
		int iArrNum = 0;
		iArrNum = scInputData.nextInt();
		while(arrA.size() < iArrNum) {			// !!!!!
			arrA.add(scInputData.nextInt());
		}
	}

}

