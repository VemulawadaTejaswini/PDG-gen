import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int times = n / (a + b);
    int rest = n % (a + b);
    System.out.println(a * times + Math.min(rest, a));
  }
}