import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int N = S.length();

    int K = 0;
    String prev = "";
    boolean cont = false;
    int head = 0;
    for (int i = 0; i < N-1; i++) {
      String cur = S.substring(head, i+1);
      if (!prev.equals(cur)) {
        K++;
        head = i + 1;
        prev = cur;
      }
    }
    if (!prev.equals(S.substring(N-1, N))) {
      K++;
    }
    System.out.println(K);
  }
}