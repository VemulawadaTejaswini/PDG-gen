import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[][] A = new int[K+1][N];
    for(int i=0; i<N; i++){
      A[0][i] = scanner.nextInt();
    }

    for(int j=0; j<K; j++){
      for(int i=0; i<N; i++){
        int start = i - A[j][i];
        if(start < 0) start = 0;
        int end = i + A[j][i];
        if(end > N-1) end = N-1;
        for (int l=start; l<=end; l++){
          A[j+1][l] ++;
        }
      }
    }
    for(int i=0; i<N; i++){
      System.out.print(A[K][i]+" ");
    }
    scanner.close();
    return;

  }
}