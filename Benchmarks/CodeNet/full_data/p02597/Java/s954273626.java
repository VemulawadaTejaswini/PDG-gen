import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] a=new int[n];
    String s=sc.next();
    for(int i=0;i<n;i++)
    {
      char c=s.charAt(i);
      if(c=='W')
      {
        a[i]=1;
      }
      else
      {
        a[i]=0;
      }
    }
    int x=0,y=n-1,c=0;
    while(x<y)
    {
      while(x<n && a[x]==0)
      {
          x++;
      }
      while(y<n && a[y]==1)
      {
        y--;
      }
      if(x<n && y<n && x<y)
      {
      int temp=a[x];
      a[x]=a[y];
      a[y]=temp;
       
      x++;
      y--;
         c++;
      }
     
    }
    System.out.println(c);
  }
}
        