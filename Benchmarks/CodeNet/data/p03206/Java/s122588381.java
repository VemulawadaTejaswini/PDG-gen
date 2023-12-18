package archiveBeginner;

import java.util.Scanner;

public class Xmas {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 22 <= D <= 25

		// D=25 String xmas = "Christmas" ;
		// D=24 string xmas = "Christmas" + " " + "Eve"  ;
		// D=23 string xmas = "Christmas  + " " + "Eve" + " " +  "Eve" ;
		// D=22 string xmas = "Christmas Eve Eve Eve" ;

		String xmas = "Christmas" + " ";

		String eve = "";

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();



		for( int i = 25 ; i >D  ; i--) {

			 eve += "Eve" + " " ;

		}

		System.out.println(xmas + eve);



	}

}
