import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N =sc.nextLong();
    long A[] =new long[1000000];
    long B[] =new long[1000000];
    int t=0;int k=0;double y =0;long x=0;long ans =0;
    if(N ==1){System.out.println(0);}
    else{
    for(long i=2;i<=N;i++){
      if(N%i!=0){continue;}
      else{x=x+1;N=N/i;}}
      System.out.println(x);
    }
  }
}