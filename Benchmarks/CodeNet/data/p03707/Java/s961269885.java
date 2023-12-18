import java.util.*;
import java.io.*;

public class Main{

  public static int search(int i, int j, int[][] G, boolean[][] S, int x1, int x2, int y1, int y2){
    if(i < x1-1 || i >= x2 || j < y1-1 || j >= y2 || G[i][j] > 0 || !S[i][j] ){
      return 0;
    } else {
      G[i][j] = 1;

      if(i-1 >= 0 && S[i-1][j]){
        int top = search(i-1, j, G, S, x1, x2, y1, y2);
      }
      if (i+1 < S.length && S[i+1][j]){
        int bottom = search(i+1, j, G, S, x1, x2, y1, y2);
      }

      if(j-1 >= 0 && S[i][j-1]){
        int top = search(i, j-1, G, S, x1, x2, y1, y2);
      }
      if (j+1 < S[i].length && S[i][j+1]){
        int bottom = search(i, j+1, G, S, x1, x2, y1, y2);
      }
      return 1;
    }
  }

  public static void main(String[] args) {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
      String[] NMQ = in.readLine().split(" ");
      int N = Integer.parseInt(NMQ[0]);
      int M = Integer.parseInt(NMQ[1]);
      int Q = Integer.parseInt(NMQ[2]);

      boolean[][] S = new boolean[N][M];
      for(int i = 0; i < N; i++){
        String a =  in.readLine();
        for(int j = 0; j < M; j++){
          if (a.charAt(j) == '1'){
            S[i][j] = true;
          }
        }
      }

      // for (int i = 0; i < N ; i++) {
      //   for (int j = 0; j < M; j++ ) {
      //     System.out.print(G[i][j]+" ");
      //   }
      //   System.out.println();
      // }

      for (int q = 0; q < Q ; q++) {
        String[] a =  in.readLine().split(" ");
        List<Integer> lst = new ArrayList<>();
        int x1 = Integer.parseInt(a[0]);
        int y1 = Integer.parseInt(a[1]);
        int x2 = Integer.parseInt(a[2]);
        int y2 = Integer.parseInt(a[3]);

        int[][] G = new int[N][M];

        int res = 0;

        for(int i = x1 - 1; i < x2; i++){
          for(int j = y1 - 1; j < y2; j++){
            res += search(i, j, G, S, x1, x2, y1, y2);
          }
        }

        System.out.println(res);
      }

    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
