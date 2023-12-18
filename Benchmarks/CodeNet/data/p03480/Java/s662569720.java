import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();

    int min = s.length;
    for (int i = 0; i < s.length; i++) {
      if (s[i] == '1') {
        int l = s.length - i - 1;
        int r = i;
        int m = l == r ? l + 1 : Math.max(l, r);
        if (m < min) min = m;
      }
    }
    System.out.println(min);
  }
}
