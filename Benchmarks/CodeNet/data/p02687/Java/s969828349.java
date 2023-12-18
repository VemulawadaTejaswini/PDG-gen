import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();

      String answer = S.equals("ABC") ? "ARC" : "ABC";
 
      System.out.println(answer);
    }
}