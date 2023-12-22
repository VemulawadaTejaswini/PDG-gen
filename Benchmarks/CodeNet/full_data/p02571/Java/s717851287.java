import java.util.*;
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
      String S = sc.nextLine(); //全体文字列
      String T = sc.nextLine(); //部分文字列
      int answer = 0;

      //Tの文字を削る　とりあえず頭から一文字ずつ？？？
      //substringを使う時は前半部分は後半の値を超えないように
      for (int p = 1; p-1 < T.length(); p++) {
        for (int q = 0; q < p; q++) {
            System.out.println(T.substring(q,p));
        }
      }
      //TがSにまるごとふくまれているかチェック
      if(S.contains(T)){
          //含まれている場合
          answer = 0;
      }else{
          //含まれていない場合
          answer = S.length();
      }

      System.out.println(answer);   
  }
}