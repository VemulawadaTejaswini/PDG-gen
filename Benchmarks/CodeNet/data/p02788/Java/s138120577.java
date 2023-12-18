import java.io.*;
import java.util.*;


public class Main {

  class Pair implements Comparable<Pair> {
    int first;
    int second;

    public Pair(int first, int second) {
      this.first = first;
      this.second = second;
    }

    @Override
    public int compareTo(Pair o) {
      return first - o.first;
    }
  }

  void solve() throws IOException {
    int n = nextInt();
    int d = nextInt();
    int a = nextInt();
    Pair[] m = new Pair[n];
    for (int i = 0; i < n; i++) {
      m[i] = new Pair(nextInt(), nextInt());
    }
    Arrays.sort(m);
    PriorityQueue<Pair> toDecCount = new PriorityQueue<>();
    int x = 0;
    int ind = 0;
    long ans = 0;
    long damage = 0;
    while (x < n) {
      while (ind + 1 < m.length) {
        if (m[ind + 1].first - d <= m[x].first) {
          ind++;
        } else {
          break;
        }
      }
      while (!toDecCount.isEmpty() && m[ind].first - d > toDecCount.peek().first) {
        damage -= toDecCount.poll().second;
      }
      m[x].second -= damage * a;
      if (m[x].second != 0) {
        int count = (m[x].second - 1) / a + 1;
        damage += count;
        m[x].second = 0;
        ans += count;
        toDecCount.add(new Pair(m[ind].first + d, count));
      }
      x++;
    }
    out.println(ans);
  }

  public static void main(String[] args) throws IOException {
    new Main().run();
  }

  void run() throws IOException {
    reader = new BufferedReader(new InputStreamReader(System.in));
//		reader = new BufferedReader(new FileReader("input.txt"));
    tokenizer = null;
    out = new PrintWriter(new OutputStreamWriter(System.out));
//		out = new PrintWriter(new FileWriter("output.txt"));
    solve();
    reader.close();
    out.flush();

  }

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter out;

  int nextInt() throws IOException {
    return Integer.parseInt(nextToken());
  }

  long nextLong() throws IOException {
    return Long.parseLong(nextToken());
  }

  double nextDouble() throws IOException {
    return Double.parseDouble(nextToken());
  }

  String nextToken() throws IOException {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      tokenizer = new StringTokenizer(reader.readLine());
    }
    return tokenizer.nextToken();
  }
}
