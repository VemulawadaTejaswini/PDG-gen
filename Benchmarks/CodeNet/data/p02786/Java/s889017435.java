import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    sc.close();

    long cnt = 0;
    long h = H;
    while (h != 1) {
      h /= 2;
      cnt++;
    }
    long ans = 1;
    for (int i = 1; i <= cnt; i++) {
      ans += (long) Math.pow(2, i);
    }
    System.out.println(ans);
  }
}