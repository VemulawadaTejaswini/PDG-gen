import java.util.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = Long.parseLong(sc.next());
    
    int max = 1;
    for (int i = 2; i < (int)Math.sqrt((double)n); i++) {
      if (n % i ==0) {
        max = i;
      }
    }

    System.out.println(max - 1 + n / (long)max - 1);
  }
}