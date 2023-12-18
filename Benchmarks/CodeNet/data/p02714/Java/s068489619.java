import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    sc.close();

    Map<Character, Integer> cnt = new HashMap<>();
    long ans = 0;
    for (int i = 0; i < N; i++) {
      cnt.clear();
      cnt.put('R', 0);
      cnt.put('G', 0);
      cnt.put('B', 0);

      char a = S.charAt(i);
      cnt.compute(a, (k, v) -> v + 1);

      int ng = 0;
      for (int j = i + 1; j < N; j++) {
        char b = S.charAt(j);
        if (a == b) continue;

        if (j + (j - i) < N) {
          char c = S.charAt(j + (j - i));
          if (a != b && b != c && a != c) ng++;;
        }
        cnt.compute(b, (k, v) -> v + 1);
      }

      long sum = 1;
      for (Character c : cnt.keySet()) sum *= cnt.get(c);

      ans += sum;
      ans -= ng;
    }
    System.out.println(ans);
  }
}