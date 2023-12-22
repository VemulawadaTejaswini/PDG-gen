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
    long x =0;
    for(int i=0;i<N;i++){
      H[i]=sc.nextLong();
      C[i]=i;}
    for(int j=0;j<M;j++){
      A[j]=sc.nextInt();
      B[j]=sc.nextInt();
      if(H[A[j]-1]>=H[B[j]-1]){C[B[j]-1]=A[j]-1;}
      else{C[A[j]-1]=B[j]-1;}}
    for(int k=0;k<N;k++){
      if(C[k]==k){x=x+1;}}
    System.out.println(x);
  }
} 