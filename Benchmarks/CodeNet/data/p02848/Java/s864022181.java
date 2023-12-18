import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char[] ans = S.toCharArray();
    for (int i = 0; i < ans.length; i++) {
      ans[i] = (char) ((((ans[i] - 'A') + N) % 26) + 'A');
    }
    System.out.println(new String(ans));
  }
}
