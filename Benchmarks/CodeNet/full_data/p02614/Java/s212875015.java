import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    int ans = 0;
    int[][] c = new int[h][w];
    for(int i = 0; i < h; i++) {
      String s = sc.next();
      for(int j = 0; j < w; j++) {
        if(s.charAt(j) == '#') c[i][j] = 1;
      }
    }
    for(int i = 0; i < (int)Math.pow(2, h); i++) {
      for(int j = 0; j < (int)Math.pow(2, w); j++) {
        int t = 0;
        for(int a = 0; a < h; a++) {
          for(int b = 0; b < w; b++) {
            if((c[a][b] == 1) && ((i & (1 << a)) == 0) && ((j & (1 << b)) == 0)) t++;
          }
        }
        if(t == k) ans++; 
      }
    }
    System.out.println(ans);
  }
}
