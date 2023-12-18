import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int d = gcd(a,b);
    if (c % d == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  private static int gcd(int num1,int num2) {
    if(num2==0) return num1;
    else return gcd(num2,num1%num2);
  }
}