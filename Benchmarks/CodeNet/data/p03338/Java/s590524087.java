import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int max = -1;
    for (int i = 0; i <= n - 2; i++) {
      int[] x = new int[26];
      int[] y = new int[26];
      for (int j = 0; j <= i; j++) {
        x[s.charAt(j) - 'a']++;
      }
      for (int j = i + 1; j <= n - 1; j++) {
        y[s.charAt(j) - 'a']++;
      }
      int count = 0;
      for (int j = 0; j < 26; j++) {
        if (x[j] > 0 && y[j] > 0) {
          count++;
        }
      }
      if (max < count) {
        max = count;
      }
    }
    System.out.println(max);
  }
}