import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int[][] board;
    static boolean [][] vis;
    static int[] dx = new int[]{1,0,-1,0}, dy = new int[]{0,1,0,-1};
    static int H,W;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt(); W = sc.nextInt();
        vis = new boolean[H][W];
        board = new int[H][W];
        for(int i=0;i<H;i++){
            String cur = sc.next();
            for(int j=0;j<W;j++) {
                board[i][j] = cur.charAt(j)=='#'?1:0;
            }
        }
        long ans = 0;
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(vis[i][j]||board[i][j]==0) continue;
                int total =1,white=0;
                for(int k=0;k<4;k++){
                    int r=i+dx[k],c=j+dy[k];
                    if(r>=0&&r<H&&c>=0&&c<W&&!vis[r][c]&&board[i][j]!=board[r][c]){
                        vis[i][j] = true;
                        int[] cur = dfs(i,j,r,c);
                        total += cur[0];
                        white += cur[1];
                    }
                }
                ans += ((long)(total-white))*((long)white);
            }
        }

        System.out.println(ans);
    }
    static int[] dfs(int fromR, int fromC, int row, int col){
        vis[row][col] = true;
        int tot=1;
        int white = 1-board[row][col];
        for(int k=0;k<4;k++){
            int r = row+dx[k], c = col+dy[k];
            if(r==fromR&&c==fromC) continue;
            if(r>=0&&r<H&&c>=0&&c<W&&!vis[r][c]&&board[row][col]!=board[r][c]){
                int[] cur = dfs(row,col,r,c);
                tot += cur[0];white += cur[1];
            }
        }
        return new int[]{tot,white};
    }
}
