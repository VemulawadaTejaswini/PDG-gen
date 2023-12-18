import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int K = scanner.nextInt();
    for (int i = 0; i < s.length; i++) {
      if (s[i] == 'a') continue;
      int r = 'z' - s[i] + 1;
      if (K >= r) {
        s[i] = 'a';
        K -= r;
      }
    }
    s[s.length - 1] = (char) (s[s.length - 1] + K % 26);
    System.out.println(new String(s));
  }
}
