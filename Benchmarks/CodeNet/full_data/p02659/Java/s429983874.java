import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    double b = scan.nextDouble();
    int b1 = (int) b;
    double b2 = b-b1;
    double c = a*b2;
    long e = a*b1;
    long d = (long) c;
    System.out.println(e+d);
  }
}
