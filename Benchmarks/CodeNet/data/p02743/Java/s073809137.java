import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      double a = (double)sc.nextInt();
      double b = (double)sc.nextInt();
      double c = (double)sc.nextInt();
      
      // 大小判定
      double left = Math.sqrt(a) + Math.sqrt(b);
      double right = Math.sqrt(c);
      String result = "";
      if(left < right){
        result = "Yes";
      }else{
        result = "No";
      }
      
      // 出力
      System.out.println(result);
    }
    
}