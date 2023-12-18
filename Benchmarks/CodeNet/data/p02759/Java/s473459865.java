import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int dataA = new int[N+1];
    int dataB = new int[N+1];
    boolean t = ture;
    for(int i=0;i<M;i++){
      int s = sc.nextInt();
      int c = sc.nextInt();
      if(dataB[s]==0){
        dataA[s]=c;
      }else{
        if(dataA[s] ==c){
          dataB[s]++;
        }else{
          t = false;
          break;
        }
      }
    }
   if(t ==false){
     System.out.print("-1");
   }else{
     for(int i =1 ;i<N+1;i++){
       if(N==1 && dataB[i]){
       System.out.print(0);
       }else if(dataB[i] ==0 && i!=N &&N>1){
         dataA[i]=0;
       }else if(dataB[i] ==0 && i==N){
         dataA[i]=1;
       }
       System.out.print(dataA[i]);
     }
   }
    
  }
}