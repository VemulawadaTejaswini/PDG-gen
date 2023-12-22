import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long K = sc.nextLong();
    long A[] = new long[N];
    long B[] = new long[M];
    for(int i=0;i<N;i++){
      A[i] = sc.nextLong();
    }
    for(int i=0;i<M;i++){
      B[i] = sc.nextLong();
    }
    int Aindex = 0;
    int Bindex = 0;
    long sum = 0L;
    int count = 0; 
    while(true){
      
      if(A[Aindex]<=B[Bindex]){
        sum+=A[Aindex];
        if(Aindex<N-1){
          Aindex++;
        }
      }else{
        sum+=B[Bindex];
        if(Bindex<M-1){
          Bindex++;
        }
      }
      
      //System.out.println(Aindex+" "+Bindex+" "+sum);
      if(sum>K||count>=N+M){
        break;
      }else{
        count++;
      }   
    }
    System.out.println(count);
  }
}