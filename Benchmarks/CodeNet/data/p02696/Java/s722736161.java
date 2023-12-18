import java.util.*;
public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    double max = 0;

    for (long x = 0; x <= n; x++) {
      double temp = Math.floor(a * x / b) - a * Math.floor(x / b);
      if (max < temp) {
        max = temp;
      }
    }

    System.out.println((long)max);

    sc.close();

  }
}