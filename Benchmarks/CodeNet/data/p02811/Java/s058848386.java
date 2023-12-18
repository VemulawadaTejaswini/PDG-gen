import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    String ans = "No";
    if((500 * k) >= x) ans = "Yes";
    System.out.println(ans);
  }
}