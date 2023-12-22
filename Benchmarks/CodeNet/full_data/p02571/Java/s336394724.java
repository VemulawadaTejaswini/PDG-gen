import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      
      // 一致する文字数の最大値を取得
      int max = 0;
      int lenS = S.length();
      int lenT = T.length();
      for(int i = 0; i < lenS-lenT+1; i++){
        String subS = S.substring(i, i+lenT);
        int count = matchStr(subS, T);
        if(count > max){
          max = count;
        }
      }
      
      // 出力
      System.out.println(lenT - max);
    }
    
    // 2つの文字列の一致する文字数を数える関数
    public static int matchStr(String str1, String str2){
      int len = str1.length();
      int count = 0;
      for(int i = 0; i < len; i++){
        if(str1.charAt(i) == str2.charAt(i)){
          count++;
        }
      }
      return count;
    }

}