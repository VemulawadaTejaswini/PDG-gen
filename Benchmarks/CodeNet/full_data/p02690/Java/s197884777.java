import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long a = 0;
    long b = 0;
    for(long i = -200; i <= 200; i++) {
      for(long j = -200; j <= 200; j++) {
        long t = ((((i * i) * i) * i) * i);
        long u = ((((j * j) * j) * j) * j);
        if((t - u) == x) {
          a = i;
          b = j;
        }
      }
    }
    System.out.println(a + " " + b);
  }
}