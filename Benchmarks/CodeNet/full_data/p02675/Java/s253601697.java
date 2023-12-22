import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      // 判定
      String result = "";
      int digit1 = N % 10;
      if(digit1 == 3){
        result = "bon";
      }else if(digit1 == 0 || digit1 == 1 || digit1 == 6 || digit1 == 8){
        result = "pon";
      }else{
        result = "hon";
      }
      
      // 出力
      System.out.println(result);
    }

}