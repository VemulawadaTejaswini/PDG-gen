import java.util.Scanner;
class Main{
  static int N;
  static int K;
  static int[] h;
  static int[] memo;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    K = sc.nextInt();
    h = new int[N];
    memo = new int[N];

    for(int i = 0; i < N; i++){
      h[i] = sc.nextInt();
      memo[i] = -1;
    }
    memo[0] = 0;
    System.out.println(dp(N - 1));
  }

  static int dp(int i){
    if(memo[i] == -1){
      int min = (int)1e9;
      for(int n = 1; n <= K && n <= i; n++){
        int tmp = dp(i - n) + Math.abs(h[i] - h[i - n]);
        if(tmp < min)
          min = tmp;
      }
      memo[i] = min;
    }
    return memo[i];
  }
}