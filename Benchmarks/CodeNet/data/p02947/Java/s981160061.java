import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  private static void solve(int n, String[] a) {
    Map<String, Integer> fingerprints = new HashMap<>();
    long counter = 0;
    for (String val: a) {
      int[] count = new int[26];
      for (int i = 0; i < 10; i++) {
        count[val.codePointAt(i) - 97]++;
      }
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 26; i++) {
        sb.append(count[i]);
      }
      String fingerprint = sb.toString();
      if (fingerprints.containsKey(fingerprint)) {
        counter += fingerprints.get(fingerprint);
      }
      fingerprints.merge(fingerprint, 1, Integer::sum);
    }
    System.out.println(counter);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] a = new String[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLine();
    }
    sc.close();
    solve(n, a);
  }
}