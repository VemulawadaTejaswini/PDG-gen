import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] A = new int[n + 1][n + 1];
    int[] vst = new int[n + 1];
    int min;
    vst[1] = 1;

    for(int i = 1;i <= n;i++){
      for(int j = 1;j <= n;j++){
        A[i][j] = sc.nextInt();/*隣接行列の要素 */
      }
    }
    int cnt = 0;
    //vst[0] = 1;
    int d;
      for(int k = 0;k < n;k++){
        min = 2000;
        d = -1;
    for(int i = 1;i <= n;i++){
      if(vst[i] == 1){
      for(int j = 1;j <= n;j++){
        if(A[i][j] < min && A[i][j] > -1 && vst[j] == 0){
          //cnt+=A[i][j];
          min = A[i][j];
          d = j;
        }
      }
    }
  }
    if(d != -1){
      vst[d] = 1;
      cnt+=min;
    }
    if(n == n - 1) break;
  }
   System.out.println(cnt);
 }
}
