import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			 int sam ;
			 int check ;
			 
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

	    		 check = ( a * 100  + b * 10  + c) % 4 ;
	    		 if(check != 0 ){
		       		// 出力
		        	System.out.println("NO");
		        	return ;
	    	     }

    		 // 出力
			System.out.println("YES");
		}
}
