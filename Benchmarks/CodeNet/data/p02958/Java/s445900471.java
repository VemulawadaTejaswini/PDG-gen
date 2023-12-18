import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N;
    int[] p;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      p = new int[N];
      for(int k = 0; k < N; k++) {
        p[k] = sc.nextInt();
      }
    }
    if ( isOk(p) ) {
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
  }
  
  private static boolean isOk(int[] p) {
    int n = p.length;
    if ( isAscending(p) ) {
      return true;
    }
    else {
      for(int i = 0; i < n - 1; i++) {
        int pi = p[i];
        for (int j = i+1; j < n; j++) {
          int pj = p[j];
          int[] p_result = new int[n];
          for(int k = 0; k < n; k++) {
            if ( k == i ) {
              p_result[k] = pj;
            }
            else if ( k == j ) {
              p_result[k] = pi;
            }
            else {
              p_result[k] = p[k];
            }
          }
          if ( isAscending(p_result) ) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private static boolean isAscending(int[] p) {
    int n = p.length;
    if ( n < 2 ) {
      return true;
    }
    for(int i = 0; i < n - 1; i++ ) {
      int pi = p[i];
      for(int j = i+1; j < n; j++ ) {
        int pj = p[j];
        if ( pi > pj ) {
          return false;
        }
      }
    }
    return true;
  }
}