import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			String str = sc.next();
			
			int ans = 0;

			//インデックスは0からスタートするので，奇数番目の文字は偶数のインデックスになる
		    for(int i = 0; i < str.length(); i ++){
		    	if (str.charAt(i) == '1'){
		    		ans ++;
		    	}
		    }
		    System.out.println(ans);

		}
}
