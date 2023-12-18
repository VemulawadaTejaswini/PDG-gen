import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  static final int e5 = (int) 1e5;

  public static class Solver {

    int N;
    int[][] A;
    ArrayDeque<Game> queue;
    ArrayDeque<Game> nextQueue;
    int[] count;
    boolean[][] done;

    public Solver() {

      N = sc.nextInt();

      A = new int[N][N-1];

      for (int i=0; i<N; i++) {
        for (int j=0; j<N-1; j++) {
          A[i][j] = sc.nextInt()-1;
        }
      }

      queue = new ArrayDeque<Game>();
      nextQueue = new ArrayDeque<Game>();

      count = new int[N];

      for (int i=0; i<N; i++) {
        check(i);
      }

      done = new boolean[N][N];

      long ans = 0;
      while (!queue.isEmpty() || !nextQueue.isEmpty()) {

        if (queue.isEmpty()) {
          ans++;
          queue = nextQueue;
          nextQueue = new ArrayDeque<Game>();
        }

        Game game = queue.removeFirst();

        if (done[game.a][game.b] || done[game.b][game.a]) {
          continue;
        }

        done[game.a][game.b] = true;
        count[game.a]++;
        count[game.b]++;

        check(game.a);
        check(game.b);

      }

      boolean ok = true;
      for (int i=0; i<N; i++) {
        if (count[i] != N-1) {
          ok = false;
          break;
        }
      }

      System.out.println(ok ? ans : -1);

    }

    void check(int i) {
      if (count[i] < N-1) {
        int opponent = A[i][count[i]];
        if (count[opponent] < N-1) {
          if (A[opponent][count[opponent]] == i) {
            nextQueue.add(new Game(i, opponent));
          }
        }
      }
    }

    class Game {
      int a, b;
      Game(int A, int B) {
        a = A;
        b = B;
      }
    }
  }

  public static void main(String[] args) {
    new Solver();
  }
}
