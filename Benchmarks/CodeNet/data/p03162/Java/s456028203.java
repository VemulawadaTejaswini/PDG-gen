import java.io.*;
import java.util.*;

class Main {
  static final Scanner in = new Scanner(System.in);
  static int N, K;

  static int[] a,b,c;
  // static int dp[][];
  static int dp[][];
  static final int MOD = 1000000007;
  static int[] pre;
  static char[][] t;
  static char[] s;
  static Set<Character> set;

  public static void main(String[] args) throws Exception {
    N = in.nextInt();
    a = new int[N];
    b = new int[N];
    c = new int[N];
    dp = new int[N][3];
    for(int i = 0;i < N;i++){
      a[i] = in.nextInt();
      b[i] = in.nextInt();
      c[i] = in.nextInt();
      Arrays.fill(dp[i],-1);
    }

    int ans = Math.max(F(N-1,0),F(N-1,1));
    ans = Math.max(ans,F(N-1,2));

    System.out.println(ans);
    
  }

  static int F(int i,int jobType){
    
    if(i < 0)
      return 0;

      if(dp[i][jobType] != -1)
        return dp[i][jobType];

    int bugs = 0;
    int swim = 0;
    int homework = 0;

    if(jobType == 0){
      bugs = F(i-1,1) + a[i];
      homework = F(i-1,2) + a[i];
    }

    if(jobType == 1){
      homework = F(i-1,2) + b[i];
      swim = F(i-1,0) + b[i];
    }

    if(jobType == 2){
      swim = F(i-1,0) + c[i];
      bugs = F(i-1,1) + c[i];
    }

    int max = Math.max(swim,bugs);
    max = Math.max(max,homework);

    dp[i][jobType] = max;
    return dp[i][jobType];
  
  }

  static int finalise(int k,boolean flag,int count){
    if(flag){
      return 1 + (s.length - count);
    }
    return 1 + s.length + count;
  }

  static void print() {
    System.out.println("t--> ");
    for (int i = 0; i < t.length; i++) {
      for (int j = 0; j < t[i].length; j++) {
        System.out.print(t[i][j]);
      }
      System.out.print(" ");
    }
    System.out.println();
    System.out.println("s--> ");
    for (int i = 0; i < s.length; i++) System.out.print(s[i]);
    System.out.println();

    System.out.println("set --> " + set);
  }
}

/**
 experience was ultimate
ew
 */

 /**
  supreme court is the highest judicial court
  su
  */
