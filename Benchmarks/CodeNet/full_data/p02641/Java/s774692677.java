import java.util.*;
public class Main
{
  public static boolean notpresent(int k,int a[])
  {
    int flag=0;
    for(int i=0;i<a.length;i++)
    {if(a[i]==k)
      {
        flag=1;
        break;
      }
    }
    if(flag==0)
      return true;
    else
      return false;
  }
  public static void main(String args[])throws Exception
  {
    try {
    Scanner sc=new Scanner(System.in);
    int x,n,i,d;
      x=sc.nextInt();
      n=sc.nextInt();
      int p[]=new int[n];
      for(i=0;i<n;i++)
        p[i]=sc.nextInt();
      int min,max;
      min=p[0];max=p[0];
      for(i=1;i<n;i++)
      {
        if(p[i]<min)
          min=p[i];
        if(p[i]>max)
          max=p[i];
      }
      d=Math.abs(x-min);
      for(i=min;i<=max;i++)
      {
        if(notpresent(i,p))
        {
          if(Math.abs(x-i)<d)
            d=i;
        }
      }
      System.out.println(d);
           
    } catch(Exception e) { return;
                         } finally {
    }
  }
}
    
