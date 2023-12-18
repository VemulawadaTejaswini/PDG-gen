import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = a%500;
    long c = (long) (a-b)/500;
    long d = b%5;
    long e = (long) (b-d)/5;
    System.out.println(e*5+c*1000);
  }
}
