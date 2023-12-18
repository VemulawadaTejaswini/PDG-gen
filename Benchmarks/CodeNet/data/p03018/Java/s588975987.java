import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    int res = 0;
    int count = 0;
    for (int i = S.length - 1; i >= 0; i--) {
      if (i > 0 && S[i] == 'C' && S[i - 1] == 'B') {
        count++;
        i--;
      } else if (S[i] == 'A') {
        res += count;
      } else {
        count = 0;
      }
    }
    System.out.println(res);
  }
}
