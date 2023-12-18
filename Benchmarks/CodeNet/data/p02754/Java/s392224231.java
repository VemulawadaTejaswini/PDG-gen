import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = a+b;
    long d = n%c;
    long g = (n-d)/c;
    System.out.println(g*a+d);
  }
}
