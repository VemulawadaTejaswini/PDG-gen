import java.util.*;
import java.io.*;

class Main {
    static int mod = 1000000007;
    public static int solve(char[][] grid, int currentX, int currentY){
        
        if(currentX >= grid.length || currentY >= grid[0].length || grid[currentX][currentY] == '#')
            return 0;
        
        if(currentX == grid.length-1 && currentY == grid[0].length-1)
            return 1;
        
        int right = solve(grid, currentX, currentY+1) % mod;
        int left  = solve(grid, currentX+1, currentY) % mod; 
        return right + left;
    }    

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
    


    public static void iterative(char[][] grid){
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i = 0; i < dp[0].length; i++){
            if(grid[0][i] != '#')
            dp[0][i] = 1;
        }
        for(int i = 0; i < dp.length; i++){
            if(grid[0][i] != '#')
            
            dp[i][0] = 1;
        
        }

        for(int currentX = 1; currentX < grid.length; currentX++){
            for(int currentY = 1; currentY < grid[0].length; currentY++){
                if(grid[currentX][currentY] == '#'){
                    
                    continue;
                }
                
                else if(currentX == grid.length-1 && currentY == grid[0].length-1)
                    dp[currentX][currentY] = 1;

                else {
                int right = dp[currentX][currentY-1] % mod;
                int left  = dp[currentX-1][currentY] % mod;
                dp[currentX][currentY] = right + left;
                }          
            }
        }

        for(int i = 0; i < dp.length; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        
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
        //uncomment for plain recursion
        //System.out.println(solve(grid,0,0));
        
        //with memo
        int[][] memo = new int[grid.length][grid[0].length];
        for(int i  = 0; i < memo.length; i++)
            Arrays.fill(memo[i],-1);

        System.out.println(withMemo(grid,0,0,memo));
        //iterative(grid);
        
        grid = null;
    }    
}


