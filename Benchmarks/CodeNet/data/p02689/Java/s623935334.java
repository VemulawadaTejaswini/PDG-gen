import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] H = new int[N];
      boolean[] goodFlg = new boolean[N];
      int[][] routeNum = new int[N][N];
      for(int i = 0; i < N; i++){
        H[i] = sc.nextInt();
        goodFlg[i] = true;
        for(int j = i+1; j < N; j++){
          routeNum[i][j] = 0;
        }
      }
      
      
      // 標高を比較
      for(int i = 0; i < M; i++){
        int A = sc.nextInt()-1;
        int B = sc.nextInt()-1;
        
        if(B < A){
          int tmp = A;
          A = B;
          B = tmp;
        }
        
        routeNum[A][B]++;
        if(routeNum[A][B] == 2){
          goodFlg[A] = false;
          goodFlg[B] = false;
        }
        
        if(H[A] < H[B]){
          goodFlg[A] = false;
        }else if(H[B] < H[A]){
          goodFlg[B] = false;
        }else{
          goodFlg[A] = false;
          goodFlg[B] = false;
        }
      }
      
      // 良い展望台をカウント
      int count = 0;
      for(int i = 0; i < N; i++){
        if(goodFlg[i]){
          count++;
        }
      }
      
      // 出力
      System.out.println(count);
    }
    

}