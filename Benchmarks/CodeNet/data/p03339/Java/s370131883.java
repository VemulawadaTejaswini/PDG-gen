import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int reader = 0;
    for (int i = 0; i < N - 1; i++) {
      if (S.charAt(i) == 'W' && S.charAt(i + 1) == 'E') reader++;
      if (S.charAt(i) == 'E' && S.charAt(i + 1) == 'W') reader++;
      if (S.charAt(i) == 'E' && S.charAt(i + 1) == 'E') reader++;
      if (S.charAt(i) == 'W' && S.charAt(i + 1) == 'W') {
        int benefit = -1, idx = reader + 1;
        while (benefit < 0 && idx < N - 1) {
          if (S.charAt(idx) == 'E' && S.charAt(idx + 1) == 'E') benefit++;
          if (S.charAt(idx) == 'W' && S.charAt(idx + 1) == 'W') benefit--;
          idx++;
        }
        if (benefit == 0) {
          reader = idx;
          i = idx - 1;
        } else {
          break;
        }
      }
    }

    int ans = 0;
    for (int i = 0; i < N; i++) {
      if (i == reader) continue;
      if (i < reader && S.charAt(i) == 'W') ans++;
      if (i > reader && S.charAt(i) == 'E') ans++;
    }
    System.out.println(ans);
  }
}