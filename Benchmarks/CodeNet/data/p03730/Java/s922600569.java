import java.util.*;

public class Main{
  public static int gcd(int a, int b){
    int x = a;
    int y = b;
    while (y != 0){
      int c = x;
      x = y;
      y = c % y;
    }
    return x;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int ga = gcd(A, B);
    if (C != 0){
      int gb = gcd(A, C);
      if (ga == gb){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
    else{
      System.out.println("YES");
    }
  }
}