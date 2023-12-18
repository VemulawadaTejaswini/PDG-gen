import java.io.*;
import java.util.*;

class Solver {
  int n, m, a, b;
  char[][] map;
  
  private void fillB(int i, int j) {
    map[i + 0][j + 0] = '^';
    map[i + 1][j + 0] = 'v';
  }
  
  private void fillA(int i, int j) {
    map[i + 0][j + 0] = '<';
    map[i + 0][j + 1] = '>';
  }
  
  private void fill3x3(int i, int j, int a, int b) {
    if (a == 2 && b == 2) {
      fillA(i, j);
      fillB(i, j + 2);
      fillA(i + 2, j + 1);
      fillB(i + 1, j);
      return;
    }
    
    if (a > 0) {
      a--;
      fillA(i + 2, j);
    }
    if (b > 0) {
      b--;
      fillB(i, j + 2);
    }
    
    if (a == 2) {
      fillA(i + 0, j);
      fillA(i + 1, j);
      return;
    }
    if (a == 1) {
      fillA(i, j);
      return;
    }
    if (b == 2) {
      fillB(i, j + 0);
      fillB(i, j + 1);
      return;
    }
    if (b == 1) {
      fillB(i + 0, j);
      return;
    }
  }
  
  private boolean fillBlock(int n, int m, int a, int b, boolean useLast) {
    for (int i = 0; i + 1 < n; i += 2) {
      for (int j = 0; j + 1 < m; j += 2) {
        if (i + 3 < n || j + 3 < m || useLast) {
          if (a >= 4) {
            a -= 2;
            fillA(i, j);
            fillA(i + 1, j);
          } else if (b >= 4) {
            b -= 2;
            fillB(i, j);
            fillB(i, j + 1);
          } else if (a >= 2) {
            a -= 2;
            fillA(i, j);
            fillA(i + 1, j);
          } else if (b >= 2) {
            b -= 2;
            fillB(i, j);
            fillB(i, j + 1);
          } else if (a > 0) {
            a--;
            fillA(i, j);
          } else if (b > 0) {
            b--;
            fillB(i, j);
          }
        }
      }
    }
    return a == 0 && b == 0;
  }
  
  public char[][] solve(int n, int m, int a, int b) {
    this.n = n;
    this.m = m;
    this.a = a;
    this.b = b;
    
    if (n * m < 2 * (a + b)) {
      return null;
    }
    
    map = new char[n][m];
    for (char[] line : map) {
      Arrays.fill(line, '.');
    }
    
    if (n % 2 == 1 && m % 2 == 1) {
      for (int j = 0; j < m - 3; j += 2) {
        if (b > 0) {
          b--;
          fillB(n - 1, j);
        }
      }
      for (int i = 0; i < n - 3; i += 2) {
        if (a > 0) {
          a--;
          fillA(i, m - 1);
        }
      }
      fillBlock(n, m, a, b, false);
      if (a >= 4 || b >= 4) {
        return null;
      }
      fill3x3(n - 3, m - 3, a, b);
      return map;
      
    } else if (n % 2 == 1) {
      for (int j = 0; j < m; j += 2) {
        if (b > 0) {
          a--;
          fillA(n - 1, j);
        }
      }
      return fillBlock(n, m, a, b, true) ? map : null;
    } else if (m % 2 == 1) {
      for (int i = 0; i < n; i += 2) {
        if (b > 0) {
          b--;
          fillB(i, m - 1);
        }
      }
      return fillBlock(n, m, a, b, true) ? map : null;
    } else {
      return fillBlock(n, m, a, b, true) ? map : null;
    }
  }
}

public class Main {
  
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int a = reader.nextInt();
    int b = reader.nextInt();
    char[][] map = new Solver().solve(n, m, a, b);
    if (map == null) {
      out.println("NO");
      return;
    }
    out.println("YES");
    for (char[] line : map) {
      out.println(line);
    }
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

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
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
}

class Algorithm {
  private static void swap(Object[] list, int a, int b) {
    Object tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }
  
  public static <T extends Comparable<? super T>> boolean nextPermutation(T[] ts) {
    int rightMostAscendingOrderIndex = ts.length - 2;
    while (rightMostAscendingOrderIndex >= 0 &&
        ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]) >= 0) {
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
    while (ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]) >= 0) {
      rightMostGreatorIndex--;
    }
    
    swap(ts, rightMostAscendingOrderIndex, rightMostGreatorIndex);
    for (int i = 0; i < (ts.length - rightMostAscendingOrderIndex - 1) / 2; i++) {
      swap(ts, rightMostAscendingOrderIndex + 1 + i, ts.length - 1 - i);
    }
    return true;
  }
}

