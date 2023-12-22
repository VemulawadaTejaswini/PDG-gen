import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args) throws IOException {
    PrintWriter out = new PrintWriter(System.out);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st  = new StringTokenizer(br.readLine());

    int h = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int [][] targets = new int[h][w];
    int[] rows = new int[h];
    int[] cols = new int[w];
    int rowBest = 0, colBest = 0;
    for (int i=0; i<m; i++) {
      st  = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken())-1;
      int b = Integer.parseInt(st.nextToken())-1;
      rows[a]++;
      cols[b]++;
      targets[a][b]=1;
      rowBest = Math.max(rowBest, rows[a]);
      colBest = Math.max(colBest, cols[a]);
    }

    List<Integer> rs = new ArrayList();
    List<Integer> cs = new ArrayList();

    for (int i=0; i<h; i++) {
      if (rows[i]==rowBest) {
        rs.add(i);
      }
    }

    for (int i=0; i<w; i++) {
      if (cols[i]==colBest) {
        cs.add(i);
      }
    }
    if ((rowBest==1 && colBest==0) || (rowBest==0 && colBest==1)) {
      out.println(1);
    }
    else {
      int ans = colBest+rowBest-1;
      boolean flag = false;
      for (int rr: rs) {
        for (int cc: cs) {
          if (targets[rr][cc]==0) {
            ans++;
            flag = true;
            break;
          }
        }
        if (flag) {
          break;
        }
      }

      out.println(ans);
    }

    out.close();
  }

}








