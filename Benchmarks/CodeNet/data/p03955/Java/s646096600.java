import java.io.*;
import java.util.*;

public class Main {
  private static InputReader in;
  private static PrintWriter out;

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out, true);

    int n = in.nextInt();
    int[][] arr = new int[3][n];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = in.nextInt();
      }
    }
    boolean ok = true;
    int[] nums = new int[n];
    long b1 = 0, b2 = 0;
    for (int col = 0; col < n; col++) {
      int num = -1;
      if (arr[0][col] < arr[1][col]) {
        if (arr[1][col] != arr[0][col]+1 || arr[2][col] != arr[1][col]+1) {
          ok = false;
          break;
        }
        if ((arr[0][col]-1) % 3 != 0) {
          ok = false;
          break;
        }
        num = (arr[0][col]-1)/3;
      } else {
        if (arr[1][col] != arr[0][col]-1 || arr[2][col] != arr[1][col]-1) {
          ok = false;
          break;
        }
        if ((arr[2][col]-1) % 3 != 0) {
          ok = false;
          break;
        }
        num = (arr[2][col]-1)/3;
        if (col % 2 == 0) b2++;
        else b1++;
      }
      nums[col] = num;
      if (num%2 != col%2) {
        ok = false;
        break;
      }
      if (num % 2 == 0) b2 += 2*n+num/2-col/2;
      else b1 += 2*n+num/2-col/2;
      if (num < col) {
        if (col % 2 == 0) b1 += (col/2-num/2);
        else b2 += (col/2-num/2);
      }
    }
    out.println(ok && b1%2 == 0 && b2%2 == 0 ? "Yes" : "No");
    
    out.close();
    System.exit(0);
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }
  }


}
