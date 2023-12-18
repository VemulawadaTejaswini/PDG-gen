import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			String str = sc.next();
			String[] strArray = str.split("");
			
			String ans = "";
			for (int i = 0; i < strArray.length;i = i + 2 ){
				ans = ans + strArray[i] ;
			}
			System.out.println(ans);

		}
}
