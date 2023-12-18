import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String [] args) {
    FastReader fr = new FastReader();
    int N = fr.nextInt();
    int[] sticks = new int[N];
    for (int i = 0; i < N; i++) {
      sticks[i] = fr.nextInt();
    }

    Arrays.sort(sticks); // sort sticks in ascending order

    int result = 0;
    for (int i = N - 1; i >= 2; i--) {
      for (int j = i - 1; j >= 1; j--) {
        int minL = sticks[i] - sticks[j];
        int index = binarySearch(sticks, minL, 0, j - 1);
        if (sticks[index] > minL) {
          result += (N - index); // sticks[index] is also counted
        } else {
          result += (N - 1 - index); // sticks[index] isn't counted
        }
      }
    }

    System.out.println(result);
  }

  static int binarySearch(int[] sticks, int minL, int lo, int hi) {
    int mid = (lo + hi)/2;
    if (sticks[mid] == minL) return mid;
    if (sticks[mid] > minL) return binarySearch(sticks, minL, lo, mid - 1);
    return binarySearch(sticks, minL, mid + 1, hi);
  }
}

class FastReader {
  BufferedReader br;
  StringTokenizer st;

  public FastReader() {
    br = new BufferedReader(new
        InputStreamReader(System.in));
  }

  String next() {
    while (st == null || !st.hasMoreElements())
    {
      try
      {
        st = new StringTokenizer(br.readLine());
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    return st.nextToken();
  }

  int nextInt() {
    return Integer.parseInt(next());
  }

  long nextLong() {
    return Long.parseLong(next());
  }

  double nextDouble() {
    return Double.parseDouble(next());
  }

  String nextLine() {
    String str = "";
    try {
      str = br.readLine();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return str;
  }
}