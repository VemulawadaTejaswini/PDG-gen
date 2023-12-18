import java.util.*;
import java.util.stream.*;

class Main {
  
  static int H,W;
  static String[][] map;
  static int[][] breadth;
  static Deque<Integer[]> que;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    map = new String[H][W];
    breadth = new int[H][W];
    que = new ArrayDeque<>();
    for (int i = 0; i < H; i++) map[i] = sc.next().split("");
    que.add(new Integer[]{0, 0});
    int b = 1;
    breadth[0][0] = b;
    while (!que.isEmpty()) {
      int n = que.size();
      b++;
      for (int i = 0; i < n; i++) {
        Integer[] p = que.poll();
        search(b, p[0]-1, p[1]);
        search(b, p[0], p[1]+1);
        search(b, p[0], p[1]-1);
        search(b, p[0]+1, p[1]);
      }
    }
    long wallNum = Arrays.stream(map).flatMap(e -> Arrays.stream(e))
      .filter(e -> e.equals("#"))
      .count();
    System.out.println(breadth[H-1][W-1] == 0 ? -1 : H*W-wallNum-breadth[H-1][W-1]);
    //for (int i = 0; i < H; i++) System.out.println(Arrays.toString(breadth[i]));
  }
  
  static void search(int b, int h, int w) {
    if (h < 0 | h >= H | w < 0 | w >= W) return;
    if (map[h][w].equals("#")) return;
    if (breadth[h][w] != 0) return;
    breadth[h][w] = b;
    que.add(new Integer[]{h, w});
  }
}