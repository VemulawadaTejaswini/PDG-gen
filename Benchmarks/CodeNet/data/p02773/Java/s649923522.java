import java.util.*;
public class Main
{
  String arr[];
  int ct[];
  int k;
  private int ispres(String s)
  {
    for(int i=0;i<k;i++)
      if(s.equals(arr[i]))
        return i;
    return -1;
  }
  private void readinp()
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),tem=0;
    arr=new String[n];
    ct=new int[n];
    k=0;
    String t;
    sc.nextLine();
    for(int i=0;i<n;i++)
    {
      t=sc.nextLine();
      if((tem=ispres(t))>-1)
        ct[tem]++;
      else
      {
        arr[k]=t;
        ct[k++]++;
      }
    }
  }
  private void selsort()
  {
    readinp();
    int mx,intt;
    String st;
    for(int i=0;i<k-1;i++)
    {
      mx=i;
      for(int j=i+1;j<k;j++)
      {
        if(ct[j]>ct[mx])
          mx=j;
      }
      if(mx!=i)
      {
        intt=ct[i];
        ct[i]=ct[mx];
        ct[mx]=intt;
        st=arr[i];
        arr[i]=arr[mx];
        arr[mx]=st;
      }
    }
  }
  private void disp()
  {
    selsort();
    int l=0;
    while(l<k&&ct[l]==ct[0])l++;
    int mx;
    String st;
    for(int i=0;i<l-1;i++)
    {
      mx=i;
      for(int j=i+1;j<l;j++)
      {
        if(arr[i].compareTo(arr[j])>0)
          mx=j;
      }
      if(mx!=i)
      {
        st=arr[i];
        arr[i]=arr[mx];
        arr[mx]=st;
      }
    }
    for(int i=0;i<l;i++)
        System.out.println(arr[i]);
  }
  public static void main(String[] args)
  {
    Main ob=new Main();
    ob.disp();
  }
}