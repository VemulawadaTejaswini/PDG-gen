import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextInt();
    long a = scan.nextInt();
    long b = scan.nextInt();
    long c = a+b;
    long d = n%c;
    long g = (n-d)/c;
    System.out.println(g*a+d);
  }
}
