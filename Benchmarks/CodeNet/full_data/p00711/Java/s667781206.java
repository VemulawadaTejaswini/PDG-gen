import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  int H,W;
  int sy,sx;
  int cnt;
  boolean[][] map;
  int[] dy = {-1,0,1,0}, dx = {0,1,0,-1}; 
  public static void main(String[] args) {
    new Main().run();
  }
  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out) ) {

      String[] lines;
      // StringBuilder buf = new StringBuilder();
      while(true) {
        lines = in.readLine().split(" ");
        W = Integer.parseInt(lines[0]);
        H = Integer.parseInt(lines[1]);

        if( W==0 && H==0) break;

        map = new boolean[H][W];

        String line;
        for(int y=0; y<H; y++) {
          char ch;
          line = in.readLine();
          for(int x=0; x<W; x++) {
            ch = line.charAt(x);
            map[y][x] = ch == '#' ? false : true;
            if(ch == '@') {
              sy = y; sx = x;
            }
          }
        }

        cnt = 0;
        dfs(sy,sx);
        // buf.append(cnt).append("\n");
        out.println(cnt);
      }

      // System.out.print(buf);
      out.flush();
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private void dfs(int y, int x) {
    map[y][x] = false;
    cnt++;

    for(int i=0; i<4; i++) {
      int ny = y + dy[i], nx = x + dx[i];
      if(0 <= ny && ny < H && 0 <= nx && nx < W && map[ny][nx]) {
        dfs(ny,nx);
      }
    }
    return;
  }
}
