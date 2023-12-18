import java.io.*;
import java.util.*;
class Main
{
  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    String ans=sc.readLine();
    int q=sc.nextInt();
    int k=1,t=0;
    for(int i=0;i<q;i++)
    {
      t=sc.nextInt();
      if(t==1)
        k=k*(-1);
      else
      {
        int f=sc.nextInt()-1;
        if(f==0)f=-1;
        String c=sc.next();
        f=f*k;
      	if(f==1)
          ans=ans+c;
        else
          ans=c+ans;
      }
    }
    if(k==-1)
    {
      StringBuffer sb=new StringBuffer(ans);
      sb.reverse();
    }
    System.out.println(sb);
  }
}