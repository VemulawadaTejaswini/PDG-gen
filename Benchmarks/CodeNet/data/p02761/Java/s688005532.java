import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M =sc.nextInt();
    int S[] =new int[2*M];
    int T[] =new int[M];
    int U[] =new int[M];
    int V[] =new int[3];
    int W[] =new int[M];
    int x =0;
    for(int i =0;i<2*M;i++){
      S[i]=sc.nextInt();}
    for(int j=0;j<M;j++){
      T[j]=S[2*j];
      U[j]=S[2*j+1];}
    for(int k=0;k<M;k++){
      for(int l=0;l<k;l++){
        if(T[l]==T[k]){
          if(!(U[l]==U[k])){System.out.println(-1);
                          System.exit(0);}
          else{W[k]=U[k];}
        }
        else{V[T[k]-1]=U[k];
             if(T[k]==1){ x= x+100;}
             else if(T[k]==2){x=x+10;}
             else{x=x+1;}}
      }
    }
    if(x==111){System.out.println(100*V[0]+10*V[1]+V[2]);}
    else if(x==11){System.out.println(10*V[1]+V[2]);}
    else if(x==101){System.out.println(100*V[0]+V[2]);}
    else if(x==100){System.out.println(100*V[0]);}
    else if(x==110){System.out.println(100*V[0]+10*V[1]);}
    else if(x==10){System.out.println(10*V[1]);}
    else if(x==1){System.out.println(V[2]);}
    else{System.out.println(0);}
  }
}