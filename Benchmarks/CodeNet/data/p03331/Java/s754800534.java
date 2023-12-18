import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if ((n % 10) == 0) {
      System.out.println(10);
    } else {
      String s = Integer.toString(n);
      int ans = 0;
      for (int i = 0; i < s.length(); i++) {
        ans += Character.getNumericValue(s.charAt(i));
      }
      System.out.println(ans);
    }

  }
}