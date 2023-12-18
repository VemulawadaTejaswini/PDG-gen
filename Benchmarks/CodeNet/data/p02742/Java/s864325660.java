import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    long ans = (h * w + 1) / 2;
    System.out.println(ans);
  }
}