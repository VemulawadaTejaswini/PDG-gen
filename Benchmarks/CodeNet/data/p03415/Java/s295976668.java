import java.util.*;

public class Main {
  public static void main(String[] args) {
    // 入力読み込み
  	Scanner sc = new Scanner(System.in);
    // 1列ずつ文字列を取得し、1文字ずつ配列に格納
    String[] firstLine = sc.nextLine().split("\\s");
    String[] secondLine = sc.nextLine().split("\\s");
    String[] thirdLine = sc.nextLine().split("\\s");
    
    // 1行目の1番目＋2行目の2番目＋3行目の3番目の値を連結し出力
    System.out.println(firstLine[0] + secondLine[1] + thirdLine[2]);
  }
}