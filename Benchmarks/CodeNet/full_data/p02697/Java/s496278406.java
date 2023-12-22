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
      int n=N/2;
      int k=n/2;
        for(int j=1;j<k+1;j++){
          int D =n+1-j;
          System.out.println(j+" "+D);
        for(int l=1;l<=M-k;l++){
          int E =n+l;
          int F =N+1-l;
        System.out.println(E+" "+F);}
    }}
  }
}