import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      // 判定
      int count = 0;
      int max = 0;
      for(int i = 0; i < 3; i++){
        if(strAt(S,i).equals("R")){
          count++;
        }else{
          if(max < count){
            max = count;
          }
          count = 0;
        }
      }

      if(max < count){
        max = count;
      }
      
      // 出力
      System.out.println(max);
    }
    
    // 文字列のx文字目を取得する関数
    public static String strAt(String str, int x){
      return String.valueOf(str.charAt(x));
    }

}