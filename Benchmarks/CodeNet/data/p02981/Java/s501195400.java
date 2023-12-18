import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
      //出力値取得	
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();      
      //System.out.println(B);
      
      計算
      if(A < B){
        System.out.println(A * N);
      }else{
        System.out.println(B * N);      
      }
    }
}
  
  