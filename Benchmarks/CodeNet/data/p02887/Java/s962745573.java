import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    System.out.println(solve());
  }
  
  private static int solve() {
    FastReader fr = new FastReader();
    int N = fr.nextInt();
    int result = 0;
    int current = -9999; // value of current character in Int
    String S = fr.next();
    for (int i = 0; i < N; i++) {
      int checking = S.charAt(i) - 'a';
      if (current == checking) continue; // if found the same color, it will slime to the near by color
      current = checking; // change current color
      result++; // and also add one to result since we found a new color that can not be fused
    }
    
    return result;
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