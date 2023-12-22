import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int X =sc.nextInt();
    int N =sc.nextInt();
    int P[] =new int[N];
    int R[] =new int[N];
    int Q[] =new int[100];
    int x=0;
    Q[0]=1;
    for(int j=1;j<100;j++){
      Q[j]=2;}
    for(int i=0;i<N;i++){
      P[i]=sc.nextInt();
      R[i]=Math.abs(P[i]-X);
      Q[R[i]]=Q[R[i]]-1;}
    for(int k=0;k<100;k++){
      if(Q[k]==2){System.out.println(X-k);System.exit(0);}
      if(Q[k]==1){
        for(int l=0;l<N;l++){
          if(P[l]==X+k){x=x+1;}}
        if(x==0){System.out.println(X+k);System.exit(0);}
        else{System.out.println(X-k);System.exit(0);}
      }
    }
  }
}
          
        
