import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    String string = sc.next();
    // char[] array = string.toCharArray();
    int sum = 0;

    for ( int i = 1; i <= length; i++ ) {
      for ( int j = i + 1; j <= length; j++ ) {
        if ( decision(string, i, j) == 0 ) continue;
        for ( int k = j + 1; k <= length; k++ ) {
          if ( (j - i) == (k - j) ) continue;
          sum += decision(string, i, j, k);
        }
      }
    }
    System.out.println(sum);
  }
  private static int decision(String string, int i, int j) {
    if ( string.charAt(i-1) == string.charAt(j-1) ) return 0;
    return 1;
  }
  private static int decision(String string, int i, int j, int k) {
    if ( string.charAt(i-1) == string.charAt(j-1) ) return 0;
    if ( string.charAt(i-1) == string.charAt(k-1) ) return 0;
    if ( string.charAt(j-1) == string.charAt(k-1) ) return 0;
    return 1;
  }
}
