import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = in.nextInt();
    System.out.println(n % 500 <= a ? "Yes" : "No");
  }
}
