import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){

			String strcn = "ABC";
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int N = sc.nextInt();
			
			if(999>=N){
       		// 出力
				System.out.println(strcn);
				return ;
			}
			strcn = "ABD";
			N = N - 1000;

			if(999>=N){
	       		// 出力
				System.out.println(strcn);
				return ;
			}
		}
}
