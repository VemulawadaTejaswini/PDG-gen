import java.io.*;
import java.util.*;

public class Main {
  private static InputReader in;
  private static PrintWriter out;

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out, true);

    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = in.nextInt();
    Arrays.sort(arr);
    for (int i = arr.length-1; i > 0; i--)
      arr[i] = (arr[i] - arr[i-1]) % 2;
    arr[0] = arr[0] % 2;
    boolean winner = false;
    while(true) {
      if (arr.length == 1) {
        winner = arr[0] % 2 == 0;
        break;
      }
      int c = 0;
      ArrayList<Integer> x = new ArrayList<>();
      boolean allone = true;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1) {
          if (c > 0) x.add(c);
          c = 0;
        } else {
          allone = false;
        }
        c += 1;
      }
      x.add(c);
      if (allone) {
        winner = arr.length % 2 == 0;
        break;
      }
      arr = new int[x.size()];
      for (int i = 0; i < x.size(); i++) arr[arr.length-i-1] = x.get(i) % 2;
    }
    out.println(winner ? "First" : "Second");
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
