import java.io.*;
import java.util.*;

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
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

class Solver {
  int h;
  int w;
  char[][] map;
  HashMap<Integer, Integer> dptable;
  
  private int pack(int hMin, int hMax, int wMin, int wMax) {
    return
      (hMin << 24) |
      (hMax << 16) |
      (wMin << 8) |
      wMax;
  }
  
  private int getHMin(int num) {
    return (num >> 24) & 0xFF;
  }
  
  private int getHMax(int num) {
    return (num >> 16) & 0xFF;
  }
  
  private int getWMin(int num) {
    return (num >> 8) & 0xFF;
  }
  
  private int getWMax(int num) {
    return num & 0xFF;
  }
  
  private boolean same(int hMin, int hMax, int wMin, int wMax) {
    for (int i = hMin; i < hMax; i++) {
      for (int j = wMin; j < wMax; j++) {
        if (map[hMin][wMin] != map[i][j]) {
          return false;
        }
      }
    }
    return true;
  }
  
  private ArrayList<Integer> splitOrder(int min, int max) {
    ArrayList<Integer> output = new ArrayList<Integer>();
    if (max - min <= 1) {
      return output;
    }
    int mid = (max + min) / 2;
    output.add(mid);
    
    for (int i = 1; true; i++) {
      boolean exit = true;
      if (mid + i < max) {
        output.add(mid + i);
        exit = false;
      }
      if (mid - i > min) {
        output.add(mid - i);
        exit = false;
      }
      if (exit) {
        return output;
      }
    }
  }
  
  private int solveDfs(int hMin, int hMax, int wMin, int wMax) {
    int packIndex = pack(hMin, hMax, wMin, wMax);
    Integer cacheValue = dptable.get(packIndex);
    if (cacheValue != null) {
      return cacheValue;
    }
    if (same(hMin, hMax, wMin, wMax)) {
      dptable.put(packIndex, 0);
      return 0;
    }
    int minValue = Integer.MAX_VALUE;
    for (int hSplit : splitOrder(hMin, hMax)) {
      int v1 = solveDfs(hMin, hSplit, wMin, wMax);
      if (v1 + 1 >= minValue) {
        continue;
      }
      int v2 = solveDfs(hSplit, hMax, wMin, wMax);
      minValue = Math.min(minValue, Math.max(v1, v2) + 1);
    }
    for (int wSplit : splitOrder(wMin, wMax)) {
      int v1 = solveDfs(hMin, hMax, wMin, wSplit);
      if (v1 + 1 >= minValue) {
        continue;
      }
      int v2 = solveDfs(hMin, hMax, wSplit, wMax);
      minValue = Math.min(minValue, Math.max(v1, v2) + 1);
    }
    dptable.put(packIndex, minValue);
    return minValue;
  }
  
  
  public int solve(int h, int w, char[][] map) {
    this.h = h;
    this.w = w;
    this.map = map;
    this.dptable = new HashMap<>();
    
    return solveDfs(0, h, 0, w);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    
    char[][] map = new char[h][];
    for (int i = 0; i < h; i++) {
      map[i] = reader.next().toCharArray();
    }
    
    System.out.println(new Solver().solve(h, w, map));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

