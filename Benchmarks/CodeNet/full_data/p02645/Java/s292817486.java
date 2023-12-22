import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      // ニックネーム命名
      String nickname = S.substring(0,3);
      
      // 出力
      System.out.println(nickname);
    }

}