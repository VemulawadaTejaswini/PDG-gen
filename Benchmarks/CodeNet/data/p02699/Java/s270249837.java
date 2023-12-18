import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int S = sc.nextInt();
      int W = sc.nextInt();
      String result = "";
      
      // 判定
      if(S <= W){
        result = "unsafe";
      }else{
        result = "safe";
      }
      
      
      // 出力
      System.out.println(result);
    }
}