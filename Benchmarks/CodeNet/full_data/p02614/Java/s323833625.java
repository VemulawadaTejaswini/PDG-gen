import java.util.*;
public class MainC{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int K = sc.nextInt();
    char[][] a = new char[H][W];
    boolean[][] b = new boolean[H][W];
    // Arrays.fill(b, true);
    for (int i=0; i < H; i++) {
      String tmp = sc.next();
      for (int j=0; j < W; j++) {
        a[i][j] = tmp.charAt(j);
        b[i][j] = true;
      }
    }
    int ans = 0;
    for(int i=0; i <Math.pow(2,(H+W));i++){
      int count = 0;
      for(int j=0; j<H; j++){
        if((1&i>>j)==1){
          for(int k=0; k<W; k++){
            b[j][k] = false;
          }
        }
      }
      for(int j=H; j<H+W; j++){
        if((1&i>>j)==1){
          for(int k=0; k<H; k++){
            b[k][j-H] = false;
          }
        }
      }
      for (int i1=0; i1 < H; i1++) {
        for (int j1=0; j1 < W; j1++) {
          if(a[i1][j1] == '#' && b[i1][j1]==true){
              count++;
          }
          b[i1][j1] = true;
        }
      }
      if(count==K){
        ans++;
      }
      // Arrays.fill(b, true);
      // System.out.println("b");

    }
    System.out.println(ans);
  }
}

