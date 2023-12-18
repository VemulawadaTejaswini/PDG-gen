import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long ans = 0;
    String[] S = new String[N];
    for (int i = 0; i < N; i++) {
      S[i] = sc.next();
      char[] s = S[i].toCharArray();
      Arrays.sort(s);
      S[i] = new String(s);
    }
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (S[i].equals(S[j])) {
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}