import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in1 = br.readLine().split(" ");
    int H = Integer.parseInt(in1[0]);
    int W = Integer.parseInt(in1[1]);
    int D = Integer.parseInt(in1[2]);

    int[][] A = new int[H][W];
    int[] x = new int[H*W];
    int[] y = new int[H*W];
    
    for(int i = 0; i < H; i++){
      in1 = br.readLine().split(" ");
      A[i] = Stream.of(in1).mapToInt(Integer::parseInt).toArray();
    }

    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        --A[i][j];
        x[A[i][j]] = i;
        y[A[i][j]] = j;
      }
    }

    in1 = br.readLine().split(" ");
    int Q = Integer.parseInt(in1[0]);

    int[] L = new int[Q];
    int[] R = new int[Q];

    for(int i = 0; i < Q; i++){
      in1 = br.readLine().split(" ");
      L[i] = Integer.parseInt(in1[0]) - 1;
      R[i] = Integer.parseInt(in1[1]) - 1;
    }

    br.close();

    int[] sum = new int[H*W];

    Arrays.fill(sum, 0);

    for(int i = 0; i < D; i++){
      for(int j = i + D; j < H * W; j += D){
        sum[j] = sum[j - D] + Math.abs(x[j] - x[j - D]) + Math.abs(y[j] - y[j - D]);
      }
    }

    for(int i = 0; i < Q; i++){
      System.out.println(sum[R[i]] - sum[L[i]]);
    }
  }
}