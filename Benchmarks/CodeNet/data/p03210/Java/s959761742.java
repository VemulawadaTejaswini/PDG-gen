import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int a = sc.nextInt();
    String result;
    if (a == 7 || a == 5 || a == 3) {
      result = "YES"
    } else {
       result = "NO"; 
    }
    // 出力
    System.out.println(result);
  } 
}