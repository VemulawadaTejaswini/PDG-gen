import java.util.*;
import java.util.ArrayDeque;
import java.util.Arrays;

class Point{
    int h;
    int w;
    Point(int h, int w){
        this.h = h;
        this.w = w;
    }
}

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] S = new char[H][W];
        int[] dh = {1, 0, -1, 0};
        int[] dw = {0, 1, 0, -1};

        for(int i=0; i<H; i++){
            S[i] = sc.next().toCharArray();
        }
        int max = 0;
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(S[i][j]=='#'){
                    continue;
                }
                ArrayDeque<Point> que = new ArrayDeque<Point>();
                que.add(new Point(i, j));
                boolean[][] memo = new boolean[H][W];
                memo[i][j] = true;
                int[][] dist = new int[H][W];
                for(int[] x:dist){
                    Arrays.fill(x, 0);
                }
                while(!que.isEmpty()){
                    Point p = que.pop();
                    for(int k=0; k<4; k++){
                        int h = p.h + dh[k];
                        int w = p.w + dw[k];
                        if(h>=0 && h<H && w>=0 && w<W){
                            if(S[h][w]!='#' && !memo[h][w]){
                                que.add(new Point(h, w));
                                memo[h][w] = true;
                                dist[h][w] = dist[p.h][p.w] + 1;
                                max = Math.max(max, dist[h][w]);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}