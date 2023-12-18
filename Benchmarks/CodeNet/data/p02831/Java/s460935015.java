import java.util.HashMap;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int lcm = a * b * gcd (a, b);
    System.out.prinltn(lcm);
  }
  public static int gcd(int a, int b){
    int c = 0;
    while(!(a % b == 0)){
      c = a % b;
      a = b;
      b = c;
      gcd(a,b);
    }
    return b;
  }
}