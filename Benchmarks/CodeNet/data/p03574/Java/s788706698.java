import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        // Scanner sc = new Scanner("3 5\n.....\n.#.#.\n.....");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tmp = line.split(" ");
        int h = Integer.parseInt(tmp[0]);
        int w = Integer.parseInt(tmp[1]);
        char[][] grid = new char[h][w];
        for(int i=0;i<h;i++){
            grid[i] =  sc.nextLine().toCharArray();
        }
        
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(grid[i][j]=='#'){
                    System.out.print('#');
                }else{
                    int cnt = cntBomb(grid, i, j);
                    System.out.print(cnt);
                }
            }
            System.out.println();
        }
    }
    private static int cntBomb(char[][] grid, int i, int j){
        final int[] dx = new int[]{1, 1, 1, 0, 0, -1, -1, -1};
        final int[] dy = new int[]{1, 0, -1, 1, -1, 1, 0, -1};
        int cnt = 0;
        for(int idx=0;idx<8;idx++){
            int ni = i+dx[idx], nj=j+dy[idx];
            if(ni<0 || grid.length<=ni){continue;}
            if(nj<0 || grid[i].length<=nj){continue;}
            if(grid[ni][nj]=='#'){cnt++;}
        }
        return cnt;
    }
}