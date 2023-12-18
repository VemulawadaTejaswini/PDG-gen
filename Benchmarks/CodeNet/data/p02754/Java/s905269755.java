import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();

    long sum = a+b;


    if (n > sum) {
      if (n%sum == 0) {
        System.out.println(n/sum*a);
      } else {
        if (n/sum*a+a >= n) {
          System.out.println(n/sum*a+n);
        } else {
          System.out.println(n/sum*a+a);
        }
      }
    } else {
      if (n <= a) {
        System.out.println(n);
      } else {
        System.out.println(a);
      }
    }


  }
}
