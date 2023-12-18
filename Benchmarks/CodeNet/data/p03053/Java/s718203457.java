import java.util.*;

class Main {
  static int H, W;
  static String[][] map;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    map = new String[H][W];
    Deque<Integer[]> que = new ArrayDeque<>();
    for (int i = 0; i < H; i++) {
      map[i] = sc.next().split("");
      for (int j = 0; j < W; j++) {
        if (map[i][j].equals("#")) que.add(new Integer[]{i, j}); 
      }
    }
    int ans = 0;
    while (true) {
      int n = que.size();
      for (int i = 0; i < n; i++) {
        Integer[] p = que.poll();
        change(que, p[0]-1, p[1]);
        change(que, p[0], p[1]+1);
        change(que, p[0], p[1]-1);
        change(que, p[0]+1, p[1]);
      }
      if (que.isEmpty()) break;
      ans++;
    }
    System.out.println(ans);
  }
  
  static void change(Deque<Integer[]> que, int h, int w) {
    if (h < 0 | h >= H | w < 0 | w >= W) return;
    if (map[h][w].equals("#")) return;
    que.add(new Integer[]{h, w});
    map[h][w] = "#";
  }
}