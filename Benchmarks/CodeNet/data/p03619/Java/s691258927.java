
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

  private static void solve() {
    int x1 = ni();
    int y1 = ni();
    int x2 = ni();
    int y2 = ni();
    
    int n = ni();
    int[] x = new int[n];
    int[] y = new int[n];
    int m = 0;
    int f1 = 1;
    int f2 = 1;
    if (x1 > x2) {
      f1 = -1;
      x1 = -x1;
      x2 = -x2;
    }
    if (y1 > y2) {
      f2 = -1;
      y1 = -y1;
      y2 = -y2;
    }
    for (int i = 0; i < n; i ++) {
      int nx = f1 * ni();
      int ny = f2 * ni();
      if (x1 <= nx && nx <= x2 && y1 <= ny && ny <= y2) {
        x[m] = nx;
        y[m] = ny;
        m ++;
      }
    }
    x = Arrays.copyOf(x, m);
    y = Arrays.copyOf(y, m);
    Compress cmp = new Compress(y);

    int[][] pos = new int[m + 1][2];
    for (int i = 0; i < m; i ++) {
      pos[i][0] = x[i];
      pos[i][1] = cmp.list[i];
    }
    pos[m][0] = x2;
    pos[m][1] = y2;
    
    Arrays.sort(pos, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
    int ST = 201000;
    SegmentTreeRMQ st = new SegmentTreeRMQ(ST);
    for (int i = 0; i < ST; i ++) st.update(i, 0);
    st.update(pos[m][1], 0);
    for (int i = m - 1; i >= 0; i --) {
      int z = pos[i][1];
      int min = st.min(z, ST);
      st.update(z, min - 1);
    }
    
    int ball = -st.min(0,  201000);
    
    double total = (Math.abs(x1 - x2) + Math.abs(y1 - y2)) * 100;
    double arg1 = 20 - Math.PI * 5;
    double arg2 = Math.PI * 10 - 20;
    
    int lenMin = Math.min(Math.abs(x2 - x1), Math.abs(y1 - y2));
    if (lenMin <= ball - 1) {
      out.printf("%.12f\n", total - arg1 * lenMin + arg2);
    } else {
      out.printf("%.12f\n", total - arg1 * ball);
    }
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = System.getProperty("debug");
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}

class Compress {
  public final Map<Integer, Integer> zip = new HashMap<>();;
  public final long[] unzip;
  public final int[] list;

  public Compress(int[] src) {
      int n = src.length;
      int[] tmp = Arrays.copyOf(src, n);
      Arrays.sort(tmp);

      unzip = new long[n];
      int index = 0;
      for (int i = 0; i < n; i ++) {
        int v = tmp[i];
          if (!zip.containsKey(v)) {
              zip.put(v, index ++);
              unzip[i] = v;
          }
      }

      list = new int[n];
      for (int i = 0; i < n; i ++) {
          list[i] = zip.get(src[i]);
      }
  }
}
class SegmentTreeRMQ {
  public int M, H, N;
  public int[] st;
  
  public SegmentTreeRMQ(int n)
  {
      N = n;
      M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
      H = M>>>1;
      st = new int[M];
      Arrays.fill(st, 0, M, -1);
  }
  
  public SegmentTreeRMQ(int[] a)
  {
      N = a.length;
      M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
      H = M>>>1;
      st = new int[M];
      for(int i = 0;i < N;i++){
          st[H+i] = a[i];
      }
      Arrays.fill(st, H+N, M, Integer.MAX_VALUE);
      for(int i = H-1;i >= 1;i--)propagate(i);
  }
  
  public void update(int pos, int x)
  {
      st[H+pos] = x;
      for(int i = (H+pos)>>>1;i >= 1;i >>>= 1)propagate(i);
  }
  
  private void propagate(int i)
  {
      st[i] = Math.min(st[2*i], st[2*i+1]);
  }
  
  public int minx(int l, int r){
      int min = Integer.MAX_VALUE;
      if(l >= r)return min;
      while(l != 0){
          int f = l&-l;
          if(l+f > r)break;
          int v = st[(H+l)/f];
          if(v < min)min = v;
          l += f;
      }
      
      while(l < r){
          int f = r&-r;
          int v = st[(H+r)/f-1];
          if(v < min)min = v;
          r -= f;
      }
      return min;
  }
  
  public int min(int l, int r){ return l >= r ? 0 : min(l, r, 0, H, 1);}
  
  private int min(int l, int r, int cl, int cr, int cur)
  {
      if(l <= cl && cr <= r){
          return st[cur];
      }else{
          int mid = cl+cr>>>1;
          int ret = Integer.MAX_VALUE;
          if(cl < r && l < mid){
              ret = Math.min(ret, min(l, r, cl, mid, 2*cur));
          }
          if(mid < r && l < cr){
              ret = Math.min(ret, min(l, r, mid, cr, 2*cur+1));
          }
          return ret;
      }
  }
  
  public int firstle(int l, int v) {
      int cur = H+l;
      while(true){
          if(st[cur] <= v){
              if(cur < H){
                  cur = 2*cur;
              }else{
                  return cur-H;
              }
          }else{
              cur++;
              if((cur&cur-1) == 0)return -1;
              if((cur&1)==0)cur>>>=1;
          }
      }
  }
  
  public int lastle(int l, int v) {
      int cur = H+l;
      while(true){
          if(st[cur] <= v){
              if(cur < H){
                  cur = 2*cur+1;
              }else{
                  return cur-H;
              }
          }else{
              if((cur&cur-1) == 0)return -1;
              cur--;
              if((cur&1)==1)cur>>>=1;
          }
      }
  }
}
