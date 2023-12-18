import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int i,f=0,k=0;
    int A[]=new int[N-1];
    for(i=0;i<N-1;i++)
    {
      A[i]=in.nextInt();
    }
    for(i=0;i<N-2;i++)
    {
      if(A[i]==A[i+1])
        f++;
      else
      {
        System.out.println(f);k++;f=0;
      }
    }
    for(i=k;i<=N;i++)
      System.out.println(0);
  }
}
      
    
    
    
