import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      // 参加人数
	  int N = sc.nextInt();
      // 初期得点
      int K = sc.nextInt();
      // 問題数
      int Q = sc.nextInt();
      // 正解者配列
      int[] A = new int[Q];     
      for(int i=0;i<Q;i++){
        A[i] = sc.nextInt();
      }
      // 参加者のポイントを問題数分減らして格納
      int[] P = new int[N];
      for(int i=0;i<N;i++){
        P[i] = K-Q;
      }
      //正解者にポイントを与える
      for(int i=0;i<Q;i++){
        for(int j=1;j<N+1;j++){
          if(A[i]==j){
            P[j-1]=P[j-1]+1;
          }
        }
      }
      //勝ち残り
      for(int i=0;i<N;i++){
        if(P[i]>0){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
    }
}
      