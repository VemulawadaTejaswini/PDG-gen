import java.util.*;

class Main {
  public static void main(String[] args) {
    int h, w;
    Scanner sc = new Scanner(System.in);
    h = sc.nextInt();
    w = sc.nextInt();
    String[] grid = new String[h];
    long[][] dp = new long[h+1][w+1];
    int ii = 0;
    while(sc.hasNext()) {
      grid[ii++] = sc.nextLine();
    }
    
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(grid[i].charAt(j) == '.') {
          long val1, val2;
          if(i-1 >= 0)
            val1 = dp[i-1][j];
          if(j-1 >= 0)
            val2 = dp[i][j-1];
          dp[i][j] = val1 + val2;
        }
      }
      
    }
    System.out.println(dp[h-1][w-1]%(10^9 + 7));
 }
}
