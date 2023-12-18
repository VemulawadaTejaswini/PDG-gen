import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] S = sc.next().split("");
    long total = 0;
    for (int i = 0; i < Math.pow(2,S.length-1); i++) {
      StringBuilder s = new StringBuilder();
      for (int j = 0; j < S.length; j++) {
        s.append(S[j]);
        if ((1 & i>>j) == 1) {
          total += Long.parseLong(s.toString());
          s.setLength(0);
        }
      }
      if (s.length() != 0) {
        total += Long.parseLong(s.toString());
      }
    }
    System.out.println(total);
  }
}