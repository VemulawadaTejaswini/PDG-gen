import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt()-1;
    int B = sc.nextInt()-1;
    int C = sc.nextInt()-1;
    int D = sc.nextInt()-1;
    String S = sc.next();
    boolean twoRock = false;
    for (int i = 1; i < N; i++) {
      if (A < i
          && S.charAt(i-1) == '#'
          && S.charAt(i) == '#') {
        twoRock = true;
      }
    }
    boolean overtake = false;
    for (int i = 1; i < N-1; i++) {
      if (B <= i
          && S.charAt(i-1) == '.'
          && S.charAt(i) == '.'
          && S.charAt(i+1) == '.') {
        overtake = true;
      }
    }
    if (twoRock) {
      System.out.println("No");
    } else if (C < D) {
      System.out.println("Yes");
    } else {
      System.out.println(overtake ? "Yes" : "No");
    }
  }
}