import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

class MyVectorLong {
  public long x;
  public long y;

  public MyVectorLong(long x, long y) {
    this.x = x;
    this.y = y;
  }

  public void add(long x, long y) {
    this.x += x;
    this.y += y;
  }

  public void add(MyVectorLong v) {
    add(v.x, v.y);
  }

  public static MyVectorLong add(MyVectorLong v1, MyVectorLong v2) {
    return new MyVectorLong(v1.x + v2.x, v1.y + v2.y);
  }

  public void sub(long x, long y) {
    this.x -= x;
    this.y -= y;
  }

  public void sub(MyVectorLong v) {
    sub(v.x, v.y);
  }

  public static MyVectorLong sub(MyVectorLong v1, MyVectorLong v2) {
    return new MyVectorLong(v1.x - v2.x, v1.y - v2.y);
  }

  public void scalarMul(long m) {
    x *= m;
    y *= m;
  }

  public void scalarMul(int m) {
    x *= m;
    y *= m;
  }

  public static MyVectorLong scalarMul(MyVectorLong v, long m) {
    return new MyVectorLong(v.x * m, v.y * m);
  }

  public static MyVectorLong scalarMul(MyVectorLong v, int m) {
    return new MyVectorLong(v.x * m, v.y * m);
  }

  public long vectorMul(MyVectorLong v) {
    return x * v.x + y * v.y;
  }

  public static long vectorMul(MyVectorLong v1, MyVectorLong v2) {
    return v1.vectorMul(v2);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyVectorLong MyVectorLong = (MyVectorLong) o;
    return Long.compare(MyVectorLong.x, x) == 0 && Long.compare(MyVectorLong.y, y) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    return "MyVectorLong{" + "x=" + x + ", y=" + y + '}';
  }
}

public class Main {

  static int h, w, ans, cw, ch, dw, dh;
  static char[][] s;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    h = Integer.parseInt(in[0]);
    w = Integer.parseInt(in[1]);
    in = br.readLine().split(" ");
    ch = Integer.parseInt(in[0]);
    cw = Integer.parseInt(in[1]);
    in = br.readLine().split(" ");
    dh = Integer.parseInt(in[0]);
    dw = Integer.parseInt(in[1]);
    ch--;
    cw--;
    dh--;
    dw--;

    s = new char[h][w];

    for (int i = 0; i < h; i++) {
      in = br.readLine().split(" ");
      s[i] = in[0].toCharArray();
    }

    int[][] islandNumList = new int[h][w];
    for (int i = 0; i < h; i++) {
      Arrays.fill(islandNumList[i], -1);
    }

    int islandNum = 0;

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    for (int i = 0; i < h; i++) {

      for (int j = 0; j < w; j++) {

        if (islandNumList[i][j] != -1 || s[i][j] == '#') {
          continue;
        }

        Deque<MyVectorLong> que = new ArrayDeque<>();
        que.add(new MyVectorLong(j, i));

        while (!que.isEmpty()) {
          int x = (int) que.peek().x;
          int y = (int) que.poll().y;
          islandNumList[y][x] = islandNum;

          for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx < 0
                || nx >= w
                || ny < 0
                || ny >= h
                || s[ny][nx] == '#'
                || islandNumList[ny][nx] != -1) {
              continue;
            }
            que.add(new MyVectorLong(nx, ny));
          }
        }

        islandNum++;
      }
    }

    List<HashSet<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < islandNum; i++) {
      graph.add(new HashSet<>());
    }

    for (int i = 0; i < h; i++) {

      for (int j = 0; j < w; j++) {

        if (s[i][j] == '#') continue;
        int nowIslandNum = islandNumList[i][j];

        for (int k = -2; k <= 2; k++) {

          int ni = i + k;
          if (ni < 0 || ni >= h) continue;
          for (int l = -2; l <= 2; l++) {
            int nj = j + l;
            if (nj < 0 || nj >= w) continue;
            if (s[ni][nj] == '#') continue;
            if (nowIslandNum != islandNumList[ni][nj]) {
              graph.get(nowIslandNum).add(islandNumList[ni][nj]);
              graph.get(islandNumList[ni][nj]).add(nowIslandNum);
            }
          }
        }
      }
    }

    int[] step = new int[islandNum];
    Arrays.fill(step, -1);
    int st = islandNumList[ch][cw];
    step[st] = 0;

    Deque<Integer> que = new ArrayDeque<>();
    que.add(st);

    while (!que.isEmpty()) {
      int now = que.poll();
      for (int next : graph.get(now)) {
        if (step[next] != -1) continue;

        step[next] = step[now] + 1;
        que.add(next);
      }
    }

    out.println(step[islandNumList[dh][dw]]);
    out.flush();
  }
}
