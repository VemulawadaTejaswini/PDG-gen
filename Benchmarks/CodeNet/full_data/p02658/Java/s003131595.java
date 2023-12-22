import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A =new long[N+1];
    A[0]=1;longl;
    for(int i=1;i<N+1;i++){
      l =sc.nextLong();
      A[i]=A[i-1]*l;
      if(A[i]>=1000000000000000000){System.out.println(-1);System.exit(0);}}
    System.out.println(A[N]);
  }
}