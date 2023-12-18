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
    char tailSeqChar = 'Z';
    int tailSeqLen = -1;
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
        tailSeqChar = c;
        tailSeqLen = seq;;
        ans += seq/2;
      }
      prev = c;
    }
    if (tailSeqChar != 'Z' && tailSeqLen%2 == 1 && S.charAt(0) == tailSeqChar) {
      ans = ans + (K-1)*(ans+1);
    } else {
      ans *= K;
    }
    System.out.println(ans);
  }
}