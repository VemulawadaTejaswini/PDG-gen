import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    if(a + b < c && 2 * a * b + 2 * c * a + 2 * c * b < c * c + b * b + a * a) System.out.println("Yes");
    else System.out.println("No");
  }
}
