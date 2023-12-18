
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int ans = str.lastIndexOf('Z') - str.indexOf('A') + 1;

    System.out.println(ans);
  }
}
