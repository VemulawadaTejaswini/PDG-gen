import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Agent {
    int town;
    int m;
    int time;

    Agent(int a, int b, int c) {
      town = a;
      m = b;
      time = c;
    }
  }

  boolean isOK(boolean[][] link, int n, int s, int e) {
    boolean flag = false;
    Queue<Integer> qt = new LinkedList<Integer>();
    qt.add( s );
    boolean[] done = new boolean[n];
    while (qt.size() > 0) {
      int t = qt.poll();
      done[ t ] = true;
      flag |= t == e;
      for ( int i = 0; i < n; ++i ) {
        if ( done[ i ] )
          continue;
        if ( !link[ t ][ i ] )
          continue;
        qt.add( i );
      }
    }
    return flag;
  }

  void run() {
    for ( ;; ) {
      int n, m, l, k, a, h;
      n = ni();
      m = ni();
      l = ni();
      k = ni();
      a = ni();
      h = ni();
      if ( n == 0 ) {
        break;
      }

      int[][] field = new int[n][n];
      boolean[][] link = new boolean[n][n];
      boolean[] host = new boolean[n];
      for ( int i = 0; i < l; ++i ) {
        host[ ni() ] = true;
      }
      for ( int i = 0; i < k; ++i ) {
        int x = ni();
        int y = ni();
        int t = ni();
        field[ x ][ y ] = field[ y ][ x ] = t;
        link[ x ][ y ] = link[ y ][ x ] = true;
      }

      if ( !isOK( link, n, a, h ) ) {
        System.out.println( "Help!" );
        continue;
      }

      Queue<Agent> queue = new PriorityQueue<Agent>( n * n,
          new Comparator<Agent>() {
            @Override
            public int compare(Agent o1, Agent o2) {
              return o1.time - o2.time;
            }
          } );
      queue.add( new Agent( a, m, 0 ) );
      boolean flag = false;
      int ans = 0;
      while (queue.size() > 0) {
        Agent agent = queue.poll();
        if ( agent.town == h ) {
          flag = true;
          ans = agent.time;
          break;
        }
        for ( int i = 0; i < n; ++i ) {
          if ( !link[ agent.town ][ i ] )
            continue;
          if ( agent.m - field[ agent.town ][ i ] < 0 )
            continue;
          Agent next = new Agent( i, agent.m - field[ agent.town ][ i ],
              agent.time + field[ agent.town ][ i ] );
          queue.add( next );
          if ( host[ i ] ) {
            for ( int j = next.m + 1; j <= m; ++j ) {
              queue.add( new Agent( i, j, next.time + j - next.m ) );
            }
          }
        }
      }
      if ( flag ) {
        System.out.println( ans );
      } else {
        System.out.println( "Help!" );
      }
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }

}