import java.util.*;
import java.io.*;


public class Main {
  private static String checkP(String s, int start, int end) {
    int sum = start + end, limit = (sum % 2 == 0) ? (sum / 2) : ((sum / 2) - 1);
    for(int i = start, j = end; i <= limit; i++, --j) {
      if(s.charAt(i) != s.charAt(j)) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int N = s.length();
    boolean flag = checkP(s, 0, ((N - 1)/2) - 1) && checkP(s, ((N + 3)/2) - 1, N - 1);
    System.out.println(flag ? "Yes" : "No");
  }
}