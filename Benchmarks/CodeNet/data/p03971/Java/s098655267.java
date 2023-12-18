import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    String S = sc.next();
    
    int pass = 0;
    int bRank = 0;
    for (int i = 0; i < N; i++) {
      char c = S.charAt(i);
      boolean ans = false;
      if (c == a && pass < A+B) {
        pass++;
        ans = true;
      } else if (c == b) {
        bRank++;
        if (pass < A+B && bRank <= B) {
          pass++;
          ans = true;
        }
      }
      System.out.println(ans ? "Yes" : "No");
    }
  }
}