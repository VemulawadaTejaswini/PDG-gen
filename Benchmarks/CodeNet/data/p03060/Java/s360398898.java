import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int V[] =new int[2*N];
    int x=0;
    for(int i=0;i<2*N;i++){
      if(i<N){V[i]=sc.nextInt();}
      elseV[i]=V[i-N]-sc.nextInt();
           if(V[i]>0){x=x+V[i];}}}
    System.out.println(x);
  }
}