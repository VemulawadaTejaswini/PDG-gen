import java.util.*;
class sum
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,n,i,val=0,max=0;
      a=sc.nextInt();
    b=sc.nextInt();
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
      val=(a*i/b)-(a*(i/b));
      if(val>max)
      {
        max=val;
      }
      val=0;
    }
    System.out.println(max);
  }
}
    