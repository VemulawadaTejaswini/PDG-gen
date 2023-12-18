import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(s[i]).append(t[i]);
    }
    System.out.println(sb.toString());
  }
}
