import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int A = sc.nextInt();
    sc.close();

    long ans = (H + A - 1) / A;
    System.out.println(ans);
  }
}