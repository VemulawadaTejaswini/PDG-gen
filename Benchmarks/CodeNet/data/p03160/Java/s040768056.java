class Frog {
  
  int[] stones;
  
  public static void main(String[] args) {
    Frog frog = new Frog();
    frog.solve(stones);
  }
  
  private int cost(i, j) {
    return Math.abs(stones[i] - stones[j]);
  }
  
  public void solve(int[] stones) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    stones = new int[n];
    
    for (int i = 0; i < n; i++) {
      stones[i] = sc.nextInt();
    }
    
    int[] dp = new int[n];
    
    dp[n-1] = 0;
    dp[n-2] = cost(n-2, n-1);
    for (int i = N - 3; i >= 0; i--) {
      dp[i] = Math.min(dp[i+1] + cost(i, i+1), dp[i+2]+cost(i, i+2));
    }
    System.out.println(dp[0]);
  }
}

   	