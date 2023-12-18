import java.io.*;
import java.util.*;

public class Main {
  static int MOD = 1000000007;
  static double EPS = 1e-9;

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(in.readLine());

    String N = st.nextToken();
    int length = N.length();
    int K = Integer.parseInt(st.nextToken());

    TreeSet<Integer> set = new TreeSet<Integer>();

    st = new StringTokenizer(in.readLine());

    for (int i = 0; i < K; i++) {
      set.add(Integer.parseInt(st.nextToken()));
    }

    int[] valid = new int[10 - K];
    int index = 0;

    for (int i = 0; i < 10; i++) {
      if (!set.contains(i)) {
        valid[index] = i;
        index++;
      }
    }

    int res = 0;
    int max = -1;

    for (int i = 0; i < length; i++) {
      max = Math.max(max, N.charAt(i) - '0');
    }

    if (max > valid[valid.length - 1]) {
      if (valid[0] == 0)
        res = valid[1];
      else
        res = valid[0];
      for (int i = 0; i < length; i++) {
        res = res * 10 + valid[0];
      }
    }
    else {
      for (int i = 0; i < length; i++) {
        int d = N.charAt(i) - '0';
        for (int j = 0; j < valid.length; j++) {
          if (valid[j] >= d) {
            res = res * 10 + valid[j];
          }
          break;
        }
      }
    }

    System.out.println(res);

    in.close();
  }
}