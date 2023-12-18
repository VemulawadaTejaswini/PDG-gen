import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    int M = 1_000_000_007;
    int B = 1_000_007;
    int left = 0;
    int right = N / 2 + 1;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (possible(s, mid, N, B, M)) left = mid;
      else right = mid;
    }
    System.out.println(left);
  }

  private static boolean possible(char[] s, int K, int N, int B, int M) {
    long bn = 1;
    for (int i = 0; i < K - 1; i++) {
      bn *= B;
      bn %= M;
    }

    HashMap<Long, Integer> occurrences = new HashMap<>();
    long hash = hash(s, K, B, M);
    occurrences.put(hash, 0);
    for (int i = 1; i <= N - K; i++) {
      hash -= s[i - 1] * bn % M;
      if (hash < 0) hash += M;
      hash *= B;
      hash %= M;
      hash += s[i + K - 1];
      if (hash >= M) hash -= M;
      if (occurrences.containsKey(hash)) {
        if (occurrences.get(hash) + K <= i) return true;
      }
      else occurrences.put(hash, i);
    }
    return false;
  }

  private static long hash(char[] s, int len, int B, int M) {
    if (s.length < len) throw new IllegalArgumentException("len must be equal to or more than s.length: len=" + len + ", s.length=" + s.length);
    long hash = 0;
    for (int i = 0; i < len; i++) {
      hash *= B;
      hash %= M;
      hash += s[i];
      if (hash >= M) hash -= M;
    }
    return hash;
  }
}
