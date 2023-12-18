import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    long A[]=new long[N];
    long B[]=new long[N];
    long C[]=new long[N];
    long D[]=new long[N];
    long E[]=new long[N];
    long x=0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();
      B[i]=A[i]-i;
      C[i]=-A[i]-i;}
    Arrays.sort(B);
    Arrays.sort(C);
    int y=0;int z=0;
    for(int j=1;j<N;j++){
      if(B[j]==B[y]){D[y]=D[y]+1;B[j]=1000000007;}
      else{y=y+j+1;if(z>=N-1){break;}}
      if(C[j]==C[z]){E[z]=E[z]+1;C[j]=1000000007;}
      else{z=z+j+1;if(z>=N-1){break;}}}
    for(int k=0;k<N;k++){
      if(B[k]==1000000007){continue;}
      loop:for(int l=0;l<N;l++){
        if(C[l]==1000000007){continue;}
        else if(B[k]>C[l]){continue;}
        else if(B[k]<C[l]){break loop;}
        else{x=x+(D[k]+1)*(E[l]+1);}}}
    System.out.println(x);
  }
} 