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

    boolean indexFlag[] = new boolean[N];
    long ans = 0;
    int count = 0;
    int left = 0, right = 0;
    int takahashi = 0;
    int id = 0;

    L.sort((a, b) -> b.point - a.point);
    R.sort((a, b) -> a.point - b.point);
    for (int i = 0; i < N; i++) {
      indexFlag[i] = false;
    }
    ans = 0;
    count = 0;
    left = 0;
    right = 0;
    takahashi = 0;
    id = 0;
    while (true) {
      while (left < N) {
        if (!indexFlag[L.get(left).id]) {
          break;
        } else {
          left++;
        }
      }
      id = L.get(left).id;
      indexFlag[id] = true;
      left++;
      if (takahashi < Lorigin[id]) {
        ans += Lorigin[id] - takahashi;
        takahashi = Lorigin[id];
      } else if (takahashi > Rorigin[id]) {
        ans += takahashi - Rorigin[id];
        takahashi = Rorigin[id];
      }
      count++;
      if (count == N) {
        ans += Math.abs(takahashi);
        break;
      }
      while (right < N) {
        if (!indexFlag[R.get(right).id]) {
          break;
        } else {
          right++;
        }
      }
      id = R.get(right).id;
      indexFlag[id] = true;
      right++;
      if (takahashi > Rorigin[id]) {
        ans += takahashi - Rorigin[id];
        takahashi = Rorigin[id];
      } else if (takahashi < Lorigin[id]) {
        ans += Lorigin[id] - takahashi;
        takahashi = Lorigin[id];
      }
      count++;
      if (count == N) {
        ans += Math.abs(takahashi);
        break;
      }
    }
    long temp = ans;

    L.sort((a, b) -> a.point - b.point);
    R.sort((a, b) -> b.point - a.point);
    for (int i = 0; i < N; i++) {
      indexFlag[i] = false;
    }
    ans = 0;
    count = 0;
    left = 0;
    right = 0;
    takahashi = 0;
    id = 0;
    while (true) {
      while (right < N) {
        if (!indexFlag[R.get(right).id]) {
          break;
        } else {
          right++;
        }
      }
      id = R.get(right).id;
      indexFlag[id] = true;
      right++;
      if (takahashi > Rorigin[id]) {
        ans += takahashi - Rorigin[id];
        takahashi = Rorigin[id];
      } else if (takahashi < Lorigin[id]) {
        ans += Lorigin[id] - takahashi;
        takahashi = Lorigin[id];
      }
      count++;
      if (count == N) {
        ans += Math.abs(takahashi);
        break;
      }
      while (left < N) {
        if (!indexFlag[L.get(left).id]) {
          break;
        } else {
          left++;
        }
      }
      id = L.get(left).id;
      indexFlag[id] = true;
      left++;
      if (takahashi < Lorigin[id]) {
        ans += Lorigin[id] - takahashi;
        takahashi = Lorigin[id];
      } else if (takahashi > Rorigin[id]) {
        ans += takahashi - Rorigin[id];
        takahashi = Rorigin[id];
      }
      count++;
      if (count == N) {
        ans += Math.abs(takahashi);
        break;
      }
    }
    ans = Math.max(ans, temp);
    System.out.println(ans);
  }

  static class coordinate {
    public int id;
    public int point;

    public coordinate(int i, int x) {
      id = i;
      point = x;
    }
  }
}