import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] s = new char[H][W];
    for (int i = 0; i < H; i++) {
      String line = sc.next();
      for (int j = 0; j < W; j++) {
        s[i][j] = line.charAt(j);
      }
    }
    
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        // BFS
        if (s[i][j] == '#' && !bfs(s, i, j)) {
          System.out.println("No");
          return;
        }
      }
    }
    
    System.out.println("Yes");
  }
  
  private static boolean bfs(char[][] s, int i, int j) {
    
    boolean hasNext = false;
    LinkedList<List<Integer>> queue = new LinkedList<>();
    queue.push(Arrays.asList(i, j));
    while (!queue.isEmpty()) {
      List<Integer> entry = queue.poll();
      int ii = entry.get(0);
      int jj = entry.get(1);
      s[ii][jj] = '.';
      if (jj > 0 && s[ii][jj-1] == '#') {
        // left
        queue.push(Arrays.asList(ii, jj-1));
        hasNext = true;
      }
      if (jj < s[ii].length - 1 && s[ii][jj+1] == '#') {
        // right
        queue.push(Arrays.asList(ii, jj+1));
        hasNext = true;
      }
      if (ii > 0 && s[ii-1][jj] == '#') {
        // up
        queue.push(Arrays.asList(ii-1, jj));
        hasNext = true;
      }
      if (ii < s.length - 1 && s[ii+1][jj] == '#') {
        // down
        queue.push(Arrays.asList(ii+1, jj));
        hasNext = true;
      }
    }
    return hasNext;
  }
}