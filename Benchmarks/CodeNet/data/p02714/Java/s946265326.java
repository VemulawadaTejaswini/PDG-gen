import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    String string = sc.next();
    int sum = 0;

    for ( int i = 1; i <= length; i++ ) {
      for ( int j = 2; j <= length; j++ ) {
        if ( i >= j ) continue;
        for ( int k = 3; k <= length; k++ ) {
          if ( j >= k ) continue;
          if ( (j - i) == (k - j) ) continue;
          sum += decision(string, i, j, k);
        }
      }
    }
    System.out.println(sum);
  }
  private static int decision(String string, int i, int j, int k) {
    var s1 = string.charAt(i - 1);
    var s2 = string.charAt(j - 1);
    var s3 = string.charAt(k - 1);
    if ( s1 == s2 ) return 0;
    if ( s1 == s3 ) return 0;
    if ( s2 == s3 ) return 0;
    return 1;
  }
}
