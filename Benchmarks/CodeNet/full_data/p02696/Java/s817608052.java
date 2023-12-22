import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long b = sc.nextLong();
    long n = sc.nextLong();
    long x = Math.min(b - 1, n);
    long res = (a*x)/b - a*(x/b);
    System.out.println(res);
    sc.close();
  }
}