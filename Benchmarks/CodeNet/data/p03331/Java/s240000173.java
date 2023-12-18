import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String N = sc.next();
    int ans = 0;
    for (int i = 0; i < N.length(); i++) {
      char n = N.charAt(i);
      ans += Integer.valueOf(String.valueOf(n));
    }
    System.out.println(ans);
  }
}