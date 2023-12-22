import java.util.*;
 
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    double B = sc.nextDouble();
    double ans = (double)(A*B);
    System.out.println(String.format("%.0f",Math.floor(ans)));
  }
} 