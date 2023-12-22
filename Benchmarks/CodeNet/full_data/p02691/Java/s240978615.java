import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    long A[]=new long[N];
    long B[]=new long[N];
    long C[]=new long[N];
    long x=0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      B[i]=A[i]-i;
      C[i]=-A[i]-i;}
    for(int j=0;j<N;j++){
      for(int k=0;k<j;k++){
        if(B[j]==C[k]){x=x+1;}}}
    System.out.println(x);
  }
}