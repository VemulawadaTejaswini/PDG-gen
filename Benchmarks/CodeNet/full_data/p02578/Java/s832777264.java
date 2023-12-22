import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
   Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    long ans=0;
    for(int i=1;i<n;i++)
    {
      ans+=Math.max(0,a[i-1]-a[i]);
      a[i]=Math.max(a[i],a[i-1]);
    }
    System.out.println(ans);
  }
}