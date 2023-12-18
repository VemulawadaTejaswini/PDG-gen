import java.utol.*;
public class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    long N=in.nextLong();
    int  a[]=new int[N];int f=0;
    for(i=0;i<N;i++)
    {
      a[i]=in.nextLong();
      
    }
    while(N==1)
    {
      for(i=0;i<N-1;i++)
      {
        f=0;
        a[i]=Math.abs(a[i]-a[i+1]);
        if(a[i]==0)
          f++;
      }
      if(f==N-1)
        break;
      N--;
      
    }
    System.out.println(a[0]);
  }
}