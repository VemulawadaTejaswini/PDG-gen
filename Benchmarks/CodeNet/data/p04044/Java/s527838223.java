import java.io.*;
import java.util.*;

public class Beg42ProbB {
  static int MOD = 1000000007;
  static double EPS = 1e-9;

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(in.readLine());

    int N = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    String[] s = new String[N];

    for (int i = 0; i < N; i++) {
      s[i] = in.readLine();
    }
    Arrays.sort(s);

    String res = "";

    for (int i = 0; i < N; i++) {
      res += s[i];
    }

    System.out.println(res);

    in.close();
  }
}