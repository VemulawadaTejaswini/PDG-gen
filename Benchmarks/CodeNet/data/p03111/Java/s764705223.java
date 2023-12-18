import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

  static int n;
  static int a;
  static int b;
  static int c;
  static int[] l;

  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);

    n = in.nextInt();
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    l = new int[n];

    for (int i = 0; i < n; i++)
      l[i] = in.nextInt();

    Pair<Integer, HashSet<Integer>> p1 = findMin(0, new Stack<>(), a, new HashSet<>());
    Pair<Integer, HashSet<Integer>> p2 = findMin(0, new Stack<>(), b, p1.getValue());
    p2.getValue().addAll(p1.getValue());
    Pair<Integer, HashSet<Integer>> p3 = findMin(0, new Stack<>(), c, p2.getValue());
    int res = p1.getKey() + p2.getKey() + p3.getKey();

    p1 = findMin(0, new Stack<>(), a, new HashSet<>());
    p2 = findMin(0, new Stack<>(), c, p1.getValue());
    p2.getValue().addAll(p1.getValue());
    p3 = findMin(0, new Stack<>(), b, p2.getValue());
    res = Math.min(res, p1.getKey() + p2.getKey() + p3.getKey());

    p1 = findMin(0, new Stack<>(), b, new HashSet<>());
    p2 = findMin(0, new Stack<>(), a, p1.getValue());
    p2.getValue().addAll(p1.getValue());
    p3 = findMin(0, new Stack<>(), c, p2.getValue());
    res = Math.min(res, p1.getKey() + p2.getKey() + p3.getKey());

    p1 = findMin(0, new Stack<>(), b, new HashSet<>());
    p2 = findMin(0, new Stack<>(), c, p1.getValue());
    p2.getValue().addAll(p1.getValue());
    p3 = findMin(0, new Stack<>(), a, p2.getValue());
    res = Math.min(res, p1.getKey() + p2.getKey() + p3.getKey());

    p1 = findMin(0, new Stack<>(), c, new HashSet<>());
    p2 = findMin(0, new Stack<>(), a, p1.getValue());
    p2.getValue().addAll(p1.getValue());
    p3 = findMin(0, new Stack<>(), b, p2.getValue());
    res = Math.min(res, p1.getKey() + p2.getKey() + p3.getKey());

    p1 = findMin(0, new Stack<>(), c, new HashSet<>());
    p2 = findMin(0, new Stack<>(), b, p1.getValue());
    p2.getValue().addAll(p1.getValue());
    p3 = findMin(0, new Stack<>(), a, p2.getValue());
    res = Math.min(res, p1.getKey() + p2.getKey() + p3.getKey());

    out.println(res);

    out.close();
  }

  static Pair<Integer, HashSet<Integer>> findMin(int i, Stack<Integer> path, int v, HashSet<Integer> used) {
    if (i == n) {
      if (path.isEmpty())
        return new Pair<>(Integer.MAX_VALUE, new HashSet<>());
      int cost = -10;
      int sum = 0;
      for (int j : path) {
        cost += 10;
        sum += j;
      }
      return new Pair<>(Math.abs(v - sum) + cost, new HashSet<>(path));
    }

    Pair<Integer, HashSet<Integer>> res = findMin(i + 1, path, v, used);
    Pair<Integer, HashSet<Integer>> res2 = new Pair<>(Integer.MAX_VALUE, null);
    if (!used.contains(l[i])) {
      path.push(l[i]);
      res2 = findMin(i + 1, path, v, used);
      path.pop();
    }
    return (res.getKey() <= res2.getKey()) ? res : res2;
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

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }
  }

  static class Pair<A, B> {
    A key;
    B value;

    Pair(A key, B value) {
      this.key = key;
      this.value = value;
    }

    A getKey() {
      return key;
    }

    B getValue() {
      return value;
    }
  }

  static int min3(int a, int b, int c) {return Math.min(a, Math.min(b, c));}
  static double min3(double a, double b, double c) {return Math.min(a, Math.min(b, c));}
  static long min3(long a, long b, long c) {return Math.min(a, Math.min(b, c));}

  static int min4(int a, int b, int c, int d) {return Math.min(Math.min(a, b), Math.min(c, d));}
  static double min4(double a, double b, double c, double d) {return Math.min(Math.min(a, b), Math.min(c, d));}
  static long min4(long a, long b, long c, long d) {return Math.min(Math.min(a, b), Math.min(c, d));}

  static int max3(int a, int b, int c) {return Math.max(a, Math.max(b, c));}
  static double max3(double a, double b, double c) {return Math.max(a, Math.max(b, c));}
  static long max3(long a, long b, long c) {return Math.max(a, Math.max(b, c));}

  static int max4(int a, int b, int c, int d) {return Math.max(Math.max(a, b), Math.max(c, d));}
  static double max4(double a, double b, double c, double d) {return Math.max(Math.max(a, b), Math.max(c, d));}
  static long max4(long a, long b, long c, long d) {return Math.max(Math.max(a, b), Math.max(c, d));}

}

