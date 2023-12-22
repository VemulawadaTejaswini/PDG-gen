// 標準入力から2次元配列
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
      int cnt=0;

        int[][] table = new int[n][2];
        for (int i = 0; i < n; i++) {
          int a=0;
            for (int j = 0; j < 2; j++) {
                table[i][j] = sc.nextInt();
              a = a + table[i][j] * table[i][j];
            }
          if(Math.sqrt(a)>=m){
            cnt++;
          }
        }
      
      System.out.print(cnt);
    }
}