import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int X =sc.nextInt();
    int N =sc.nextInt();
    int P[] =new int[N];
    int x =1000;
    int q;int r;
    for(int i=0;i<N;i++){
      P[i]=-X+sc.nextInt();}
    Arrays.sort(P);
    for(int j=0;j<N;j++){
      if(P[i]<0){q =-P[i];}
      else{q=P[i];}
      if(q<x){x =q;r=i;}}
    if(P[r]<0){System.out.println(X-q);}
    else{System.out.println(X+q);}
  }
}