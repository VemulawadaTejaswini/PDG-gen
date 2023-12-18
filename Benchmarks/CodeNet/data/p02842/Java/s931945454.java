
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

		//消費税率をかける（切り捨てと切り上げたものの2つを用意する）
		
		int sute = (int)(normalPrice * 1.08);
		int age = (int) Math.ceil(normalPrice * 1.08);

		if(sute ==taxPrice) {
			System.out.println(normalPrice);

		}else if(age == taxPrice){
			System.out.println(normalPrice);
		}else {
			System.out.println(":(");
		}
	}
}
