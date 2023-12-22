import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N =sc.nextLong();
    long ans =0;
    int X =sc.nextInt();
    int M =sc.nextInt();
    long A[] =new long[2*M];
    long B[] =new long[M];
    long C[] =new long[M];
    B[0]=M+1;
    A[0]=X;
    long k =0;
    int m =0;
    int c=0;
    if(N<2*M){
      for(int i=1;i<N;i++){
      A[i]=(A[i-1]*A[i-1])%M;
      if(A[i]<0){A[i]=A[i]+M;}
      if(i>1){
      if(A[i]==A[1]){m=i-1;break;}
      else{k=k+A[i];}}
      else{k=k+A[i];}
      }
      ans =k;
      System.out.println(ans+X);
    }
    else{
    for(int i=1;i<2*M;i++){
      A[i]=(A[i-1]*A[i-1])%M;
      if(A[i]<0){A[i]=A[i]+M;}
      int d =(int)A[i];
      if(B[d]==d){
        c=(int)C[d];
        m=i-1;
        break;
      }
      else{B[d]=d;C[d]=i;}
    }
    long w =(N-c+1)/m;
    long ww =(N-c+1)%m;
      for(int i=0;i<=m;i++){
        if(i<c){ans =ans+A[i];}
        else{k =k+A[i];}
      }
      ans =ans+w*k;
    for(int i=1;i<=ww;i++){
      ans =ans+A[c+i-1];
    }
    System.out.println(ans);
    }
  }
}