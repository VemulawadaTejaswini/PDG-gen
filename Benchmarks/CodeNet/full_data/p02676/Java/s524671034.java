import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    String S = sc.next();
    if (S.length() <= K) {
        System.out.println(S);
    } else {
        System.out.println(S.substring(K) + "...");
    }
  }
}