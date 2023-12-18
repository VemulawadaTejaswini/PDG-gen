import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    int N, Q;
    int[][] connections;
    int[] scores;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      Q = sc.nextInt();
      connections = new int[N][];
      for(int i = 0; i < N-1; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] connA = connections[a-1];
        int nA = connA == null ? 0 : connA.length;
        int[] newConnA = new int[nA+1];
        if(nA > 0 ) {
          System.arraycopy(connA, 0, newConnA, 0, nA);
        }
        newConnA[nA] = b;
        connections[a-1] = newConnA;
        
        int[] connB = connections[b-1];
        int nB = connB == null ? 0 : connB.length;
        int[] newConnB = new int[nB+1];
        if(nB > 0) {
          System.arraycopy(connB, 0, newConnB, 0, nB);
        }
        newConnB[nB] = a;
        connections[b-1] = newConnB;
      }
      scores = new int[N];
      for(int j = 0; j < Q; j++) {
        int p = sc.nextInt();
        int x = sc.nextInt();
        scores[p-1] += x;
      }
    }
    solve(connections, scores);
    System.out.print(scores[0]);
    for(int i = 1; i < N; i++) {
      System.out.print(" ");
      System.out.print(scores[i]);
    }
    System.out.println();
  }
  
  private static void solve(int[][] connections, int[] scores) {
    propagate(connections, scores, 1, -1);
  }
  
  private static void propagate(int[][] connections,
                                int[] scores,
                                int target, int except) {
    int[] conn = connections[target-1];
    int score = scores[target-1];
    for ( int c : conn ) {
      if ( c == except ) {
        continue;
      }
      scores[c-1] += score;
      propagate(connections, scores, c, target);
    }
  }

}
