import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
//	入力値
	static Scanner scInputData = new Scanner(System.in);
//	座標情報を保持する
	
//	配列
	static ArrayList<Coordinate> arrCoordinate = new ArrayList<Coordinate>();
	
	public static void main(String[] args) {
		
//		必要なパラメータを用意する処理
//		座標を取得する処理
		getCoordinate();
//		座標を(x, y)順でソートする処理
		compareCoordinate();
//		結果を出力する処理
		putResult();
	}
	
	private static void putResult() {
		for(Coordinate crd : arrCoordinate) {
			System.out.println(crd.getX() + " " + crd.getY());
		}
	}
	
	private static void compareCoordinate() {

		Collections.sort(arrCoordinate, new Comparator<Coordinate> () {//x座標でソート
			public int compare(Coordinate crd1, Coordinate crd2) {
				return Integer.compare(crd1.getX(), crd2.getX());
			}
		}.thenComparing(new Comparator<Coordinate>() { //xが同じ場合、y座標でソート 
			public int compare(Coordinate crd1, Coordinate crd2) {
				return Integer.compare(crd1.getY(), crd2.getY());
			}
		}));
	}
	private static void getCoordinate() {
//		 座標の要素数
		int iCoordinateNum = 0;
		iCoordinateNum = scInputData.nextInt();
		while(arrCoordinate.size() < iCoordinateNum) {
			Coordinate crd = new Coordinate(scInputData.nextInt(), scInputData.nextInt());
			arrCoordinate.add(crd);
		}
	}
//	座標情報を扱うクラス
	static class Coordinate {
		int x, y;
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
		int getX() {
			return x;
		}
		int getY() {
			return y;
		}
	}
}
