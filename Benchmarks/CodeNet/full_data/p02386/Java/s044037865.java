import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
  static InputReader in;
  static PrintWriter out;

  static class Dice {
    int top;
    int bottom;
    int north;
    int east;
    int south;
    int west;
    int tmp;

    Dice(int first, int second, int third,
        int fourth, int fifth, int sixth) {
      this.top = first;
      this.south = second;
      this.east = third;
      this.west = fourth;
      this.north = fifth;
      this.bottom = sixth;
    }

    void turnsNorth() {
      tmp = top;
      top = south;
      south = bottom;
      bottom = north;
      north = tmp;
    }

    void turnsEast() {
      tmp = top;
      top = west;
      west = bottom;
      bottom = east;
      east = tmp;
    }

    void turnsSouth() {
      tmp = top;
      top = north;
      north = bottom;
      bottom = south;
      south = tmp;
    }

    void turnsWest() {
      tmp = top;
      top = east;
      east = bottom;
      bottom = west;
      west = tmp;
    }

    void spinRight() {
      tmp = north;
      north = west;
      west = south;
      south = east;
      east = tmp;
    }

    boolean isEqual(int top, int south, int north, int west, int east) {

      out: for (int i = 0; i <= 3; i++) {
        for(int l = 0; l < i;l++) {
          turnsNorth();
        }

        for (int j = 0; j <= 3; j++) {
          for(int l = 0; l < i;l++) {
            turnsEast();
          }

          for (int k = 0; k <= 3; k++) {
            for(int l = 0; l < i;l++) {
              spinRight();
            }

            if (this.top == top && this.south == south && 
                this.north == north && this.west == west && this.east == east) {
              return true;
            }
          }

        }
      }

      return false;
    }
    
    int getTopnum() {
      return top;
    }
  }


  static class Solution {
    void solve() throws IOException {
      int n = in.nextInt();
      Dice[] dice = new Dice[n];
      
      for (int i = 0; i < n; i++) {        
        dice[i] =  new Dice(in.nextInt(), in.nextInt(), in.nextInt(),
            in.nextInt(), in.nextInt(), in.nextInt());
      }
      
      
      boolean flg = true;
      outside:for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
          if (dice[i].isEqual(dice[j].top, dice[j].south, dice[j].north, dice[j].west, dice[j].east)) {
            flg = false;
            break outside;
          }
        }
      }
      
      if (flg) {
        out.println("Yes");
      } else {
        out.println("No");
      }
      
//      End solve()
    }
//    End Solution
}


  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Solution solver = new Solution();
    solver.solve();
    out.close();
}


  static class InputReader {
    public BufferedReader br;
    public StringTokenizer st;

    public InputReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream));
    }

    public int nextInt() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Integer.parseInt(st.nextToken());
    }

    public long nextLong() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Long.parseLong(st.nextToken());
    }

    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }

    public double nextDouble() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Double.parseDouble(st.nextToken());
    }

  }

}