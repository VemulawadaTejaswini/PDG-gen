import java.util.*;
 
public class Main {
  public static void main(String...args) {
    final Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    final int H = sc.nextInt();
    final int W = sc.nextInt();
    System.out.println((N - H + 1) * (N - W + 1));
  }
}