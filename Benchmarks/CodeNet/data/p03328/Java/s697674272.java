import java.util.Scanner;
public class Main{
  public static int r1(c){
    if(c == 1)
      return 1;
    else
      return c + r1(c - 1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = b - a;  // b は c 本目だとわかる
    int hight = r1(c);  // 棒の高さは hight
    System.out.println(hight - b);
  }
}