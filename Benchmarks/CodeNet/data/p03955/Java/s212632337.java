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
    boolean[] flipped = new boolean[n];
    boolean ok = true;
    int[] toflip = new int[n];
    int[] nums = new int[n];
    for (int col = 0; col < n; col++) {
      if (arr[0][col] < arr[1][col]) {
        if (arr[1][col] != arr[0][col]+1 || arr[2][col] != arr[1][col]+1) {
          ok = false;
          break;
        }
        int num = (arr[0][col]-1)/3;
        nums[col] = num;
        if (num%2 != col%2) {
          ok = false;
          break;
        }
        flipped[num] = false ^ ((2*n+num/2-col/2) % 2 != 0);
        if (num < col) {
          toflip[num]++;
          toflip[col]++;
        }
      } else {
        if (arr[1][col] != arr[0][col]-1 || arr[2][col] != arr[1][col]-1) {
          ok = false;
          break;
        }
        int num = (arr[2][col]-1)/3;
        nums[col] = num;
        if (num%2 != col%2) {
          ok = false;
          break;
        }
        flipped[num] = true ^ ((2*n+num/2-col/2) % 2 != 0);
        if (num < col) {
          toflip[num]++;
          toflip[col]++;
        }
      }
    }
    if (!ok) {
      out.println("No");
      out.close();
      System.exit(0);
    }
    long a1 = 0, a2 = 0;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        flipped[nums[i]] ^= a2 % 2 == 1;
      } else {
        flipped[i] ^= a1 % 2 == 1;
      }
      if (i % 2 == 0) a1 += toflip[i];
      else a2 += toflip[i];
    }
    for (int i = 0; i+2 < n; i++) {
      if (flipped[i]) {
        flipped[i] ^= true;
        flipped[i+2] ^= true;
      }
    }
    for (int i = 0; i < n; i++) {
      if (flipped[i]) {
        ok = false;
        break;
      }
    }
    out.println(ok?"Yes":"No");
    
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
