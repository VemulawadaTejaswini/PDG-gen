import java.util.*;

public class Main{
  public static void main{
    Scanner sc = new Scanner(System.in);
    double N = sc.nextDouble();
    
    System.out.println(N % 2 == 0 ? (N/2)/N:((N+1)/2)/N);
  }
}