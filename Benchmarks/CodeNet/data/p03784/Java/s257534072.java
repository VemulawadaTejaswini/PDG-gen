import java.util.Random;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static Random rnd = new Random(42);
  static int qc = 0;
  static int A, B, N;

  public static void main(String[] args) {
    A = sc.nextInt();
    B = sc.nextInt();
    N = A + B;
    if (A <= B) {
      System.out.println("Impossible");
      return;
    }
    int start = 0;
    int restA = A;
    int honest = -1;
    OUT:while (true){
      if (start == N - 1) {
        honest = start;
        break;
      }
      int cur = start;
      int next = cur + 1;
      int count = 1;
      while (true){
        boolean res = query(cur, next);
        if (res){
          ++count;
          if (count == restA) {
            honest = next;
            break OUT;
          } else {
            cur = next;
            next = cur + 1;
          }
        } else {
          if (next - start + 1 >= count * 2) {
            start = next + 1;
            break;
          }
          next++;
        }
      }
    }
    System.out.print("! ");
    for (int i = 0; i < N; i++) {
      System.out.print(query(honest, i) ? "1" : "0");
    }
    System.out.println();
  }

  static void solve(int s, int n) {
    int[] prop = new int[N];
    prop[n] = 1;
    int cur = n;
    for (int i = 0; i < A - 1; i++) {
      for (int j = 0; j < N; j++) {
        if (j == s) continue;
        if (prop[j] != 0) continue;
        if (query(cur, j)) {
          prop[j] = 1;
          cur = j;
          break;
        } else {
          prop[j] = -1;
        }
      }
    }
  }

  static boolean query(int a, int b) {
    ++qc;
    System.out.println("? " + a + " " + b);
    String ret = sc.next();
    return ret.charAt(0) == 'Y';
  }

}
