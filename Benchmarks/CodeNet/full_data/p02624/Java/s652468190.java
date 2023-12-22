import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    long res=0;
    for(int i=1;i<=N;i++)
      res+=(long)i*(long)nod(i);
    System.out.println(res);
  }
  public static int nod(int N)
  {
    int cnt=0;
    for(int i=1;i<=Math.sqrt(N);i++)
    {
      if(N%i==0)
      {
        if(i*i==N)
          cnt++;
        else
        	cnt+=2;
      }
    }
    return cnt;
  }
}