import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String N = sc.next();
      
      // 判定
      String result = "No";
      int total = 0;
      for(int i = 0; i < N.length(); i++){
        int num = Integer.parseInt(strAt(N,i));
        total += num;
      }
      if(total % 9 == 0){
        result = "Yes";
      }
      
      // 出力
      System.out.println(result);
    }
    
    // 文字列のx文字目を取得する関数
    public static String strAt(String str, int x){
      return String.valueOf(str.charAt(x));
    }

}