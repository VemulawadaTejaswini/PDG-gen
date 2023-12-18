import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    // dp1[i][j]はカード0～iで総和をjに出来るかを表す
    int[][] dp1 = new int[N][K];
    dp1[0][0] = 1;
    if(a[0] < K) dp1[0][a[0]] = 1;
    for(int i = 1; i < N; i++) {
      for(int j = 0; j < K; j++) {
        if(a[i] <= j) {
          if((dp1[i - 1][j] == 1) || (dp1[i - 1][j - a[i]] == 1)) dp1[i][j] = 1;
        } else {
          dp1[i][j] = dp1[i - 1][j];
        }
      }
    }

    // dp2[i][j]はカードi～N-1までで総和0～jの内、何個達成出来るかを表す
    int[][] dp2 = new int[N][K];
    for(int j = 0; j < K; j++) {
      if(a[N - 1] < K) {
        if(j < a[N - 1]) {
          dp2[N - 1][j] = 1;
        } else {
          dp2[N - 1][j] = 2;
        }
      } else {
        dp2[N - 1][j] = 1;
      }
    } 

    int nec = 0;
    for(int i = 0; i < N; i++) {
      boolean flg = false;
      if(a[i] >= K) {
        flg = true;
      } else {
        if(i == 0) {
          if((dp2[1][K - 1] - dp2[1][K - a[i] - 1]) > 0) flg = true;
        } else if(i == N - 1) {
          for(int j = K - a[i]; j < K; j++) {
            if(dp1[i - 1][j] == 1) {
              flg = true;
              break;
            }
          }
        } else {
          for(int j = 0; j < K; j++) {
            if(K - a[i] - j - 1 >= 0) {
              if((dp1[i - 1][j] == 1) && (dp2[i + 1][K - j - 1] > dp2[i + 1][K - a[i] - j - 1])) {
                flg = true;
                break;
              }
            } else {
              if((dp1[i - 1][j] == 1) && (dp2[i + 1][K - j - 1] > 0)) {
                flg = true;
                break;
              }
            }
          }
        }
      }
      if(flg) nec++;
    }
    System.out.println(N - nec);
  }
}
