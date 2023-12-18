import java.util.*;
public class Main {
 public static void main (String[] args){

	 	Scanner sc = new Scanner(System.in);
	 	
	 	// 整数の入力
	 	String str = sc.next();

	 	String out = "NO";
	 	for (int i =0; i< 1; i++){
	 		String strTry = str.substring(0,i);
	 		if (strTry.equals("keyence")){
	 			out = "YES";
	 			break;
	 		}
	 	}



	 	// 出力
	 	
	 	System.out.println(out);

	 
	 
 }
	
}