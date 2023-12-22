import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    char[] s = sc.nextLine().toCharArray();
    char[] t = sc.nextLine().toCharArray();
    for (int cnt = 0; cnt < s.length; cnt++) {
      if (s[cnt] != t[cnt]) {
        ans++;
      }
    }
    System.out.println(ans);
    sc.close();
  }
}