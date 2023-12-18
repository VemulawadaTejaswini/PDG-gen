import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    long d = sc.nextLong();
    if (d == 0) {
      System.out.println(Math.pow(n, (-2)) * (m - 1) * (n - d));
    } else {
      System.out.println(Math.pow(n, (-2)) * (m - 1) * (n - d) * 2);
    }
    
   
    
  }
}