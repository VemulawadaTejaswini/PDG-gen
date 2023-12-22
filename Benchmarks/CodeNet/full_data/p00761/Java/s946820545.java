import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    while(true) {
      int[] a = new int[21];
      int L;
      a[0] = cin.nextInt();
      L = cin.nextInt();
      if(a[0] == 0 && L == 0) { // 0 0なら終了
        break;
      }
      for(int i = 0; i < 20; i++) {
        int x = a[i];
        int[] dc = new int[10]; // 各桁の個数のカウンタ
        for(int j = 0; j < L; j++) {
          dc[x % 10]++;
          x /= 10;
        }
        int max = 0, min = 0;
        // 最大値
        for(int j = 9; j >= 0; j--){
          for(int k = 0; k < dc[j]; k++) {
            max = max * 10 + j;
          }
        }
        // 最小値
        for(int j = 0; j <= 9; j++){
          for(int k = 0; k < dc[j]; k++) {
            min = min * 10 + j;
          }
        }
        a[i + 1] = max - min;
      }
loop1:for(int i = 0; i <= 20; i++) {
        for(int j = 0;j < i; j++) {
          if(a[i] == a[j]) {
            System.out.println("" + j + " " + a[i] + " " + (i - j));
            break loop1;
          }
        }
      }
    }
  }
  
}