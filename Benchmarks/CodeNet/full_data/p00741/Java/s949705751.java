import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      StringBuffer buf = new StringBuffer();
      while(true) {
        Container target = new Container();
        String[] lines = in.readLine().split(" ");
        target.w = Integer.parseInt(lines[0]);
        target.h = Integer.parseInt(lines[1]);

        if(target.h == 0 && target.w == 0) break;

        target.createTable();

        String line;
        for(int i=0; i<target.h; i++) {
          line = in.readLine();
          for(int j=0; j<target.w; j++) {
            target.table[i][j] = line.charAt(j<<1) == '1' ? true : false;
          }
        }

        int ans = solve(target);
        buf.append(ans).append("\n");
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private int solve(Container t) {
    int ret = 0;

    for(int y=0; y<t.h; y++) {
      for(int x=0; x<t.w; x++) {
        if(t.table[y][x]) {
          dfs(t, x,y);
          ret++;
        }
      }
    }

    return ret;
  }

  private void dfs(Container t, int x, int y) {
    t.table[y][x] =false;

    for(int dy=-1; dy<=1; dy++) {
      for(int dx=-1; dx<=1; dx++) {
        int ny = y + dy, nx = x + dx;
        if(0<=ny && ny<t.h && 0<=nx && nx<t.w && t.table[ny][nx])
          dfs(t, nx, ny);
      }
    }
    return;
  }
}

class Container {
  int h;
  int w;
  boolean[][] table;

  public void createTable() {
    table = new boolean[h][w];
  }
}
