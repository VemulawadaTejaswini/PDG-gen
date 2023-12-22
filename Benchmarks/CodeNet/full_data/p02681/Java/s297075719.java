import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      //素抜け君の数
      String S = sc.next();
      String T = sc.next();
      if(S.equals(T.substring(0,S.length()))){
          System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}