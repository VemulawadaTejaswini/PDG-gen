import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int N = sc.nextInt();
        long C = sc.nextLong();
        long[] x = new long[N];
        int[] v = new int[N];
        for ( int i = 0; i < N; i++ ) {
            x[i] = sc.nextLong();
            v[i] = sc.nextInt();
        }
        Input input = new Input(N, C, x, v);
        Status stat = new Status(0, 0, 0);
        Status result = solve(input, stat);
        System.out.println(result.getValue());
    };
  }

  private static Status solve(Input input, Status stat) {
        Status answer = stat;
        for ( Direction direction : Direction.values() ) {
              Status stat_copied = stat.copy();
              Status candidate = solve(input, stat, direction);
              if ( candidate.getValue() > answer.getValue() ) {
                    answer = candidate;
              }
        }
        return answer;
  }

  private static enum Direction {
       CLOCKWISE,
       COUNTERCLOCKWISE,
       ;
  }

  private static Status solve(Input input, Status stat, Direction direction) {
        int N = input.N;
        long C = input.C;
        if ( N == 0 ) {
            return stat;
        }
        else if ( N == 1 ) {
            long x = input.x[0];
            int v = input.v[0];
            long pos = stat.pos;
            long gain_diff = v;
            long loss_diff = -1;
            switch(direction) {
            case CLOCKWISE:
                loss_diff = (long)Math.abs(x - pos);
                break;
            case COUNTERCLOCKWISE:
                loss_diff = (long)Math.abs((C-x) - pos);
                break;
            }
            if ( gain_diff > loss_diff ) {
                Status answer = new Status(x, stat.gain + gain_diff, stat.loss + loss_diff);
                return answer;
            }
            stat.finish();
            return stat;
        }
        else {
             Status answer = stat;
             for ( int i = 0; i < N; i++ ) {
                 Input input_first = new Input(1, C, new long[]{input.x[i]}, new int[]{input.v[i]});
                 for ( Direction direction1 : Direction.values() ) {
                     Status stat_first = solve(input_first, stat, direction1);
                     Status candidate = stat_first;
                     if ( stat_first.isFinished() == false ) {
                         Input input_rest = input.except(i);
                         candidate = solve(input_rest, stat_first);
                     }
                     if ( candidate.getValue() > answer.getValue() ) {
                         answer = candidate;
                     }
                 }
             }
             return answer;
        }
  }

  private static class Status {
      private long pos;
      private long gain;
      private long loss;
      private boolean blnFinished;

      public Status(long pos, long gain, long loss) {
          this.pos = pos;
          this.gain = gain;
          this.loss = loss;
          this.blnFinished = false;
      }

      public Status copy() {
          return new Status(pos, gain, loss);
      }

      public long getValue() {
          return gain - loss;
      }

      public void finish() {
          this.blnFinished = true;
      }

      public boolean isFinished() {
          return blnFinished;
      }
  }

  private static class Input {
      private final int N;
      private final long C;
      private final long[] x;
      private final int[] v;
      public Input(int N, long C, long[] x, int[] v) {
          this.N = N;
          this.C = C;
          this.x = x;
          this.v = v;
      }

      public Input except(int i) {
           if ( i < 0 || i >= N ) {
               throw new IllegalArgumentException("i = " + i);
           }
           int NN = N -1;
           long[] xx = new long[NN];
           int[] vv = new int[NN];
           int counter = -1;
           for ( int j = 0; j < N; j++ ) {
               if ( j == i ) continue;
               counter++;
               xx[counter] = x[j];
               vv[counter] = v[j];
           }
           return new Input(NN, C, xx, vv);
      }
  }
}