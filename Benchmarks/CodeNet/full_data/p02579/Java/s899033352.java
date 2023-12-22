import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  private static final char BLOCK = '#';
  private static final char ROAD = '.';

  static boolean[][] booleanArrayCache;

  static boolean[][] newBooleanArray(int h, int w) {
    if (booleanArrayCache == null) {
      booleanArrayCache = new boolean[h][w];
      return booleanArrayCache;
    }
    for (int i = 0; i < h; i++) {
      Arrays.fill(booleanArrayCache[i], false);
    }
    return booleanArrayCache;
  }

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
    boolean visited[][] = new boolean[h][w];
    for (int i = 0; i < h; i++) {
      String line = sc.next();
      for (int j = 0; j < w; j++) {
        maze[i][j] = line.charAt(j);
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
      visited, distance)).nextRequired()) {
      nextArea = warp(safeIndexMaze, result.sameDistanceArea, visited);
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
    boolean visited[][],
    int currentDistance) {

    Queue<int[]> dfsQueue = new LinkedList<>();
    WalkResult result = new WalkResult();
    List<int[]> sameDistanceArea = new ArrayList<>();
    result.sameDistanceArea = sameDistanceArea;
    dfsQueue.addAll(nextArea);
    boolean queued[][] = newBooleanArray(safeIndexMaze.h, safeIndexMaze.w);
    nextArea.stream().forEach(a -> queued[a[0]][a[1]] = true);
    int target[];
    BiIntConsumer addQueue = (nextI, nextJ) -> {
      if (safeIndexMaze.isRoad(nextI, nextJ)
        && !visited[nextI][nextJ]
        && !queued[nextI][nextJ]) {
        dfsQueue.add(new int[]{nextI, nextJ});
        queued[nextI][nextJ] = true;
      }
    };
    while ((target = dfsQueue.poll()) != null) {
      int i = target[0];
      int j = target[1];
      if (visited[i][j]) {
        continue;
      }
      visited[i][j] = true;
      sameDistanceArea.add(target);
      if (goalH == i && goalW == j) {
        result.isGoalFound = true;
        return result;
      }
      addQueue.consume(i + 1, j);
      addQueue.consume(i - 1, j);
      addQueue.consume(i, j + 1);
      addQueue.consume(i, j - 1);
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

  interface BiIntConsumer {

    void consume(int nextI, int nextJ);
  }

  static List<int[]> warp(SafeIndexMaze safeIndexMaze,
    List<int[]> startArea, boolean visited[][]) {
    boolean added[][] = newBooleanArray(safeIndexMaze.h, safeIndexMaze.w);
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
            && !added[nextI][nextJ]
            && !visited[nextI][nextJ]) {
            canBeWarped.add(new int[]{nextI, nextJ});
            added[nextI][nextJ] = true;
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
