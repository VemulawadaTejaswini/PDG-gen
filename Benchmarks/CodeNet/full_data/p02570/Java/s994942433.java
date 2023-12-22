import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(in.readLine());
    int D = Integer.parseInt(st.nextToken());
    int T = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());

    System.out.println(solve(D, T, S));

    in.close();
  }

  private static String solve(int D, int T, int S) {
    if (T * S >= D) {
      return "Yes";
    }

    return "No";
  }
}