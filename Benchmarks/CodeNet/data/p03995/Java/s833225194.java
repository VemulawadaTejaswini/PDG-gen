import java.io.*;
import java.util.*;

public class Main {
    public static final int p = (int)1e9+7;
    public static final int di[] = new int[]{1, -1, 1, -1};
    public static final int dj[] = new int[]{1, -1, -1, 1};
    public static class Cell {

      int i, j;
      public Cell(int _i, int _j) {
        i = _i ; j = _j ; 
      }
      public int hashCode() {
        return i*p + j;
      }
      public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Cell)) return false;

        Cell that = (Cell)o;
        if (i != that.i || j != that.j) return false;
        return true;
      }
    }

    public Long canPlace(Cell x, HashMap<Cell, Long> all) {
      Long xval = null;

      for (int k = 0 ; k < 4; k ++) {
        int ni = x.i + di[k], nj = x.j + dj[k];
        Cell n = new Cell(ni, nj);
        if (!checkCell(n)) continue;
        Cell f1 = new Cell(x.i, nj), f2 = new Cell(x.j, ni);
        if (!all.containsKey(f1) || !all.containsKey(f2) || !all.containsKey(n)) {
          // can't deduce cell
          continue;
        }
        long candidateVal = all.get(f1) + all.get(f2) - all.get(n);
        if (candidateVal < 0) return null;
        if (xval == null) xval = candidateVal;
        else if (xval != candidateVal) return null;
      }
      return Long.MIN_VALUE;
    }
    int rows, cols;
    public boolean checkCell(Cell x) {
      return x.i >= 1 && x.j >= 1 && x.i <= rows && x.j <= cols;
    }
    public void finish(int status) {
      if (status == 0) out.println("No");
      else out.println("Yes");
      out.close();
      System.exit(0);
    }
    public void solve() throws IOException {
      int rows = nextInt(), cols = nextInt();
      this.rows = rows; this.cols = cols;
      int n = nextInt();
      HashMap<Cell, Long> all = new HashMap<>();
      Queue<Cell> q = new LinkedList<>();
      for (int i = 0 ; i < n ; i ++) {
        Cell x = new Cell(nextInt(), nextInt());
        all.put(x, nextLong());
        q.add(x);
      }
      
      while (!q.isEmpty()) {
        Cell f = q.poll();
        int i = f.i, j = f.j;
        //System.out.println("getting " + i + " " + j);
        for (int di = -1; di <= 1 ; di ++) {
          for (int dj = -1; dj <= 1 ; dj ++) {
            if (di == 0 && dj == 0) continue;
            int ni = i + di, nj = j + dj;
            //System.out.println("checking " + ni + " " + nj);
            Cell c = new Cell(ni, nj);
            if (!checkCell(c)) continue;
            if (all.containsKey(c)) {
              // just check that c is well-placed
              long expectedVal = all.get(c);
              Long cval = canPlace(c, all);
              //System.out.println("canplace " + cval);
              if (cval == null) finish(0);
              if (cval == Long.MIN_VALUE) continue;
              if (cval != expectedVal) finish(0);
              continue;
            }
            // try to put cell c
            Long cval = canPlace(c, all);
            //System.out.println("canplace " + cval);
            if (cval == null) finish(0);
            if (cval == Long.MIN_VALUE) continue; // can't really determine value for c
            all.put(c, cval);
            q.add(c);
          }
        }
      }
      
      
      finish(1);
      
    }

    

    
    
    BufferedReader bf;
    StringTokenizer st;
    PrintWriter out;
    
    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) 
            st = new StringTokenizer(bf.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    
    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public Main() throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));      
        solve();
        bf.close();
        out.close();
    }
    
    public static void main(String args[]) throws IOException {
        new Main();
    }
}