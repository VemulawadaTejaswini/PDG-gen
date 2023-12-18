import java.util.*;

public class Main {
  public static void main(String[]$) {
    Scanner s=new Scanner(System.in);
    long a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
    System.out.println(a%2+b%2+c%2==3?Math.min(Math.min(a*b,b*c),c*a):0);
  }
}