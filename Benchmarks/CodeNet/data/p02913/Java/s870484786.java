import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int max = 0;
    int[] z = new int[S.length()];

    List<Character> arrayList = new ArrayList<>(N);
    for (int i = 0; i < N; i++) {
      arrayList.add(S.charAt(i));
    }
    for (int i = 0; i < N; i++) {
      max = Math.max(max(arrayList.subList(i, N), z), max);
    }
    System.out.println(max);
  }

  private static int max(List<Character> S, int[] z) {
    int l = 0;
    int r = 0;
    for (int k = 1; k < S.size(); k++) {
      int j = 0;
      if (k < r) {
        if (z[k - l] < r - k) {
          z[k] = z[k - l];
          continue;
        } else {
          // We know k...r
          j = r - k;
        }
      }
      while (k + j < S.size() && S.get(j) == S.get(k + j)) {
        j++;
      }
      if (r - l <= j) {
        l = k;
        r = k + j;
      }
      z[k] = j;
    }
    int ans = 0;
    for (int i = 0; i < z.length; i++) {
      ans = Math.max(ans, Math.min(i, z[i]));
    }
    return ans;
  }
}
