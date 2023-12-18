import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int K = sc.nextInt();
    char headChar = S.charAt(0);
    char tailChar = S.charAt(S.length()-1);
    char seqChar = headChar;
    char seqLen = 1;
    long ans = 0;
    for (int i = 1; i < S.length(); i++) {
      if (seqChar == S.charAt(i)) {
        seqLen++;
      } else {
        ans += seqLen/2;
        seqLen = 1;
        seqChar = S.charAt(i);
      }
      if (i == S.length()-1) {
        ans += seqLen/2;
      }
    }

    ans *= K;

    if (headChar == tailChar) {
      int headLen = 0;
      for (int i = 0; i < S.length(); i++) {
        if (headChar == S.charAt(i)) {
          headLen++;
        } else {
          break;
        }
      }
      int tailLen = 0;
      for (int i = S.length()-1; i >= 0; i--) {
        if (tailChar == S.charAt(i)) {
          tailLen++;
        } else {
          break;
        }
      }
      if (headLen%2 == 1 && tailLen%2 ==1) {
        if (headLen == tailLen) {
          ans += K/2;
        } else {
          ans += K-1;
        }
      }
    }
    System.out.println(ans);
  }
}