import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int max = 0;
    for (int i = 0; i < S.length(); i++) {
      max = Math.max(max(S.substring(i)), max);
    }
    System.out.println(max);
  }

  private static int max(String S) {
    int ans = 0;
    int[] z = new int[S.length()];
    for (int i = 1; i < S.length(); i++) {
      int j = 0;
      while (i + j < S.length() && S.charAt(j) == S.charAt(i + j)) {
        if (i > j) {
          ans = Math.max(ans, j + 1);
        }
        j++;
      }
      z[i] = j;
      for (int h = 1; h < j; h++) {
        z[i + h] = z[h];
      }
      i += j;
    }
    return ans;
  }
}
