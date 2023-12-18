import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main {  
  static int H;
  static int N;
  static int[] A;
  static int[] B;
  static String[] str;
  static int[][] memo;

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      str = br.readLine().split(" ");
      H = Integer.parseInt(str[0]);
      N = Integer.parseInt(str[1]);
      A = new int[N];
      B = new int[N];

      for (int i = 0; i < N; i++) {
        str = br.readLine().split(" ");
        A[i] = Integer.parseInt(str[0]);
        B[i] = Integer.parseInt(str[1]);
      }

      memo = new int[N][10000];
      for (int i = 0; i < N; i++) {
        Arrays.fill(memo[i], -1);
      }
      System.out.println(unko(0, H));
    } 
    catch(IOException e) { 
      e.printStackTrace();
      System.exit(1);
    }
  }
  static int unko(int waza, int hp) {
    if (hp <= 0)return 0;
    if (waza == N) return Integer.MAX_VALUE >> 1;
    if (memo[waza][hp] != -1) return memo[waza][hp];
    return Math.min(unko(waza+1, hp), unko(waza, hp-A[waza])+B[waza]);
  }
}
