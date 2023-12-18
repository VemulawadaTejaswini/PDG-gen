import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    // 出力
    if( a == b  && a == c || a != b && a != c && b != c )
      System.out.println("No");
    else
      System.out.println("Yes");
  }
}