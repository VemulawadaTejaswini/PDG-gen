import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Scanner;

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
    
    int getTopnum() {
      return top;
    }
  }
  
  
  static class Solution {
    void solve() throws IOException {
      Dice dice = new Dice(in.nextInt(), in.nextInt(), in.nextInt(),
                           in.nextInt(), in.nextInt(), in.nextInt());
      
      String operation = in.next();
      
      for (int i = 0; i < operation.length(); i++) {
        switch (operation.charAt(i)) {
          case 'N':
            dice.turnsNorth();
            break;
          case 'E':
            dice.turnsEast();
            break;
          case 'S':
            dice.turnsSouth();
            break;
          case 'W':
            dice.turnsWest();
            break;
          default:
            break;
        }
      } 
      
      out.println(dice.getTopnum());
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