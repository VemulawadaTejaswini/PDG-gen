import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String str = sc.next();

		if(str.length()==2){

			System.out.println(str);
		}else{
			StringBuffer sb = new StringBuffer(str);
System.out.println(sb.reverse());
			
		}




	}

}