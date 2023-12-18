import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    int[] res = new int[S.length];
    for (int i = 0; i < S.length;) {
      int rs = 0;
      while (S[i] == 'R') {
        i++;
        rs++;
      }
      int p = i - 1;
      int ls = 0;
      while (i < S.length && S[i] == 'L') {
        i++;
        ls++;
      }
      res[p] += (rs - rs / 2) + ls / 2;
      res[p + 1] = rs / 2 + (ls - ls / 2);
    }
    StringBuilder sb = new StringBuilder();
    for (int r : res) sb.append(r).append(' ');
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }
}
