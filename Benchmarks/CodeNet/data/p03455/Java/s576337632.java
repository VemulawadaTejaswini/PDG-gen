import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
      // 積が奇数なら Odd と、 偶数なら Even と出力  
      if((a*b)%2 == 0){
		System.out.println("Even");
	   }else {
        System.out.println("Odd");
       }
    }
}