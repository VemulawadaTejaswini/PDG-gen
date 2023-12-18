import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      
      // 整数の取得
	  int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      
      int sum = A+B+C;
      
      if(sum>=22){
        System.out.println("bust");
      }else{
        System.out.println("win");
      }
    }
}