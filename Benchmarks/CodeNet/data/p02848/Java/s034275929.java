import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char SS =0;
    for (int i=0; i<S.length(); i++) {
      if(S.charAt(i) + N > 'Z') {
        SS += S.charAt(i) + N - 26;
      } else {
        SS += S.charAt(i) + N;
      }
      System.out.print(SS);
      SS =0;
    }
  }
}