import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] map = new char[H][W];
    int[][] U = new int[H][W];
    int[][] R = new int[H][W];
    int[][] L = new int[H][W];
    int[][] D = new int[H][W];
    sc.nextLine();
    for(int i=0;i<H;i++){
      map[i] = sc.nextLine().toCharArray();
    }
    for(int i=0;i<H;i++){
      int newi = H-i-1;
      for(int j=0;j<W;j++){
        int newj = W-j-1;
        if(map[i][j]=='.'){
          if(j>0) L[i][j] = L[i][j-1]+1;
          else L[i][j] = 1;
          if(i>0) U[i][j] = U[i-1][j]+1;
          else U[i][j] = 1;
        }else{
          L[i][j] = 0;
          U[i][j] = 0;
        }
        if(map[i][newj] == '.'){
          if(newj<W-1) R[i][newj] = R[i][newj+1]+1;
          else R[i][newj] = 1;
        }else{
          R[i][newj] = 0;
        }
        if(map[newi][j] == '.'){
          if(newi<H-1) D[newi][j] = D[newi+1][j]+1;
          else D[newi][j] = 1;
        }else{
          D[newi][j] = 0;
        }
      }

    }
    int ans = 0;
    for(int i=0;i<H;i++){
      for(int j=0;j<H;j++){
        ans = Math.max(ans, U[i][j]+L[i][j]+D[i][j]+R[i][j]-3);
      }
    }
    System.out.println(ans);
  }
}
