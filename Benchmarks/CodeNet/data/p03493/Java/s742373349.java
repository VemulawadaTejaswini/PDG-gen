import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    int cnt = 0;
    if (S.charAt(0) == '1')
      cnt++;
    if (S.charAt(1) == '1')
      cnt++;
    if (S.charAt(2) == '1')
      cnt++;

    System.out.println(cnt);

  }
}
