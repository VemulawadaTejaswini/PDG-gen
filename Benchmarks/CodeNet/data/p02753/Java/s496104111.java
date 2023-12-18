import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.nextLine();
      
      // 管理会社の取得
      char S0 = S.charAt(0);
      char S1 = S.charAt(1);
      char S2 = S.charAt(2);
      
      // バス運行の可能性チェック
      String result = "Yes";
      if(S0 == S1 && S0 == S2){
        result = "No";
      }
        
      // 出力
      System.out.println(result);
    }
    

}