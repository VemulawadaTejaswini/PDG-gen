import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N+1];
      int[] maxNode = new int[N+1];
      maxNode[0] = 1;
      int result = 0;
      
      for(int i = 0; i < N+1; i++){
        A[i] = sc.nextInt();
        if(i > 0){
          maxNode[i] = (maxNode[i-1] - A[i-1]) * 2;
        }
        if(i < N && maxNode[i] <= A[i]){
          result = -1;
          break;
        }else if(i == N && maxNode[i] < A[i]){
          result = -1;
          break;
        }
      }
      
      //loggerArrayInt("maxNode",maxNode);
      
      if(result != -1){
        // ノード数調整
        if(A[N] < maxNode[N]){
          maxNode[N] = A[N];
          for(int i = N-1; i >= 0; i--){
            if(maxNode[i+1] + A[i] < maxNode[i]){
              maxNode[i] = maxNode[i+1] + A[i];
            }
          }
        }
        
        //loggerArrayInt("maxNode",maxNode);

        // ノード数カウント
        for(int i = 0; i < N+1; i++){
          result += maxNode[i];
        }
      }
      
      // 出力
      System.out.println(result);
    }
    
    // Int型配列変数ロガー関数
    // String name : 変数名
    // int val : 値
    public static void loggerArrayInt(String name, int[] val){
      for(int i = 0; i < val.length; i++){
          System.out.println(name + "[" + i + "] = " + val[i]);
      }
    }
}