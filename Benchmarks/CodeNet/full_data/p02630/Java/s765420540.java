import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int[] A=new int[N];
    for(int i=0;i<N;i++) A[i]=s.nextInt();
    int Q=s.nextInt();
    int[][] BC=new int[Q][2];
    for(int i=0;i<Q;i++) for(int j=0;j<2;j++) BC[i][j]=s.nextInt();
	for(int i=0;i<Q;i++){
      int ans=0;
     for(int j=0;j<N;j++){
       if(A[j]==BC[i][0]) A[j]=BC[i][1];
       ans+=A[j];
     }
     System.out.println(ans);
    }

  }  
}