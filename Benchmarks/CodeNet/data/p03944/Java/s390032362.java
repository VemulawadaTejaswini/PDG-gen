import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    // 要素数Nの配列x,yと整数aの定義
    int[] x = int[](N);
    int[] y = int[](N);
   	int a;
    // 白い部分の4隅の座標を定義
    int Xr = 0;
    int Xh = W;
    int Yr = 0;
    int Yh = H;
    // N回操作後の白い部分の4隅の座標を代入
    for (int i=1; i<=N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      a = sc.nextInt();
      if (a==1) {
        if (x[i]>Xr) {
          Xr = x[i];
        }
      } else if (a==2) {
        if (x[i]<Xh) {
          Xh = x[i];
        }
      } else if (a==3) {
        if (y[i]>Yr) {
          Yr = y[i];
        }
      } else if (a==4) {
        if (y[i]<Yh) {
          Yh = y[i];
        }
      }
    }
    // 面積の出力
    System.out.println((Xh - Xr) * (Yh - Yr));
  }
}
    
      