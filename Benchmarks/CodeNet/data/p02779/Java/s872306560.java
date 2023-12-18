import java.util.*;
import static java.lang.System.*;
import java.math.*;
 
public class Main{
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    final int[] A = new int[N];
    int cnt = 1;
    String anss = "YES";
    int cntt = 0;
    for (int i = 0; i < N;i++){
      A[i]=sc.nextInt();
    }
    outside: for (int i = 0; i < N; i++) {
      while (true) {
        if (A[cntt] == A[cnt]) {
          anss = "NO";
          break outside;
        }
        cnt++;
        if (cnt == N) {
          break;
        }
      }
      cnt = i + 1;
      cntt = i;
    }
    out.print(anss);
  }
  }

