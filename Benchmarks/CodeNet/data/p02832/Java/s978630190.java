import java.util.*;
class d
{
  void main()
  {
    Scanner sc=new Scanner(System.in);
    int i,n;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int k=n;
    for(i=0;i<k;i++)
    {
      if(a[i]!=i+1)
      {
        for(int j=i;j<k-1;j++)
          a[j]=a[j+1];
        i=0;
        k--;
      }
    }
    if(k==0)
      System.out.println(-1);
    else
      System.out.println(n-k);
  }
}