import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner row = new Scanner(System.in);

		//消費税含む金額を取得
		int taxPrice = row.nextInt();

		//税抜き金額を計算
		//ただし切り捨て金額にするためにInt型で計算する
		int normalPrice = taxPrice / 108 * 100;

		//切り捨て金額と切り上げ金額（normalPrice*108/100)のうち該当すれば答え

		if(normalPrice*108/100 ==taxPrice) {
			System.out.println(normalPrice);

		}else if((normalPrice+1)*108/100 ==taxPrice){
			System.out.println(normalPrice+1);
		}else {
			System.out.println(":(");
		}
	}
}
