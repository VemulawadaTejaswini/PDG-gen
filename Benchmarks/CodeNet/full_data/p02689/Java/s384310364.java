import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M =sc.nextInt();
    long H[] =new long[N];
    int A[] =new int[M];
    int B[] =new int[M];
    int C[] =new int[N];
    int x =0;
    for(int i=0;i<N;i++){
      H[i]=sc.nextLong();}
    for(int j=0;j<M;j++){
      A[j]=sc.nextInt();
      B[j]=sc.nextInt();
      if((C[A[j]-1]==-1)&&(C[B[j]-1]==-1)){continue;}
      else{
      if(H[A[j]-1]>=H[B[j]-1]){
        if(C[B[j]-1]==-1){continue;}
        else{
        C[B[j]-1]=-1;x=x+1;}}
      else{
        if(C[A[j]-1]==-1){continue;}
          C[A[j]-1]=-1;x=x+1;}}}
    System.out.println(N-x);
  }
}