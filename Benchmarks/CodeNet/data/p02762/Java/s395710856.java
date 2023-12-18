import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  static List<Connect> friend = new ArrayList<>();
  static List<Connect> block = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();

    for (int i = 0; i < M; i++) {
      friend.add(new Connect(sc.nextInt(), sc.nextInt()));
    }
    for (int i = 0; i < K; i++) {
      block.add(new Connect(sc.nextInt(), sc.nextInt()));
    }

    int[] count = new int[N];

    for (int i = 1; i <= N; i++) {
      for (int j = i + 1; j <= N; j++) {
        if (friend.contains(new Connect(i, j))) continue;
        if (block.contains(new Connect(i, j))) continue;
        if (check(i, j, new ArrayList<>())) {
          count[i-1]++;
          count[j-1]++;
        }
      }
    }

    String op = "";
    for (int i : count) {
      op += (i + " ");
    }

    System.out.println(op.substring(0, op.length()-1));

    sc.close();
  }

  private static boolean check(int i, int j, List<Integer> sumi) {
    if (friend.contains(new Connect(i, j))) return true;

    boolean result = false;
    for (Connect c : friend) {
      if (c.A == i) {
        if (sumi.contains(c.B)) continue;
        List<Integer> next = new ArrayList<>(sumi);
        next.add(i);
        if (check(c.B, j, next)) {
          result = true;
          break;
        }
      }
      if (c.B == i) {
        if (sumi.contains(c.A)) continue;
        List<Integer> next = new ArrayList<>(sumi);
        next.add(i);
        if (check(c.A, j, next)) {
          result = true;
          break;
        }
      }
    }

    return result;
  }
}


class Connect {
  public int A;
  public int B;

  public Connect(int a, int b) {
    A = a;
    B = b;
  }

  @Override
  public boolean equals(Object x) {
    if (!(x instanceof Connect)) return false;
    Connect c = (Connect)x;

    if (this.A == c.A && this.B == c.B) {
      return true;
    }

    if (this.B == c.A && this.A == c.B) {
      return true;
    }

    return false;
  }
}