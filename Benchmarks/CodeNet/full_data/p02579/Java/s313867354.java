import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        
        int cy = Integer.parseInt(sc.next())-1;
        int cx = Integer.parseInt(sc.next())-1;
        int dy = Integer.parseInt(sc.next())-1;
        int dx = Integer.parseInt(sc.next())-1;
        
        boolean[][] grd = new boolean[h][w];
        
        for(int i=0; i<h; i++){
            String line = sc.next();
            for(int j=0; j<w; j++){
                char c = line.charAt(j);
                if(c=='#'){
                    grd[i][j] = true;
                }
            }
        }
        
        int[][] memo = new int[h][w];
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                memo[i][j] = (int)1e9;
            }
        }
        memo[cy][cx] = 0;
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addFirst(cy*w + cx);
        while(q.size() != 0){
            int tmp = q.pollFirst();
            int y = tmp/w;
            int x = tmp%w;
            int[] d = {0,1,0,-1};
            for(int i=0; i<4; i++){
                int ny = y+d[i^1];
                int nx = x+d[i];
                if(0<=nx && nx<w && 0<=ny && ny<h){
                    if(!grd[ny][nx]){
                        if(memo[ny][nx] > memo[y][x]){
                            memo[ny][nx] = memo[y][x];
                            q.addFirst(ny*w + nx);
                        }
                    }
                }
            }
            for(int ny=Math.max(0, y-2); ny<=Math.min(h-1, y+2); ny++){
                for(int nx=Math.max(0, x-2); nx<=Math.min(w-1, x+2); nx++){
                    if(!grd[ny][nx]){
                        if(memo[ny][nx] > memo[y][x]+1){
                            memo[ny][nx] = memo[y][x]+1;
                            q.addLast(ny*w + nx);
                        }
                    }
                }
            }
        }
        
        if(memo[dy][dx] != (int)1e9){
            System.out.println(memo[dy][dx]);
        }else{
            System.out.println(-1);
        }
    }
}