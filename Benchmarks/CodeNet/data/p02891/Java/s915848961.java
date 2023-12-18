import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int K = sc.nextInt();
    
    if (S.length() == 1) {
      System.out.println(K/2);
      return;
    }
    
    long ans = 0;
    char prev = 'X';
    int seq = 1;
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if (prev == c) {
        seq++;
      } else {
        ans += seq/2;
        seq = 1;
      }
      if (i == S.length()-1) {
        ans += seq/2;
      }
      prev = c;
    }
    ans *= K;
    System.out.println(ans);
  }
}