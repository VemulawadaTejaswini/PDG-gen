
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		//1234
		String YY = S.substring(0, 2);
		String MM = S.substring(2, 4);

		//00 <= YY <= 99
		//01 <= MM <= 12
		int yy = Integer.parseInt(YY);
		int mm = Integer.parseInt(MM);

		if(yy > 12 && (1 <= mm && mm <=12)){
			System.out.println("YYMM");
		}else if(12 >= yy && mm > 12) {
			System.out.println("MMYY");
		}else if(12 >= yy && (1 <= mm && mm <=12) ) {
			System.out.println("AMBIGUOUS");
		}else {
			System.out.println("NA");
		}
		//YYMM
		//yy>12 && 01 <= MM <= 12

		//MMYY
		//13 > yy && MM >12

		//AMBIGUOUS
		//01 <= MM <= 12 && 12 >= yy

		//NA
		// else


	}

}
