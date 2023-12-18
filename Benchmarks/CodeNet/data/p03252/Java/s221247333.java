import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      String T = in.next();
      
      
      if (canTransform(S, T) && canTransform(T, S)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
  
  private static boolean canTransform (String S, String T) {
    char[] mapping = new char[26];
    Arrays.fill(mapping, ' ');

    boolean canTransform = true;
    for (int i = 0 ; i < T.length(); ++i) {
      if (mapping[T.charAt(i) - 'a'] == ' ') {
        mapping[T.charAt(i) - 'a'] = S.charAt(i);
      } else {
        if (mapping[T.charAt(i) - 'a'] != S.charAt(i)) {
          return false;
        }
      }
    }
    
     return true;
  }
}