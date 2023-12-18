import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long x[] = new long[N+1];//iが書かれたボールが何個入っているかを管理する配列(i番目がiのボール)
    int A[] = new int[N];//ボールを管理
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      x[A[i]]++;
    }
    //選び方の総数(どれも削らない場合)を算出
    long allCnt=0;
    for(int i=1;i<=N;i++){
      if(x[i]<=1){
        //一個以下なら何もしない
        allCnt=allCnt;
      }else{
        allCnt=allCnt+(x[i]*(x[i]-1))/2;
      }
    }
    
    //あとは総数からそのボールに書かれている数字を引いた数をそれぞれ出力(具体的にはx[A[i]]個減らす)
    for(int i=0;i<N;i++){
      
      System.out.println(Math.max(0,allCnt-x[A[i]]+1));
      

    }
    
  }
  

  
}
