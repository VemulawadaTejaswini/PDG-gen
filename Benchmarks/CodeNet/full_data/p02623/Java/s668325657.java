import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int K=sc.nextInt();
    int[] A=new int[N];
    int[] B=new int[M];
    for(int i=0;i<N;i++)
      A[i]=sc.nextInt();
    for(int i=0;i<M;i++)
      B[i]=sc.nextInt();
    int cnt=0;
    int a=0,b=0;
    while(K>=0)
    {
      if(a>=N && b>=M)
        break;
      if(a<N && b<M && A[a]<B[b])
      {
        K-=A[a];
        a++;
      }
      else if(b<M)
      {
        K-=B[b];
        b++;
      }
      else
      {
        K-=A[a];
        a++;
      }
      if(K>=0)
      	cnt++;
    }
    System.out.println(cnt);
  }
}