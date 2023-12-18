import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();
    boolean ans = K * 500 >= X;
    System.out.print(ans ? "Yes":"No");
  }
}
    