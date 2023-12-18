import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long K = sc.nextLong();
    if(K == 0) {
      System.out.println(2);
      System.out.println(0 + " " + 0);
    } else if(K == 1) {
      System.out.println(2);
      System.out.println(0 + " " + 2);
    } else if(K == 2) {
      System.out.println(2);
      System.out.println(2 + " " + 2);
    } else {
      long d = 0;
      for(long i = 2; i < (long)Math.pow(10, 8); i++) {
        if(K % i == 0) {
          d = (long)i;
          break;
        }
      }
      System.out.println(d);
      long s = K / d;
      for(int i = 0; i < d; i++) {
        System.out.print(d - 1 + s);
        if(i < d - 1) System.out.print(" ");
      }
      System.out.println();
    }
  }
}