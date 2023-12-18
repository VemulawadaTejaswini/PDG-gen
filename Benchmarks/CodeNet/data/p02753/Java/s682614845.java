import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  // 整数の入力
  // int a = sc.nextInt();
  // スペース区切りの整数の入力
  int a = sc.nextInt();
  int b= sc.nextInt();
  //long b = sc.nextLong();

  BigDecimal ba =BigDecimal.valueOf( a );
  BigDecimal bb = BigDecimal.valueOf( b );

 	String kotae = "-1";
 	
 	for (int i = 1; i <= 1250; i++){
 		{
			BigDecimal hati = new BigDecimal(String.valueOf(i * 0.08));
 			BigDecimal zyu = new BigDecimal(String.valueOf(i * 0.1));
 			
 			BigDecimal bd1 = hati.setScale(0, RoundingMode.DOWN);
 			BigDecimal bd2 = zyu.setScale(0, RoundingMode.DOWN);
 			if(ba==bd1 && bb==bd2){
 				kotae = String.valueOf(i);
 			break;
 			}
 			
 		}
 	}
 				  	 System.out.println(kotae);
 
}
}
