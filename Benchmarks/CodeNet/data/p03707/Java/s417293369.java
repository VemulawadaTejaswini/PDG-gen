import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //height
    int M = sc.nextInt(); //width
    int Q = sc.nextInt(); sc.nextLine();//query

    char[][] grid = new char[N][M];
    for(int i = 0; i < N; i++) {
      String line = sc.nextLine();
      grid[i] = line.toCharArray();
    }

    for(int i = 0; i < Q; i++) {
      int sx = sc.nextInt(); int sy = sc.nextInt();
      int tx = sc.nextInt(); int ty = sc.nextInt(); sc.nextLine();

      int island_count = 0;
      int border_count = 0;

      for(int a = sx-1; a < tx; a++) {
        for(int b = sy-1; b < ty; b++) {
          if(grid[a][b] == '1') {
            island_count++;
            int X = a-sx+1;
            int Y = b-sy+1;

            if(a != tx-1) { if(grid[a+1][b] == '1') {
              border_count++;
            }}
            if(b != ty-1) { if(grid[a][b+1] == '1') {
              border_count++;
            }}
          }
        }
      }
      System.out.println(island_count - border_count);
    }
  }
}