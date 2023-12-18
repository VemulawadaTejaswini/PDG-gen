import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    int W = sc.nextInt();
    sc.close();

    boolean ans = S <= W;

    System.out.println(ans ? "unsafe" : "safe");
  }
}
