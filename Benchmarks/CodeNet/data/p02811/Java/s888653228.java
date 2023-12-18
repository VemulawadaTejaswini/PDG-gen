import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int K = sc.nextInt(); // 合計値
      int X = sc.nextInt();

      if((500 * K) >= X){
      	System.out.println("Yes");
      } else {
      	System.out.println("No");
      }
      
   }
}