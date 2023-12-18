import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long A[] = new long[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();
    }
    int answer = 100;
    int tmp =0;
    for(int i=0;i<N;i++){
      tmp=divcnt(A[i]);
      if(tmp<answer){
        answer=tmp;
      }
    }
    System.out.println(answer);
  }
  
  public static int divcnt(long n){
    int res =0;
    while(n%2==0){
      n=n/2;
      res++;
    }
    return res;
  

  }
}