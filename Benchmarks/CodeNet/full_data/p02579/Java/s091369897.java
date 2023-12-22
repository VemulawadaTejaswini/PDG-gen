import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  private static final char BLOCK = '#';
  private static final char ROAD = '.';

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int ch = Integer.parseInt(sc.next()) - 1;
    int cw = Integer.parseInt(sc.next()) - 1;
    int dh = Integer.parseInt(sc.next()) - 1;
    int dw = Integer.parseInt(sc.next()) - 1;

    char maze[][] = new char[h][w];
    int cost[][] = new int[h][w];
    for (int i = 0; i < h; i++) {
      String line = sc.next();
      for (int j = 0; j < w; j++) {
        maze[i][j] = line.charAt(j);
        cost[i][j] = -1;
      }
    }
    SafeIndexMaze safeIndexMaze = new SafeIndexMaze(h, w, maze);
    int distance = 0;
    WalkResult result;
    List<int[]> nextArea = new ArrayList<>();
    nextArea.add(new int[]{ch, cw});
    while ((result = walk(
      safeIndexMaze,
      nextArea,
      dh, dw,
      cost, distance)).nextRequired()) {
      nextArea = warp(safeIndexMaze, result.sameDistanceArea, cost);
      distance++;
    }
    if (result.isGoalFound) {
      pw.println(distance);
    } else {
      pw.println(-1);
    }
  }

  static WalkResult walk(SafeIndexMaze safeIndexMaze,
    List<int[]> nextArea,
    int goalH, int goalW,
    int cost[][], int currentDistance) {
    Queue<int[]> dfsQueue = new LinkedList<>();
    WalkResult result = new WalkResult();
    List<int[]> sameDistanceArea = new ArrayList<>();
    result.sameDistanceArea = sameDistanceArea;
    dfsQueue.addAll(nextArea);
    boolean queued[][] = new boolean[safeIndexMaze.h][safeIndexMaze.w];
    int target[];
    while ((target = dfsQueue.poll()) != null) {
      int i = target[0];
      int j = target[1];
      if (cost[i][j] != -1) {
        continue;
      }
      cost[i][j] = currentDistance;
      sameDistanceArea.add(target);
      if (goalH == i && goalW == j) {
        result.isGoalFound = true;
        return result;
      }
      {
        int nextI = i + 1;
        int nextJ = j;
        if (safeIndexMaze.isRoad(nextI, nextJ)) {
          if (cost[nextI][nextJ] == -1 && !queued[nextI][nextJ]) {
            dfsQueue.add(new int[]{nextI, nextJ});
            queued[nextI][nextJ] = true;
          }
        }
      }
      {
        int nextI = i - 1;
        int nextJ = j;
        if (safeIndexMaze.isRoad(nextI, nextJ)) {
          if (cost[nextI][nextJ] == -1 && !queued[nextI][nextJ]) {
            dfsQueue.add(new int[]{nextI, nextJ});
            queued[nextI][nextJ] = true;
          }
        }
      }
      {
        int nextI = i;
        int nextJ = j + 1;
        if (safeIndexMaze.isRoad(nextI, nextJ)) {
          if (cost[nextI][nextJ] == -1 && !queued[nextI][nextJ]) {
            dfsQueue.add(new int[]{nextI, nextJ});
            queued[nextI][nextJ] = true;
          }
        }
      }
      {
        int nextI = i;
        int nextJ = j - 1;
        if (safeIndexMaze.isRoad(nextI, nextJ)) {
          if (cost[nextI][nextJ] == -1 && !queued[nextI][nextJ]) {
            dfsQueue.add(new int[]{nextI, nextJ});
            queued[nextI][nextJ] = true;
          }
        }
      }
    }
    return result;
  }

  static class WalkResult {

    boolean isGoalFound = false;
    List<int[]> sameDistanceArea;

    boolean nextRequired() {
      if (isGoalFound) {
        return false;
      }
      return !sameDistanceArea.isEmpty();
    }
  }

  static List<int[]> warp(SafeIndexMaze safeIndexMaze, List<int[]> startArea, int cost[][]) {
    boolean visited[][] = new boolean[safeIndexMaze.h][safeIndexMaze.w];
    List<int[]> canBeWarped = new ArrayList<>();
    for (int[] start : startArea) {
      for (int i = -2; i <= 2; i++) {
        int nextI = start[0] + i;
        if (nextI < 0 || nextI >= safeIndexMaze.h) {
          continue;
        }
        for (int j = -2; j <= 2; j++) {
          int nextJ = start[1] + j;
          if (safeIndexMaze.isRoad(nextI, nextJ)
            && !visited[nextI][nextJ]
            && cost[nextI][nextJ] == -1) {
            canBeWarped.add(new int[]{nextI, nextJ});
            visited[nextI][nextJ] = true;
          }
        }
      }
    }
    return canBeWarped;
  }

  static class SafeIndexMaze {

    int h;
    int w;
    char[][] area;

    SafeIndexMaze(int h, int w, char[][] area) {
      this.h = h;
      this.w = w;
      this.area = area;
    }

    char get(int i, int j) {
      if (i >= 0 && i < h && j >= 0 && j < w) {
        return area[i][j];
      }
      return BLOCK;
    }

    boolean isRoad(int i, int j) {
      return get(i, j) == ROAD;
    }
  }
}
