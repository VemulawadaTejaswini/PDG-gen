import java.util.*;

public class Main {
  public static void main(String[] argv){
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();

    if (n < 2){
      System.out.println(1);
      return;
    }

    long ans = 0;
    for (int i = 0; i <= 30; i++) {
      long num = (long)Math.floor(n / 10 / Math.pow(5, i));
      ans += num;
    }

    System.out.println(ans);
    return;
  }
}