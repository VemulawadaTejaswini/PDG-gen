import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    long h1 = (h + 1) / 2; 
    long h2 = h / 2;
    long w1 = (w + 1) / 2;
    long w2 = w / 2;
    long ans = h1 * w1 + h2 * w2;
    System.out.println(ans);
  }
}