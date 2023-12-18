import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      String S = sc.next();
      int answer = Integer.MAX_VALUE;
      for ( int i = 0; i < N; i++ ) {
        String left = i > 1 ? S.substring(0,i) : null;
        int countLeft = search(left, 'W');
        if ( countLeft > answer ) {
          continue;
        }
        String right = i < N-1 ? S.substring(i+1,N) : null;
        int countRight = search(right, 'E');
        int candidate = countLeft + countRight;
        if ( candidate < answer ) {
          answer = candidate;
        }
      }
      System.out.println(answer);
    }
  }
  
  private static int search(String s1, char c) {
    if ( s1 == null ) {
      return 0;
    }
    char[] ch = s1.toCharArray();
    int n = ch.length;
    if ( n == 0 ) {
      return 0;
    }
    int count = 0;
    for ( int i = 0; i < n; i++ ) {
      if ( ch[i] == c ) {
        count++;
      }
    }
    return count;
  }
}