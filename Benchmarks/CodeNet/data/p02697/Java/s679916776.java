import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M =sc.nextInt();
    if(N%2==1){
    for(int i=1;i<=M;i++){
      int C =N-i+1;
      System.out.println(i+" "+C);}}
    else{
      int n=N%2;
      if(n%2==0){
        for(int j=1;j<n;j++){
          int D =n-j;
          System.out.println(j+" "+D);}
        for(int k=1;k<=M-n+1;k++){
          int E =n+k-1;
          int F =M-k+1;
          System.out.println(E+" "+F);}}
      else{
        for(int l=1;l<=n;l++){
          int G =n-l+1;
          System.out.println(l+" "+G);}
        for(int m=1;m<=M-n+1;m++){
          int H =n+m;
          int I =M-m+1;
          System.out.println(H+" "+I);}}
  }
}
