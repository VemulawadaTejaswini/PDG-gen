import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int ans = 0;
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    char[] t = sc.next().toCharArray();
    for (int cnt = 0; cnt < s.length; cnt++) {
      if (s[cnt] != t[cnt]) {
        ans++;
      }
    }
    System.out.println(ans + "");
    sc.close();
  }
}
