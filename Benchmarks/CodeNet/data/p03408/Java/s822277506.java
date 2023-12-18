
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    HashMap<String, Integer> S = new HashMap<String, Integer>();

    scanner.nextLine();
    for (int i = 0; i < N; i++) {
      String w = scanner.nextLine();
      Integer c = S.get(w);
      if (c == null) {
        S.put(w, 1);
      } else {
        S.remove(w);
        S.put(w, c + 1);
      }
    }

    int M = scanner.nextInt();
    HashMap<String, Integer> T = new HashMap<String, Integer>();

    scanner.nextLine();
    for (int i = 0; i < M; i++) {
      String w = scanner.nextLine();
      Integer c = T.get(w);
      if (c == null) {
        T.put(w, 1);
      } else {
        T.remove(w);
        T.put(w, c + 1);
      }

    }
    int max = 0;
    for (Map.Entry<String, Integer> entry : S.entrySet()) {
      int plus = entry.getValue();
      Integer minus = T.get(entry.getKey());
      if ( minus != null) {
        plus -= minus;
      }
      if ( plus > max ) {
        max = plus;
      }
    }
    System.out.println(max);

  }

}
