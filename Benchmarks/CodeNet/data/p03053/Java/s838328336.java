import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      int H = Integer.parseInt(lines[0]);
      int W = Integer.parseInt(lines[1]);
      int N = H * W;

      int size = 0;
      int[][] arr = new int[H][W];
      for (int i = 0; i < H; i++) {
        Arrays.fill(arr[i], N);
        String line = in.readLine();
        for (int j = 0; j < W; j++) {
          if (line.charAt(j) == '#') {
            arr[i][j] = 0;
            size += 1;
          }
        }
      }

      int[] dy = { 1, 0,-1, 0};
      int[] dx = { 0, 1, 0,-1};
      int cnt = 0;
      int d = 0;
      while(size < N) {
        for(int i=0; i < H; i++) {
          for (int j = 0; j < W; j++) {
            if(arr[i][j] == d) {
              for (int k = 0; k < 4; k++) {
                int y = i + dy[k];
                int x = j + dx[k];
                if(0 <= y && y < H && 0 <= x && x < W && arr[y][x] == N) {
                  arr[y][x] = d + 1;
                  size += 1;
                }
              }
            }
          }
        }
        d += 1;
        cnt += 1;
      }
      System.out.println(cnt);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}