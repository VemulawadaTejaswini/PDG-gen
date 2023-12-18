import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    int max = 0;
    for (int i = 0; i < S.length; i++) for (int j = i + 1; j <= S.length; j++) if (isACGT(S, i, j)) max = Math.max(max, j - i);
    System.out.println(max);
  }

  private static boolean isACGT(char[] S, int left, int right) {
    for (int i = left; i < right; i++) {
      char ch = S[i];
      switch (ch) {
        case 'A':
        case 'C':
        case 'G':
        case 'T':
          continue;
        default:
          return false;
      }
    }
    return true;
  }
}
