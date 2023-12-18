import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long W = sc.nextLong();
    long A = H * W;
    if (H == 1 || W == 1) {
      System.out.println(1);
    } else {
      System.out.println((A + 1) / 2);
    }
  }
}
