import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    Arrays.sort(S);
    for (int i = 1; i < S.length; i++) {
      if (S[i] == S[i - 1]) {
        System.out.println("no");
        return;
      }
    }
    System.out.println("yes");
  }
}
