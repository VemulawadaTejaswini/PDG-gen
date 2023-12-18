import java.util.*;

class Main{
  public static int max2(int a,int b){
    return (a>b)?a:b;
  }
  
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int N=sc.nextInt();
  int M=sc.nextInt();
  int[] X=new int[M];
  int[] Y=new int[M];
  
  for(int i=0;i<M;i++){
    X[i]=sc.nextInt();
    Y[i]=sc.nextInt();
  }
  
  int[][] Length=new int[N+1][N+1];//Length[i][j]は頂点iから頂点jへの最長のパスの長さ
  
  for(int i=0;i<N+1;i++){
    for(int j=0;j<N+1;j++){
      if(i==j) Length[i][j]=0;
      if(i!=j) Length[i][j]=-1;
    }
  }
  
  for(int k=0;k<M;k++){
    int tmp_start=X[k];
    int tmp_end=Y[k];
    for(int i=0;i<N+1;i++){
      if(Length[i][tmp_start]==-1){
      }else{
        Length[i][tmp_end]=max2(Length[i][tmp_end],Length[i][tmp_start]+1);
      }
    }
  }
    
    int answer=0;
    for(int i=0;i<N+1;i++){
      for(int j=0;j<N+1;j++){
        if(answer<Length[i][j]) answer=Length[i][j];
      }
    }
    
    /*for(int i=0;i<N+1;i++){
      for(int j=0;j<N+1;j++){
        System.out.print(Length[i][j]+" ");
      }
      System.out.println();
    }*/
    
    System.out.print(answer);
    
  }
}