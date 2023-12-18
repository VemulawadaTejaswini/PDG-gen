import java.util.*;
class Main
{
  static class data implements Comparable<data>
  {
    long n;
    long a;
    long b;
    public data(long n,long a,long b)
    {
      this.n=n;
      this.a=a;
      this.b=b;
    }
    public int compareTo(data d)
    {
      if(n>d.n)
      return 1;
      if(n<d.n)
      return -1;
      return 0;
    }
  }
  static class dat
  {
    int a;
    int b;
    long c;
    public dat(int a,int b,long c)
    {
      this.a=a;
      this.b=b;
      this.c=c;
    }
  }
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int q=in.nextInt();
    List<data> li=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      long s=in.nextLong();
      long t=in.nextLong();
      long x=in.nextLong();
      long a=x;
      long start=s-x;
      long end=t-x;
      if(end<0)
      continue;
      if(start<0)
      start=0;
      data d=new data(x,start,end);
      li.add(d);
    }
      long ar[]=new long[q];
      dat arr[]=new dat[q];
      for(int i=0;i<q;i++)
      ar[i]=in.nextLong();
    Collections.sort(li);
    for(data d:li)
    {
      long x=d.n;
      long s=d.a;
      long e=d.b;
      int lo=0;
      int hi=q-1;
      int f=0;
      int t=0;
      while(lo<hi)
      {
        int mid=(lo+hi)/2;
        long v=ar[mid];
        if(v<s)
        lo=mid+1;
        else
        {
          hi=mid;
        }
      }
      if(ar[lo]<s)
      continue;
      else
      f=lo;
      lo=0;
      hi=q-1;
      while(lo<hi)
      {
        int mid=(lo+hi)/2;
        long v=ar[mid];
        if(v>e-1)
        hi=mid-1;
        else if(lo==mid)
        {
          lo=mid+1;
          break;
        }
        else
        lo=mid;
        }
        if(ar[lo]>=e)
        lo--;
        if(ar[lo]>=e)
        continue;
        t=lo;
        while(arr[f]!=null)
        {
          int ee=arr[f].b;
          f=ee+1;
        }
        if(f>=q)
        continue;
        while(arr[t]!=null)
        {
          int ss=arr[t].a;
          t=ss-1;
        }
        if(t<f)
        continue;
        for(int i=f;i<=t;i++)
        arr[i]=new dat(f,t,x);
      }
      StringBuilder sb=new StringBuilder();
      for(dat dd:arr)
      {
        if(dd==null)
        sb.append(-1+" ");
        else
        {
          sb.append(dd.c+" ");
        }
      }
      System.out.println(sb.toString());
    }
  }
