import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      int count = 0;
      
      // カウント
      S += "0";
      int len = S.length();
      for(int i = 0; i < len-5; i++){
        for(int j = i+4; j < len; j++){
          String str = S.substring(i,j);
          long num = Long.parseLong(str);
          if(num % 2019 == 0){
            count++;
          }
        }
      }
      
      // 出力
      System.out.println(count);
    }

}