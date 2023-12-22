import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int startx = sc.nextInt();
        int starty = sc.nextInt();
        int endx = sc.nextInt();
        int endy = sc.nextInt();
        char[][] grid = new char[h][w];
        
        for(int i = 0; i<h; i++) {
          String row = sc.next();
          for(int j = 0; j<w; j++) {
            grid[i][j] = row.charAt(j);
          }
        }
        
        int out = 0;

        // update to zero index
        startx--;
        starty--;
        endx--;
        endy--;
        
        // dfs from start - when we reach target set result to number of hops
        Integer[][] memo = new Integer[h][w];
        Integer output = dfs(startx, starty, endx, endy,grid, new HashSet<>(), 0, memo);
        
        System.out.println(output);
        
    }

    private static Integer dfs(int startx, int starty, int endx, int endy,char[][] grid, Set<String> visited, int magicSoFar, Integer[][] memo) {
      if(startx == endx && starty == endy) {
        return magicSoFar;
      }
      
      if(memo[startx][starty] != null) {
        return memo[startx][starty];
      }
      
      int output = Integer.MAX_VALUE;
      
      int h = grid.length;
      int w = grid[0].length;
      
      visited.add(Arrays.toString(new int[] {startx, starty}));
      
      //non magic directions
      int[][] nonmagicdirs = {{0,1},{0,-1},{1,0},{-1,0}}; 
      for(int[] dir : nonmagicdirs) {
        int nextx = startx+dir[0];
        int nexty = starty+dir[1];
        if(nextx <0 || nexty<0 || nextx>=h || nexty >= w) continue;
        
        String nextStep = Arrays.toString(new int[] {nextx, nexty});
        if(grid[nextx][nexty] == '#'||visited.contains(nextStep)) continue;
        
        int out1 = dfs(nextx, nexty, endx, endy, grid, visited, magicSoFar, memo);
        if(out1 != -1)
          output = Math.min(output,  out1);
      }
      
      //magic directions
      for(int i = -2; i<=2; i++) {
        for(int j = -2; j<=2; j++) {
          if(i==0 && Math.abs(j)<2) continue;
          if(j==0 && Math.abs(i)<2) continue;

          int nextx = startx+i;
          int nexty = starty+j;
          if(nextx <0 || nexty<0 || nextx>=h || nexty >= w) continue;
          
          String nextStep = Arrays.toString(new int[] {nextx, nexty});
          if(grid[nextx][nexty] == '#'||visited.contains(nextStep)) continue;
          
          int out2 = dfs(nextx, nexty, endx, endy, grid, visited, magicSoFar+1, memo);
          if(out2 != -1)
            output = Math.min(output,  out2);
        }
      }
      
      
      visited.remove(Arrays.toString(new int[] {startx, starty}));
      
      if(output == Integer.MAX_VALUE) {
        output = -1;
      }
      
      memo[startx][starty] = output;
      return output;
      
    }
}