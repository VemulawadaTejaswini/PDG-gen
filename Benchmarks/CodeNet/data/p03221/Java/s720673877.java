import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = in.nextInt();
    int m = in.nextInt();

    ArrayList<City>[] prefectures = (ArrayList<City>[]) new ArrayList[n];
    for (int i = 0; i < n; i++)
      prefectures[i] = new ArrayList<>();

    City[] cities = new City[m];

    for (int i = 0; i < m; i++) {
      cities[i] = new City(in.nextInt(), in.nextInt());
      prefectures[cities[i].prefecture - 1].add(cities[i]);
    }

    for (int i = 0; i < n; i++) {
      prefectures[i].sort(City::compareTo);
      int j = 1;
      for (City c : prefectures[i]) {
        String v = String.valueOf(j);
        for (int k = v.length(); k < 6; k++)
          c.id.append(0);
        c.id.append(v);
        j++;
      }
    }

    Arrays.stream(cities).forEach(c -> out.println(c.id));

    out.close();
  }

  static class City implements Comparable<City>, Comparator<City> {
    int prefecture;
    int year;
    StringBuilder id;

    City(int prefecture, int year){
      this.prefecture = prefecture;
      this.year = year;
      id = new StringBuilder();
      String v = String.valueOf(prefecture);
      for (int k = v.length(); k < 6; k++)
        id.append(0);
      id.append(v);
    }

    @Override
    public int compareTo(City other) {
      return Integer.compare(year, other.year);
    }

    @Override
    public int compare(City o1, City o2) {
      return o1.compareTo(o2);
    }
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

  static void print(int[] arr) {
    Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    System.out.println();
  }

  public static int[] mergeSort(int[] a) {
    if (a.length <= 1)
      return a;

    int mid = a.length / 2;
    int[] left = new int[mid];
    int[] right = new int[a.length - mid];

    for (int i = 0; i < mid; ++i)
      left[i] = a[i];

    for (int i = mid; i < a.length; ++i)
      right[i - mid] = a[i];

    return merge(mergeSort(left), mergeSort(right));
  }

  public static int[] merge (int[] l, int[] r) {
    int[] merged = new int[l.length + r.length];

    int i = 0, j = 0, k = 0;
    while (i < l.length && j < r.length) {
      if (l[i] <= r[j])
        merged[k++] = l[i++];
      else
        merged[k++] = r[j++];
    }

    while (i < l.length)
      merged[k++] = l[i++];
    while (j < r.length)
      merged[k++] = r[j++];

    return merged;
  }

}

