import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    // 入力
    Scanner sc = new Scanner(System.in);
    int m1 = sc.nextInt();
    int d1 = sc.nextInt();
    int m2 = sc.nextInt();
    int d2 = sc.nextInt();
    //   出力
    if(m1 == m2)
      System.out.print(0);
    else
      System.out.print(1);
  }
}