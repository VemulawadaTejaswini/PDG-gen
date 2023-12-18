import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    String str = sc.next();
    int firstLength = str.length();

    while(true){
      int strLength = str.length();
      str = str.replace("01", "");
      str = str.replace("10", "");
      if(strLength==str.length()){
        break;
      }
    }

    // 出力
    System.out.println(firstLength - str.length());
  }
}
