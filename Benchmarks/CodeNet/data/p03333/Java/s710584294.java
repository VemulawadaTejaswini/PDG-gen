import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int Lorigin[] = new int[N];
    int Rorigin[] = new int[N];
    ArrayList<coordinate> L = new ArrayList<coordinate>();
    ArrayList<coordinate> R = new ArrayList<coordinate>();
    for (int i = 0; i < N; i++) {
      Lorigin[i] = Integer.parseInt(sc.next());
      Rorigin[i] = Integer.parseInt(sc.next());
      L.add(new coordinate(i, Lorigin[i]));
      R.add(new coordinate(i, Rorigin[i]));
    }
    L.sort((a, b) -> b.point - a.point);
    R.sort((a, b) -> a.point - b.point);

    boolean indexFlag[] = new boolean[N];
    long ans = 0;
    int count = 0;
    int left = 0, right = 0;
    int takahashi = 0;
    int id = 0;
    while (true) {
      //      while (left < N) {
      //        if (!indexFlag[L.get(left).id]) {
      //          break;
      //        } else {
      //          left++;
      //        }
      //      }
      id = L.get(left).id;
      indexFlag[id] = true;
      if (takahashi < Lorigin[id]) {
        ans += Lorigin[id] - takahashi;
        takahashi = Lorigin[id];
      } else if (takahashi > Rorigin[id]) {
        ans += takahashi - Rorigin[id];
        takahashi = Rorigin[id];
      }
      left++;
      count++;
      if (count == N) {
        ans += Math.abs(takahashi);
        break;
      }
      //      while (right < N) {
      //        if (!indexFlag[R.get(right).id]) {
      //          break;
      //        } else {
      //          right++;
      //        }
      //      }
      id = R.get(right).id;
      indexFlag[id] = true;
      if (takahashi > Rorigin[id]) {
        ans += takahashi - Rorigin[id];
        takahashi = Rorigin[id];
      } else if (takahashi < Lorigin[id]) {
        ans += Lorigin[id] - takahashi;
        takahashi = Lorigin[id];
      }
      right++;
      count++;
      if (count == N) {
        ans += Math.abs(takahashi);
        break;
      }
    }
    System.out.println(ans);
  }

  static class coordinate {
    public int id;
    public int point;

    public coordinate(int i, int x) {
      id = i;
      point = x;
    }

    public String toString() {
      return String.valueOf(id);
    }
  }
}