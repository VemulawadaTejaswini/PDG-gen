import java.util.Scanner;
class Main{
  static int N;
  static int[] h;
  static int[] memo;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
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
      int one = (int)1e+5;
      int two = (int)1e+5;

      one = dp(i - 1) + Math.abs(h[i] - h[i - 1]);
      if(i >= 2)
      	two = dp(i - 2) + Math.abs(h[i] - h[i - 2]);

      memo[i] = Math.min(one, two);
    }
    return memo[i];
  }
}