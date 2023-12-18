import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    // 入力
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Z = sc.nextInt();
    String ans = "Yes";
    int[] A = new int[N];
    A[0] = Z;
    for (int i = 1; i < N; i++) {
      int Y = sc.nextInt();
      A[i] = Y;
      if (!(A[i] - 1 >= A[i - 1])) {
        ans = "No";
        break;
      }
    }
    System.out.println(ans);
  }
}
