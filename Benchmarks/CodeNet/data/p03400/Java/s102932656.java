import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int A[] = new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      //i番目の人は結局何個食べたのか
      if(D%A[i]==0){
        X=X+(D/A[i]);//割り切れるなら商の数食べれる
      }else{
        X=X+(1+D/A[i]);//割り切れないなら商+1個
      }
    }
    System.out.println(X);
  }
  

  
}