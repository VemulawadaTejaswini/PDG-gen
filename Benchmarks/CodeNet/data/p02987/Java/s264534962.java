import java.util.*;
import java.util.stream.*;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] S = in.nextLine().toCharArray();
    Arrays.sort(S);
    if (S[0] == S[1] && S[1] != S[2] && S[2] == S[3]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
