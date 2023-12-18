import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    double m =Math.pow(2,N);int n =(int) m ;
    int M =sc.nextInt();
    long X =sc.nextLong();
    long C[][] =new long[N][M+1];
    for(int i=0;i<N;i++){
      for(int j=0;j<=M;j++){
        C[i][j]=sc.nextLong();}
    }
    long D[] =new long[N];
    long E[] =new long[M+1];
    long x =0;
    long min=5000000000;
    for(int k=0;k<n;k++){
      String K =Integer.toBinaryString(k);
      String R[] =K.split("",0);
      int r =K.length();
      for(int l=0;l<r;l++){
        D[l]=Integer.parseInt(R[l]);
        for(int p=1;p<=M;p++){
          E[p]=E[p]+D[r-l-1]*C[l][p];}
        x=x+D[r-l-1]*C[l][0];}
      for(int q=1;q<=M;q++){
        if(E[q]<X){x=-1;}
      E[q]=0;}
      if(x>0){min =Math.min(x,min);}
      x=0;
    }
    if(min==5000000000){System.out.println(-1);}
    else{System.out.println(min);}
  }
}
