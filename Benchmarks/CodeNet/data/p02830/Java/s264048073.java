import java.util.HashMap;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    long lcm = a * b / gcd (a, b);
    System.out.println(lcm);
  }
  public static int gcd(int a, int b){
    if(a % b == 0){
      return b;
    }
    return gcd(b, a%b);
  }
}