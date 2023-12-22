import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
  static InputReader in;
  static PrintWriter out;

 


  static class Solution {
    void solve() throws IOException {
      BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
      int[] cnt = new int[26];
      String line;
      while (!(line = bfr.readLine()).equals(null)) {
        for (int i = 0; i < line.length(); i++) {
          switch (line.toLowerCase().charAt(i)) {
            case 'a':
              cnt[0]++;
              break;
            case 'b':
              cnt[1]++;
              break;
            case 'c':
              cnt[2]++;
              break;
            case 'd':
              cnt[3]++;
              break;
            case 'e':
              cnt[4]++;
              break;
            case 'f':
              cnt[5]++;
              break;  
            case 'g':
              cnt[6]++;
              break;
            case 'h':
              cnt[7]++;
              break;
            case 'i':
              cnt[8]++;
              break;
            case 'j':
              cnt[9]++;
              break;
            case 'k':
              cnt[10]++;
              break;
            case 'l':
              cnt[11]++;
              break;
            case 'm':
              cnt[12]++;
              break;  
            case 'n':
              cnt[13]++;
              break;
            case 'o':
              cnt[14]++;
              break;
            case 'p':
              cnt[15]++;
              break;
            case 'q':
              cnt[16]++;
              break;
            case 'r':
              cnt[17]++;
              break;
            case 's':
              cnt[18]++;
              break;
            case 't':
              cnt[19]++;
              break;  
            case 'u':
              cnt[20]++;
              break;
            case 'v':
              cnt[21]++;
              break;
            case 'w':
              cnt[22]++;
              break;
            case 'x':
              cnt[23]++;
              break;
            case 'y':
              cnt[24]++;
              break;
            case 'z':
              cnt[25]++;
              break;
            default:
              break;
          }
        }
        
      }
      
      out.println(
          "a : "+ cnt[0] + "\n" +
          "b : "+ cnt[0] + "\n" +
          "c : "+ cnt[0] + "\n" +
          "d : "+ cnt[0] + "\n" +
          "e : "+ cnt[0] + "\n" +
          "f : "+ cnt[0] + "\n" +
          "g : "+ cnt[0] + "\n" + 
          "h : "+ cnt[0] + "\n" +
          "i : "+ cnt[0] + "\n" +
          "j : "+ cnt[0] + "\n" +
          "k : "+ cnt[0] + "\n" +
          "l : "+ cnt[0] + "\n" +
          "m : "+ cnt[0] + "\n" +
          "n : "+ cnt[0] + "\n" +
          "o : "+ cnt[0] + "\n" +
          "p : "+ cnt[0] + "\n" +
          "q : "+ cnt[0] + "\n" +
          "r : "+ cnt[0] + "\n" +
          "s : "+ cnt[0] + "\n" +
          "t : "+ cnt[0] + "\n" +
          "u : "+ cnt[0] + "\n" +
          "v : "+ cnt[0] + "\n" +
          "w : "+ cnt[0] + "\n" +
          "x : "+ cnt[0] + "\n" +
          "y : "+ cnt[0] + "\n" +
          "z : "+ cnt[0]

           );
        
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