import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    int max = 0;
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (S[i] == 'I') cnt++;
      else cnt--;
      max = Math.max(max, cnt);
    }
    System.out.println(max);
  }
}
