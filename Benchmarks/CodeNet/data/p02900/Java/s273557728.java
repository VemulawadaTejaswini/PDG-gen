import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    long x = gcd(a,b);
    int count = 0;

    if(x == 1) count++;

    System.out.println(x);

  }

  public static long gcd(int a,int b) {
    if(a < b) return gcd(b,a);
    if(b == 0) return a;
    return gcd(b,a%b);
  }

}
