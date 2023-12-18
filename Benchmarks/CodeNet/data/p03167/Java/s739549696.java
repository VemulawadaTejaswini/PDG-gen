import java.util.*;
import java.io.*;

class Main {
    static int mod = 1000000007;
    public static int withMemo(char[][] grid, int currentX, int currentY, int[][] memo){
        
        if(currentX >= grid.length || currentY >= grid[0].length || grid[currentX][currentY] == '#')
            return 0;
        if(memo[currentX][currentY] > -1){
            return memo[currentX][currentY];
        }
        if(currentX == grid.length-1 && currentY == grid[0].length-1)
            return 1;
        
        int right = withMemo(grid, currentX, currentY+1, memo) ;
        int left  = withMemo(grid, currentX+1, currentY, memo) ; 
        return memo[currentX][currentY] = (right + left) % mod;
    }    
    


     
    


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int rows = 0;
        int col = 0;

        while(str.hasMoreTokens()){
            rows = Integer.parseInt(str.nextToken());
            col = Integer.parseInt(str.nextToken());
        }

        char[][] grid = new char[rows][col];

        for(int i = 0; i < rows; i++){
            //read the string
            String[] a = br.readLine().split("");
            for(int j = 0; j < a.length; j++){
                grid[i][j] = a[j].charAt(0);
            }
        }
        
        int[][] memo = new int[grid.length][grid[0].length];
        for(int i  = 0; i < memo.length; i++)
            Arrays.fill(memo[i],-1);

        System.out.println(withMemo(grid,0,0,memo));
     
    }    
}
