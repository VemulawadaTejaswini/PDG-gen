import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int M=s.nextInt();
    int K=s.nextInt();
    int[] timeN=new int[N];
    int[] timeM=new int[M];
    for(int i=0;i<N;i++) timeN[i]=s.nextInt();
    for(int i=0;i<M;i++) timeM[i]=s.nextInt();

    int ans=0;
    int Npos=0;
    int Mpos=0;
    for(;Npos<N||Mpos<M;){
      ans+=1;
      if(Npos==N){
        K-=timeM[Mpos];
        Mpos+=1; 
      }
      else if(Mpos==M){
        K-=timeN[Npos];
        Npos+=1;
      }
      else if(timeN[Npos]>timeM[Mpos]){
        K-=timeM[Mpos];
        Mpos+=1;
      }
      else{
        K-=timeN[Npos];
        Npos+=1;
      }
      if(K<=0){
        ans-=1;
        break;
      }
    }

    System.out.println(ans);

  }  
}