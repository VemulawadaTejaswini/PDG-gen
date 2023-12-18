import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    int k=ob.nextInt();
    int h[]=new int[n];
    for(int i=0;i<n;i++)
    {
      h[i]=ob.nextInt();
    }
    for(int j=1;j<=k;j++)
    {
      int max=0;
      for(int i=0;i<n;i++)
      {
        if(h[i]>h[max])
          max=i;
      }
      h[max]=0;
    }
    int c=0;
    for(int i=0;i<n;i++)
    {
      c=c+h[i];
    }
    System.out.println(c);
  }
}
    