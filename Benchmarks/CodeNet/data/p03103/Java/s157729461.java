import java.util.*;

public class Energy_Drink_Collector{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int N,M,s,o,tmp,ans;
    int[] A,B,Rank;

    N=sc.nextInt();
    M=sc.nextInt();

    A=new int[N];
    B=new int[N];
    Rank=new int[N];

    for(s=0;s<N;s++){
      A[s]=sc.nextint();
      B[s]=sc.nextint();
    }
    for(s=0;s<N;s++){
      Rank[s]=0;
      for(o=0;o<N;o++){
        if(A[s]>A[o]){
          Rank[s]++;
        }
      }
    }

    for(s=0,ans=0;M!=0;s++){
      for(o=0;o<N;o++){
        if(Rank[o]==s){
          if(M>B[s]){
            ans=ans+A[o]*B[o];
            M-=B[s];
          }else{
            ans=ans+A[o]*M;
            M=0;
          }
        }
      }
    }

    System.out.println(ans);
  }
}
