import java.util.*;

public class Main {
  private static int countReplace(char[] cs, int first) {
    int current = first;
    int count = 0;
    for (char c : cs) {
      if (c - '0' != current) {
        count++;
      }
      current = 1 - current;
    }
    return count;
  }
  
  private static int solve(char[] cs) {
    return Math.min(countReplace(cs, 0), countReplace(cs, 1));
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String input = s.next();
    char[] cs = input.toCharArray();
    
    System.out.println(solve(cs));
  }
}
