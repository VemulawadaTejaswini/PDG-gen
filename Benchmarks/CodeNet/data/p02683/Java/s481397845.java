import java.util.*;

public class Main {
    public static int Min(int arr[]){
      int max = arr[0];
      int min = arr[1];
      for (int i = 1; i < arr.length; i++) {
          int v = arr[i];
          if (v > max) {
              max = v;
          }
          if (v < min) {
              min = v;
          }
      }
      return min;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      int M = Integer.parseInt(sc.next());
      int X = Integer.parseInt(sc.next());
      int[][]A = new int[N][M+1];
      for(int i = 0; i < N; i++){
        for(int j = 0; j < M+1; j++)
        A[i][j] = Integer.parseInt(sc.next());
      }
      int ans = Integer.MAX_VALUE;;
      for(int mask = 0; mask < Math.pow(2,N); mask++){
        int[]C = new int[M];
        int cst = 0;
        for(int i = 0; i < N; i++){
          if(((mask >> i) & 1) == 1){
            cst += A[i][0];
            for(int j = 1; j < M+1; j++){
              C[j - 1] += A[i][j];
            }
          }
        }
        boolean check = true;
  			for(int j = 0; j < M; j++) {
  				if(C[j] < X) {
  					check = false;
  				}
  			}
        if(check){
          ans = Math.min(ans, cst);
        }
      }
      if(ans < Integer.MAX_VALUE){
        System.out.println(ans);
      }
      else{
        System.out.println(-1);
      }

  }
}
