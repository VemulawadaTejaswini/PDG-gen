import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author ilyakor
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      long m = in.nextLong();
      int q = in.nextInt();
      DisjointSets dsu = new DisjointSets(n);
      int[] cnt = new int[n];
      Arrays.fill(cnt, 1);
      ArrayList<ii> forbidden = new ArrayList<>();
      for (int i = 0; i < q; ++i) {
        int x = in.nextInt();
        int y = in.nextInt();
        int c = in.nextInt();
        if (c == 1) {
          int rx = dsu.root(x), ry = dsu.root(y);
          if (rx != ry) {
            int cr = cnt[rx] + cnt[ry];
            dsu.unite(rx, ry);
            cnt[dsu.root(rx)] = cr;
          }
        } else {
          forbidden.add(new ii(x, y));
        }
      }
      HashSet<ii> newForb = new HashSet<>();
      for (ii e : forbidden) {
        int x = dsu.root(e.first), y = dsu.root(e.second);
        if (x == y) {
          out.printLine("No");
          return;
        }
        if (x > y) {
          int t = x;
          x = y;
          y = t;
        }
        ii entry = new ii(x, y);
        if (!newForb.contains(entry)) {
          newForb.add(entry);
        }
      }
      forbidden = new ArrayList<>(newForb);

      DisjointSets dsu2 = new DisjointSets(n);
      int[] cnt2 = new int[n];
      Arrays.fill(cnt2, 1);
      for (ii e : forbidden) {
        int x = e.first;
        int y = e.second;
        int rx = dsu2.root(x), ry = dsu2.root(y);
        if (rx != ry) {
          int cr = cnt2[rx] + cnt2[ry];
          dsu2.unite(rx, ry);
          cnt2[dsu2.root(rx)] = cr;
        }
      }

      ArrayList<Integer> roots = new ArrayList<>();
      for (int i = 0; i < n; ++i) {
        if (dsu.root(i) == i) {
          roots.add(i);
        }
      }
      int k = roots.size();

      long minEdges = 0;
      int[] num2s = new int[n];
      for (int x : roots) {
        if (cnt[x] == 1) {
          continue;
        }
        minEdges += cnt[x];
        if (cnt[x] > 2) {
          continue;
        }
        num2s[dsu2.root(x)] += 1;
      }
      for (int i = 0; i < n; ++i) {
        if (num2s[i] > k - cnt2[i]) {
          out.printLine("No");
          return;
        }
      }
      minEdges += roots.size() - 1;
      if (m < minEdges) {
        out.printLine("No");
        return;
      }

      long maxEdges = 0;
      ArrayList<Integer>[] sizesPerCluster = new ArrayList[n];
      HashSet<Integer> alive = new HashSet<>();
      for (int x : roots) {
        if (dsu2.root(x) == x) {
          sizesPerCluster[x] = new ArrayList<>();
          alive.add(x);
        }
      }
      for (int x : roots) {
        sizesPerCluster[dsu2.root(x)].add(cnt[x]);
      }
      for (int x : alive) {
        Collections.sort(sizesPerCluster[x]);
        Collections.reverse(sizesPerCluster[x]);
      }
      int worst = -1;
      for (int x : alive) {
        if (worst == -1 || num2s[x] - (k - cnt2[x]) > num2s[worst] - (k - cnt2[worst])) {
          worst = x;
        }
      }
      int kInc = 0;
      boolean blocked = false;
      while (alive.size() > 1) {
        ArrayList<ii> cur = new ArrayList<>();
        for (int x : alive) {
          int s = sizesPerCluster[x].get(sizesPerCluster[x].size() - 1);
          cur.add(new ii(-s, x));
        }
        Collections.sort(cur);
        long val = 0;
        for (ii e : cur) {
          int x = e.second, s = -e.first;
          int newNum2 = num2s[x] - (s == 2 ? 1 : 0);
          int newSumOther = k - cnt2[x];
          if (newNum2 > newSumOther) {
            blocked = true;
            continue;
          }
          if (worst != -1 && worst != x) {
            if (num2s[worst] > k - 1 - cnt2[worst]) {
              blocked = true;
              continue;
            }
          }
          val += s;
          --k;
          --cnt2[x];
          if (s == 2) {
            --num2s[x];
          }
          sizesPerCluster[x].remove(sizesPerCluster[x].size() - 1);
          if (sizesPerCluster[x].isEmpty()) {
            alive.remove(x);
          }
          if (worst == -1 || num2s[x] - (k - cnt2[x]) > num2s[worst] - (k - cnt2[worst])) {
            worst = x;
          }
        }
        maxEdges += val * (val - 1L) / 2L;
        kInc += 1;
        if (blocked) {
          break;
        }
      }

      for (int x : alive) {
        if (worst == -1 || num2s[x] - (k - cnt2[x]) > num2s[worst] - (k - cnt2[worst])) {
          worst = x;
        }
      }
      if (!blocked) {
        worst = -1;
      }
      ArrayList<Integer> toMatch = new ArrayList<>();
      int twos = 0;
      ArrayList<Integer> other = new ArrayList<>();
      for (int x : alive) {
        if (x != worst) {
          toMatch.addAll(sizesPerCluster[x]);
        } else {
          twos = num2s[x];
          for (int y : sizesPerCluster[x]) {
            if (y != 2) {
              other.add(y);
            }
          }
        }
      }
      if (twos > toMatch.size()) {
        throw new RuntimeException();
      }
      Collections.sort(toMatch);
      for (int i = 0; i < twos; ++i) {
        toMatch.set(toMatch.size() - i - 1, toMatch.get(toMatch.size() - i - 1) + 2);
      }
      other.addAll(toMatch);
      for (int x : other) {
        maxEdges += x * (long) (x - 1L) / 2L;
      }
      maxEdges += other.size() + kInc - 1;
      if (m > maxEdges) {
        out.printLine("No");
        return;
      }

      out.printLine("Yes");
    }

  }

  static class DisjointSets {

    int[] p;
    int[] rank;

    public DisjointSets(int size) {
      p = new int[size];
      for (int i = 0; i < size; i++) {
        p[i] = i;
      }
      rank = new int[size];
    }

    public DisjointSets(int[] p, int[] rank) {
      this.p = p;
      this.rank = rank;
    }

    public int root(int x) {
      while (x != p[x]) {
        x = p[x];
      }
      return x;
    }

    public void unite(int a, int b) {
      a = root(a);
      b = root(b);
      if (a == b) {
        return;
      }
      if (rank[a] < rank[b]) {
        p[a] = b;
      } else {
        p[b] = a;
        if (rank[a] == rank[b]) {
          ++rank[a];
        }
      }
    }

  }

  static class ii implements Comparable<ii> {

    public int first;
    public int second;

    public ii() {
    }

    public ii(int first, int second) {
      this.first = first;
      this.second = second;
    }

    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      ii ii = (ii) o;

      if (first != ii.first) {
        return false;
      }
      if (second != ii.second) {
        return false;
      }

      return true;
    }

    public int hashCode() {
      int result = first;
      result = 31 * result + second;
      return result;
    }

    public int compareTo(ii o) {
      if (first != o.first) {
        return first < o.first ? -1 : 1;
      }
      if (second != o.second) {
        return second < o.second ? -1 : 1;
      }
      return 0;
    }

    public String toString() {
      return "{" +
          "first=" + first +
          ", second=" + second +
          '}';
    }

  }

  static class OutputWriter {

    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
      writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
      this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
      for (int i = 0; i < objects.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(objects[i]);
      }
    }

    public void printLine(Object... objects) {
      print(objects);
      writer.println();
    }

    public void close() {
      writer.close();
    }

  }

  static class InputReader {

    private InputStream stream;
    private byte[] buffer = new byte[10000];
    private int cur;
    private int count;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public static boolean isSpace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public int read() {
      if (count == -1) {
        throw new InputMismatchException();
      }
      try {
        if (cur >= count) {
          cur = 0;
          count = stream.read(buffer);
          if (count <= 0) {
            return -1;
          }
        }
      } catch (IOException e) {
        throw new InputMismatchException();
      }
      return buffer[cur++];
    }

    public int readSkipSpace() {
      int c;
      do {
        c = read();
      } while (isSpace(c));
      return c;
    }

    public int nextInt() {
      int sgn = 1;
      int c = readSkipSpace();
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res = res * 10 + c - '0';
        c = read();
      } while (!isSpace(c));
      res *= sgn;
      return res;
    }

    public long nextLong() {
      long sgn = 1;
      int c = readSkipSpace();
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      long res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res = res * 10L + (long) (c - '0');
        c = read();
      } while (!isSpace(c));
      res *= sgn;
      return res;
    }

  }
}

