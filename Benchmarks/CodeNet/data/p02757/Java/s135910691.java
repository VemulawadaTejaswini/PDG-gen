import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int P = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    int[] remainders = new int[N];
    int r = 0;
    int k = 1;
    for (int i = 0; i < N; i++) {
      r = ((S[N - i - 1] - '0') * k + r) % P;
      remainders[i] = r;
      k *= 10;
      k %= P;
    }
    long res = 0;
    if (P == 2 || P == 5) {
      for (int i = 0; i < N; i++) if ((S[i] - '0') % P == 0) res += i + 1;
    } else {
      Map<Integer, Integer> freq = new HashMap<>();
      freq.put(0, 1);
      for (int i = 0; i < N; i++) {
        int ri = remainders[i];
        int f = freq.getOrDefault(ri, 0);
        res += f;
        freq.put(ri, f + 1);
      }
    }
    System.out.println(res);
  }
}
