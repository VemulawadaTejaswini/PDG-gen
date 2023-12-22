import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long mod=1000000007;
    long a[]=new long[n];
    int k=sc.nextInt();
    ArrayList<Long> pos=new ArrayList<>();
    ArrayList<Long> neg=new ArrayList<>();
    for( int i=0;i<n;i++)
    {
      a[i]=sc.nextLong();
      if(a[i]<0)
      {
        neg.add(a[i]);
      }
      else 
        pos.add(a[i]);
    }
    Collections.sort(neg);
    Collections.sort(pos,Collections.reverseOrder());
    int p=-1;
    int q=-1;
    int count=0;
    while((p+1)<neg.size()&&(q+1)<pos.size())
    {
      if(Math.abs(neg.get(p+1))>Math.abs(pos.get(q+1)))
      {
        count++;
        p++;
      }
      else
      {
        count++;
        q++;
      }
      if(count==k)
      {
        break;
      }
   }
    while((p+1)<neg.size())
    {
       if(count==k)
        break;
      count++;
      p++;
    }
     while((q+1)<pos.size())
    {
       if(count==k)
        break;
      count++;
      q++;
    }
    if(p%2==0)
    {
      if((q+1)<pos.size())
      {
        q++;
        p--;
      }
    }
    long ans=1l;
    for( int i=0;i<=p;i++)
    {
      ans=(ans%mod)*(neg.get(i)%mod);
      ans%=mod;
    }
     for( int i=0;i<=q;i++)
    {
      ans=(ans%mod)*(pos.get(i)%mod);
      ans%=mod;
    }
    
     
     
    
    System.out.println(ans);
  }
}
