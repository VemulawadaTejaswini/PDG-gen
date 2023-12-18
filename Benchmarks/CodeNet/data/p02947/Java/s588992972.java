import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long ans = 0;
    String[] S = new String[N];
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      S[i] = sc.next();
      char[] s = S[i].toCharArray();
      Arrays.sort(s);
      S[i] = new String(s);
      int cnt = map.getOrDefault(S[i], 0);
      map.put(S[i], cnt + 1);
    }
//    for (int i = 0; i < N; i++) {
//      for (int j = i + 1; j < N; j++) {
//        if (S[i].equals(S[j])) {
//          ans++;
//        }
//      }
//    }
    for (Integer n : map.values()) {
      ans += n * (n-1) / 2;
    }
    System.out.println(ans);
  }
}

// nC2 = n * (n-1) / 2