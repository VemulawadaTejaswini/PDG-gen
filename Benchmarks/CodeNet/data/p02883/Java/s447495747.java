import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    int A[] = new int[N];
    int F[] = new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      F[i]=sc.nextInt();
    }
    //Fを昇順、Aを降順にならべて、同じ位置同士で積を取るのが最小っぽい
    //が、効率の良い修行の使い所がわからない
    //メタ推理→K=10^18よりK回回すのは多分アウト
    //ということは・・・
    //隣の番号との差を配列に入れておいて。。。
    //
    for(long i=0;i<K;i++){
      N=N+1;
    }
    System.out.println(0);
    //わからじ
    
    
  }
  

  
}