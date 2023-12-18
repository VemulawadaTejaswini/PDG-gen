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
      int sx = sc.nextInt();
      int sy = sc.nextInt();
      int tx = sc.nextInt();
      int ty = sc.nextInt(); sc.nextLine();

      int count = 0;
      int dis_count = 0;
      int[][] check = new int[tx][ty];
      for(int a = sx-1; a < tx; a++) {
        for(int b = sy-1; b < ty; b++) {

          if(grid[a][b] == '1' && check[a][b] == 0) {
            count++;
            check[a][b] = count;
            if(a != tx-1) { if(grid[a+1][b] == '1') {
              check[a+1][b] = count;
            }}
            if(b != ty-1) { if(grid[a][b+1] == '1') {
              if(check[a][b+1] != 0 && check[a][b+1] != count) {
                dis_count++;
              }
              check[a][b+1] = count;
            }}
          } else if(grid[a][b] == '1') {
            int tmp = check[a][b];
            if(a != tx-1) { if(grid[a+1][b] == '1') {
              check[a+1][b] = tmp;
            }}
            if(b != ty-1) { if(grid[a][b+1] == '1') {
              if(check[a][b+1] != 0 && check[a][b+1] != tmp) {
                dis_count++;
              }
              check[a][b+1] = tmp;
            }}
          }
        }
      }

      System.out.println(count - dis_count);
    }
  }
}
