import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int Q = sc.nextInt();
      int[][] arr = new int[Q][4];
      for(int i = 0; i < Q; i++){
        for(int j = 0; j < 4; j++){
          arr[i][j] = sc.nextInt();
        }
      }
      
      // スコア計算
      int[] A = new int[N];
      for(int i = 0; i < N; i++){
        A[i] = 1;
      }
      
      boolean endFlg = false;
      int maxScore = 0;
      while(!endFlg){
        int score = calcScore(A, arr, Q);
        
        if(maxScore < score){
          maxScore = score;
        }
        endFlg = arrInc(A,N,M);
      }
      
      // 出力
      System.out.println(maxScore);
    }
    
    // スコア計算を行う関数
    public static int calcScore(int[] A, int[][] arr, int Q){
      int score = 0;
      for(int i = 0; i < Q; i++){
        int a = arr[i][0]-1;
        int b = arr[i][1]-1;
        int c = arr[i][2];
        int d = arr[i][3];
        if(A[b] - A[a] == c){
          score += d;
        }
      }
      return score;
    }
    
    // 数列をインクリメントする関数
    public static boolean arrInc(int[] A, int N, int M){
      boolean endFlg = true;
      for(int i = N-1; i >= 0; i--){
        if(A[i] != M){
          endFlg = false;
          A[i]++;
          for(int j = i+1; j < N; j++){
            A[j] = A[i];
          }
          break;
        }
      }
      
      return endFlg;
    }
    
}