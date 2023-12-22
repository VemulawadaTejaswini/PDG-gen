import java.util.*;

public class Main {
  public static void main(String args[]) {
    //入力された値の取得
    int a = args[0];
    //計算
    int answer = a + a * a + a * a * a;
    //出力
    System.out.println(answer);
  }
}