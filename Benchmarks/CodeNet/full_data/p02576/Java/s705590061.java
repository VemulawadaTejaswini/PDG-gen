import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    
    int count = 0;
    if (n >= x) {
      count = n / x;
      n = n % x;
    }
    
    if (n > 0)
      count++;
    
    System.out.println(count*t);
  }
}