import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        char s[][] = new char[H][W];
        for(int i = 0; i < H; i++) {
            s[i] = sc.next().toCharArray();
        }
        
        int whiteNum = 0;
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if( s[i][j] == '.' ) {
                    whiteNum++;
                }
            }
        }

        boolean isAchived[][] = new boolean[H][W];
        Deque<Grid> queue = new ArrayDeque<>();
        queue.add( new Grid(1, 0, 0) );
        int minVal = Integer.MAX_VALUE;
        while( !queue.isEmpty() ) {
            Grid grid = queue.poll();
            
            if( grid.i - 1> 0 && s[grid.i - 1][grid.j] == '.' && !isAchived[grid.i - 1][grid.j] ) {
                isAchived[grid.i - 1][grid.j]  = true;
                Grid g = new Grid( grid.val + 1, grid.i - 1, grid.j );
                queue.add(g);
            }
            
            if( grid.j - 1 > 0 && s[grid.i][grid.j - 1] == '.' && !isAchived[grid.i][grid.j - 1] ) {
                isAchived[grid.i][grid.j - 1] = true;
                Grid g = new Grid( grid.val + 1, grid.i, grid.j - 1 );
                queue.add(g);
            }
            
            if( grid.i + 1 < H && s[grid.i + 1][grid.j] == '.' && !isAchived[grid.i + 1][grid.j] ) {
                isAchived[grid.i + 1][grid.j] = true;
                Grid g = new Grid( grid.val + 1, grid.i + 1, grid.j );
                queue.add(g);
            }
            
            if( grid.j + 1 < W && s[grid.i][grid.j + 1] == '.' && !isAchived[grid.i][grid.j + 1] ) {
                isAchived[grid.i][grid.j + 1] = true;
                Grid g = new Grid( grid.val + 1, grid.i, grid.j + 1);
                queue.add(g);
            }
            
            if( grid.i == H - 1 && grid.j == W - 1 ) {
                minVal = Math.min( minVal, grid.val );
            }
        }
        
        if( minVal == Integer.MAX_VALUE ) {
            System.out.println(-1);
        } else {
            System.out.println( whiteNum - minVal );
        }
        
    }
}

class Grid {
    int val;
    int i;
    int j;
    
    public Grid(int val, int i , int j) {
        this.val = val;
        this.i = i;
        this.j = j;
    }
}