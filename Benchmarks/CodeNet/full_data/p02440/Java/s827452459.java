import java.util.ArrayList;
import java.util.Scanner;


public class Main {
//	配列
	static ArrayList<Integer> arrA = new ArrayList<Integer>();
//	最大値/最小値
	static int max = 0, min = 0;
	
	public static void main(String[] args) {
		
//		必要なパラメータを用意する処理
//		個数情報を扱う変数
		int iNumVar = 0;
//		クエリの種類(0,1)を扱う変数
		int iQueryComm = 0;
//		配列の範囲b/e
		int start = 0, end = 0;

		
//		入力値を取得する処理
		Scanner scInputData = new Scanner(System.in);
//		配列の要素数を取得
		iNumVar = scInputData.nextInt();
		for(int iNumArr=0; iNumArr < iNumVar; iNumArr++) {
			arrA.add(scInputData.nextInt());
		}
//		クエリの数を取得
		iNumVar = scInputData.nextInt();
		
		for(int iNumQuery=0; iNumQuery < iNumVar; iNumQuery++) {
			iQueryComm = scInputData.nextInt();
			start = scInputData.nextInt();
			end = scInputData.nextInt();
			switch(iQueryComm) {
			case 0:
				calcMin(start, end);
				break;
			case 1:
				calcMax(start, end);
				break;
			}
		}		
		scInputData.close();

	}

	private static void calcMax(int start, int end) {
		max = arrA.get(start);
		for(int iFactorNum=start+1; iFactorNum < end; iFactorNum++) {
			max = Math.max(arrA.get(iFactorNum), max);
		}
		System.out.println(max);
	}

	private static void calcMin(int start, int end) {
		min = arrA.get(start);
		for(int iFactorNum=start+1; iFactorNum < end; iFactorNum++) {
			min = Math.min(arrA.get(iFactorNum), min);
		}
		System.out.println(min);
	}

}

