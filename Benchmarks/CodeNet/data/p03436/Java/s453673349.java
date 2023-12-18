import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayDeque;

class Point{
    int h;
    int w;
    public Point(int x, int y){
        this.h = x;
        this.w = y;
    }
}

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] s = new char[H][W];
        int white = 0;

        for(int i=0; i<H; i++){
            s[i] = sc.next().toCharArray();
            for(int j=0; j<W; j++){
                if(s[i][j]=='.'){
                    white++;
                }
            }
        }

        int[] dh = {1, 0, -1, 0};
        int[] dw = {0, 1, 0, -1};

        ArrayDeque<Point> que = new ArrayDeque<>();
        que.add(new Point(0, 0));
        boolean[][] memo = new boolean[H][W];
        memo[0][0] = true;
        int[][] d = new int[H][W];
        d[0][0] = 1;
        while(!que.isEmpty()){
            Point p = que.pop();
            for(int i=0; i<4; i++){
                int h = p.h + dh[i];
                int w = p.w + dw[i];
                if(h>=0 && h<H && w>=0 && w<W){
                    if(s[h][w]!='#' && memo[h][w]!=true){
                        que.add(new Point(h, w));
                        memo[h][w] = true;
                        d[h][w] = d[p.h][p.w] + 1;
                    }
                }
            }
        }
        if(!memo[H-1][W-1]){
            System.out.println(-1);
        }
        else{
            System.out.println(white - d[H - 1][W - 1]);
        }
    }
}