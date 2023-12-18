import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    int A[] =new int[N];
    int B[] =new int[N];
    int C[] =new int[N+1];
    int D[] =new int[N];
    long W[] =new long[N];
    C[0]=0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      B[A[i]-1]=B[A[i]-1]+1;}
    int X=0;
    for(int x=0;x<N;x++){
      if(!(B[x]==0)){X=X+1;}}
    for(int j=0;j<N;j++){
      if(!(D[A[j]-1]==0)){C[j+1]=C[j];continue;}
       D[A[j]-1]=B[A[j]-1]*(B[A[j]-1]-1)/2;
       C[j+1]=C[j]+D[A[j]-1];}
        for(int k=0;k<N;k++){
          long W[k]=C[N]-D[A[k]-1]+(B[A[k]-1]-1)*(B[A[k]-1]-2)/2;
      System.out.println(W[k]);}
  }
}
