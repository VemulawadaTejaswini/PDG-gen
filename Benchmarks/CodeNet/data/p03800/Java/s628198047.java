import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  char[] S;
  int N;

  private void solve(Scanner in, PrintWriter out) {
    N = in.nextInt();
    S = in.next().toCharArray();
    int[] sheep = new int[N];
    for (int s0 = 0; s0 <= 1; s0++) {
      for (int s1 = 0; s1 <= 1; s1++) {
        Arrays.fill(sheep, -1);
        sheep[0] = s0;
        sheep[1] = s1;
        if (check(sheep)) {
          for (int i = 0; i < N; i++) {
            out.print(sheep[i] == 1 ? "S" : "W");
          }
          out.println();
          return;
        } else {
          continue;
        }
      }
    }
    out.println(-1);
  }

  boolean check(int[] sheep) {
    for (int i = 2; i < N; i++) {
      int x;
      int prev = sheep[i - 2];
      if (S[i - 1] == 'o') {
        if (sheep[i - 1] == 1) {
          x = prev;
        } else {
          x = prev ^ 1;
        }
      } else {
        if (sheep[i - 1] == 1) {
          x = prev ^ 1;
        } else {
          x = prev;
        }
      }

      if (S[i - 1] == 'o') {
        if (sheep[i - 1] == 1) {
          if (x != prev) {
            return false;
          }
        } else {
          if (x == prev) {
            return false;
          }
        }
      } else {
        if (sheep[i - 1] == 1) {
          if (x == prev) {
            return false;
          }
        } else {
          if (x != prev) {
            return false;
          }
        }
      }
      sheep[i] = x;
    }
    if (S[N - 1] == 'o') {
      if (sheep[N - 1] == 1) {
        if (sheep[0] != sheep[N - 2]) {
          return false;
        }
      } else {
        if (sheep[0] == sheep[N - 2]) {
          return false;
        }
      }
    } else {
      if (sheep[N - 1] == 1) {
        if (sheep[0] == sheep[N - 2]) {
          return false;
        }
      } else {
        if (sheep[0] != sheep[N - 2]) {
          return false;
        }
      }
    }

    if (S[0] == 'o') {
      if (sheep[0] == 1) {
        if (sheep[1] != sheep[N - 1]) {
          return false;
        }
      } else {
        if (sheep[1] == sheep[N - 1]) {
          return false;
        }
      }
    } else {
      if (sheep[0] == 1) {
        if (sheep[1] == sheep[N - 1]) {
          return false;
        }
      } else {
        if (sheep[1] != sheep[N - 1]) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(in, out);
    in.close();
    out.close();
  }
}
