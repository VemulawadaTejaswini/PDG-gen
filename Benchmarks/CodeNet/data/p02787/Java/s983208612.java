import java.math.*;
import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    sc.close();

    int ans = Integer.MAX_VALUE;
    int[] prev = new int[H];
    int[] next = new int[H];
    prev[0] = 1;

    boolean end = false;
    while (!end) {
      end = true;
      Arrays.fill(next, 0);
      for (int i = 0; i < H; i++) {
        if (prev[i] == 0) continue;
        for (int j = 0; j < N; j++) {
          int h = i + A[j];
          int c = prev[i] + B[j];
          if (h < H) {
            if (next[h] == 0 || c < next[h]) {
              next[h] = c;
              end = false;
            }
          } else {
            ans = Math.min(ans, c);
          }
        }
      }
      int[] temp = next;
      next = prev;
      prev = temp;
    }
    System.out.println(ans - 1);
  }
}