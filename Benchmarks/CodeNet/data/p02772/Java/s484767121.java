import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    int N = sn.nextInt();
    int n = 0;
    
    String result = null;
    if(N >= 100) {
      return;
    }
      
    for(int i = 1; i <= N; i++ ){
      // 入力値を代入
      int A = sn.nextInt();
      
      if(A >= 1000) {
        return;
      }
      
      // 条件と比較する
      if((A % 2 == 0) && ((A % 3 == 0) || (A % 5 == 0))){
        System.out.print("APPROVED");
        return;
      } else {
        result = "DENIED";
      }
    } 
    System.out.print(result);
  }
}