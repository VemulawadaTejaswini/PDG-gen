import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String[] D = new String[K];
    int answer = -1;
    for (int i = 0; i < K; i++) {
      D[i] = sc.next();
    }
    for (int i = 1; i <= Integer.MAX_VALUE; i++) {
      String i_string = Integer.toString(i);
      boolean skip = false;
      for (int j = 0; j < K; j++) {
        if (i_string.contains(D[j])) {
          skip = true;
        }
      }
      if (skip) {
        continue;
      }
      if (i >= N) {
        answer = i;
        break;
      }
    }
    System.out.println(answer);
  }
}