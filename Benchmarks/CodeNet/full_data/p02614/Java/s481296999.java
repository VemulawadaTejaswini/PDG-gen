import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt(); 
    int W = sc.nextInt(); 
    int K = sc.nextInt(); 
    char grid[][] = new char[H][W];
    for(int i = 0; i<H; i++){
      for(int j = 0; j<W; j++){
      grid[i][j]=sc.next();
    }
    int ans = 0;
    for (int i = 0; i < 1 << H; i++) {
      for(int j = 0; j < 1<<W; j++) {
        int cnt = 0;
        for(int k = 0; k < H; k++) {
          if(((i>>k)&1) == 1) {
            continue;
          }
          for(int l = 0; l < W; l++) {
            if(((j>>l)&1) == 1) {
              continue;
            }
            if(grid[k][l] == '#') {
              cnt++;
            }
          }
        }
        if(cnt == K) {
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}
        