import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int count = 0;
    char[][] A = new char[H][W];
    for (int i = 0; i < H; i++) {
      String s = sc.next();
      for (int j = 0; j < W; j++) {
        A[i][j] = s.charAt(j);
        if (A[i][j] == '#') {
          count++;
        }
      }
    }
    if (count != W+H-1) {
      System.out.println("Impossible");
      return;
    }
    
    System.out.println(dfs(A, 0, 0) ? "Possible" : "Impossible");
  }
  
  private static boolean dfs(char[][] A, int i, int j) {
    if (i == A.length-1 && j == A[0].length-1) {
      return A[i][j] == '#';
    }
    if (A[i][j] != '#') {
      return false;
    }
    boolean ok = false;
    if (i+1 < A.length) {
      ok |= dfs(A, i+1, j);
    }
    if (j+1 < A[0].length) {
      ok |= dfs(A, i, j+1);
    }
    return ok;
  }
}